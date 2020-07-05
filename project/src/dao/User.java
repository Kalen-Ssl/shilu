package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import pojo.HistoryInfo;
import pojo.PetInfo;
import pojo.UserInfo;
import utils.Dbutil;

public class User {
	
	/*
	 * �β�Ϊһ��UserInfo����һ��Ҫ��������������
	 * �����ݿ�����û�
	 * �����û���½
	 * ����ֵΪһ��UserInfo����
	 */
	public UserInfo findUser(UserInfo user) throws SQLException {
		//��������
		String sql = "select * from userinfo where name=? and passwd=?";
		
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getPasswd());
		ResultSet set = pst.executeQuery();
		UserInfo u = null;
		if(set.next()) {
			u = new UserInfo();
			u.setId(set.getInt(1));
			u.setName(set.getString(2));
			u.setPasswd(set.getString(3));
			u.setPhone(set.getString(4));
			u.setEmail(set.getString(5));
		}			
		Dbutil.close(null, pst, conn);
		return u;

	}
	
	
	/*�β�Ϊһ��UserInfo����
	 * ����û�
	 * �������û�ע��
	 */
	public void add(UserInfo user) {	
		String sql = "insert into userinfo values(null,?,?,?,?)";
		try {
			Connection conn = Dbutil.open();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, user.getName());
			pst.setString(2, user.getPasswd());
			pst.setString(3, user.getPhone());
			pst.setString(4, user.getEmail());
			pst.execute();
			Dbutil.close(null, pst, conn);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	/*�β�Ϊһ��UserInfo����
	 * �û���һ��������뵽���ﳵ���ܿ����ĳ���flag��Ϊ1�������жϣ�
	 * �������û�ע��
	 */
	public void addPetToCart(int uid, int pid) throws SQLException {	
		String sql = "insert into cartinfo values(?, ?)";

		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, uid);
		pst.setInt(2, pid);
		pst.execute();
		System.out.println("��ӳɹ�");
		Dbutil.close(null, pst, conn);

	}
	
	/*
	 * �������ݿ⣬�����û�uid�г���Ӧ�Ĺ��ﳵ�е����г�����Ϣ���ܿ����ĳ���flag��Ϊ1�������жϣ�
	 * ����ֵ��������Ϣ�б�
	 */
	public List<PetInfo> listPetsInCart(int uid) throws SQLException{
		String sql = "select * from petinfo where petinfo.id in (select pid from cartinfo where uid = ?)";
		
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, uid);
		
		ResultSet rs = pst.executeQuery();// ���ؽ����
		List<PetInfo> result = new ArrayList<PetInfo>();
		while (rs.next()) {
			//��ÿ����¼��ÿ���ֶα���ΪPetInfo����
			PetInfo tmp = new PetInfo();
			tmp.setId(rs.getInt("id"));
			tmp.setName(rs.getString("name"));
			tmp.setPicture(rs.getString("picture"));
			tmp.setSort(rs.getString("sort"));
			tmp.setPrice(rs.getInt("price"));
			tmp.setDescribe(rs.getString("describe"));
			tmp.setBreed(rs.getString("breed"));
			result.add(tmp);
		}
		
		Dbutil.close(rs, pst, conn);
		
		//System.out.println(result);
		return result;
	}
	
	/*
	 * �������ݿ⣬�����û�uid�ͳ���pid�Ѷ�Ӧ�Ĺ��ﳵ�е�һ����¼ɾ�����ܿ����ĳ���flag��Ϊ1�������жϣ�
	 * �޷���ֵ
	 */
	public void removeOnePetInCart(int uid, int pid) throws SQLException{
		String sql = "delete from cartinfo where uid=? and pid=?";
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, uid);
		pst.setInt(2, pid);
		
		pst.execute();

		Dbutil.close(null, pst, conn);
	}
	
	/*
	 * ��չ��ﳵ
	 * �������ݿ⣬�����û�uid�Ѷ�Ӧ�Ĺ��ﳵ�е���Ӧ��¼ȫ��ɾ�����ܿ����ĳ���flag��Ϊ1�������жϣ�
	 * �޷���ֵ
	 */
	public void removeAllPetsInCart(int uid) throws SQLException{
		String sql = "delete from cartinfo where uid=?";
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, uid);
		
		pst.execute();

		Dbutil.close(null, pst, conn);
	}
	
	/*�β����û�id�ͳ���id
	 * ����û��Ĺ�����ʷ��¼
	 */
	public void addHistory(int uid, int pid) {	
		String sql = "insert into historyinfo values(?, ?, NOW());";
		try {
			Connection conn = Dbutil.open();
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, pid);
			
			pst.execute();
			Dbutil.close(null, pst, conn);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	/*�β����û�id
	 * ������ʷ��¼�����б�(��ʱ�併������)
	 */
	public List<HistoryInfo> showHistoryInfo(int uid) throws SQLException {	
		String sql = "select petinfo.*, historyinfo.time from petinfo, historyinfo where petinfo.id=historyinfo.pid and historyinfo.uid=? order by historyinfo.time desc;";
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, uid);
			
		
		ResultSet rs = pst.executeQuery();// ���ؽ����
		//System.out.println(rs);
		List<HistoryInfo> result = new ArrayList<HistoryInfo>();
		
		//Timestampת��ΪString������SimpleDateFormat������ʽ��ʱ��
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while (rs.next()) {
			//��ÿ����¼��ÿ���ֶα���ΪHistoryInfo����
			HistoryInfo tmp = new HistoryInfo();
			tmp.setPicture(rs.getString("picture"));
			tmp.setName(rs.getString("name"));
			tmp.setBreed(rs.getString("breed"));
			tmp.setPrice(rs.getShort("price"));
			//����df.format��������Timestamp����ת��Ϊ�ַ�������
			tmp.setTime(df.format(rs.getTimestamp("time")));
			System.out.println("time = " + tmp.getTime());
			//Date d = rs.getTimestamp(1);
			//System.out.println(d);
			result.add(tmp);
		}
	
		Dbutil.close(rs, pst, conn);
		
		System.out.println(result);
		return result;
		
	}
}
