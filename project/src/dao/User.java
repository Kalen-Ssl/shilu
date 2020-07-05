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
	 * 形参为一个UserInfo对象，一定要包括姓名和密码
	 * 从数据库查找用户
	 * 用于用户登陆
	 * 返回值为一个UserInfo对象
	 */
	public UserInfo findUser(UserInfo user) throws SQLException {
		//条件查找
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
	
	
	/*形参为一个UserInfo对象
	 * 添加用户
	 * 用于新用户注册
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
	
	/*形参为一个UserInfo对象
	 * 用户把一个宠物加入到购物车（能看到的宠物flag都为1，无需判断）
	 * 用于新用户注册
	 */
	public void addPetToCart(int uid, int pid) throws SQLException {	
		String sql = "insert into cartinfo values(?, ?)";

		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, uid);
		pst.setInt(2, pid);
		pst.execute();
		System.out.println("添加成功");
		Dbutil.close(null, pst, conn);

	}
	
	/*
	 * 查找数据库，根据用户uid列出对应的购物车中的所有宠物信息（能看到的宠物flag都为1，无需判断）
	 * 返回值：宠物信息列表
	 */
	public List<PetInfo> listPetsInCart(int uid) throws SQLException{
		String sql = "select * from petinfo where petinfo.id in (select pid from cartinfo where uid = ?)";
		
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, uid);
		
		ResultSet rs = pst.executeQuery();// 返回结果集
		List<PetInfo> result = new ArrayList<PetInfo>();
		while (rs.next()) {
			//将每条记录的每个字段保存为PetInfo对象
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
	 * 查找数据库，根据用户uid和宠物pid把对应的购物车中的一条记录删掉（能看到的宠物flag都为1，无需判断）
	 * 无返回值
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
	 * 清空购物车
	 * 查找数据库，根据用户uid把对应的购物车中的相应记录全部删掉（能看到的宠物flag都为1，无需判断）
	 * 无返回值
	 */
	public void removeAllPetsInCart(int uid) throws SQLException{
		String sql = "delete from cartinfo where uid=?";
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, uid);
		
		pst.execute();

		Dbutil.close(null, pst, conn);
	}
	
	/*形参是用户id和宠物id
	 * 添加用户的购买历史记录
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
	
	
	/*形参是用户id
	 * 返回历史记录对象列表(按时间降序排列)
	 */
	public List<HistoryInfo> showHistoryInfo(int uid) throws SQLException {	
		String sql = "select petinfo.*, historyinfo.time from petinfo, historyinfo where petinfo.id=historyinfo.pid and historyinfo.uid=? order by historyinfo.time desc;";
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, uid);
			
		
		ResultSet rs = pst.executeQuery();// 返回结果集
		//System.out.println(rs);
		List<HistoryInfo> result = new ArrayList<HistoryInfo>();
		
		//Timestamp转化为String，借助SimpleDateFormat类来格式化时间
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while (rs.next()) {
			//将每条记录的每个字段保存为HistoryInfo对象
			HistoryInfo tmp = new HistoryInfo();
			tmp.setPicture(rs.getString("picture"));
			tmp.setName(rs.getString("name"));
			tmp.setBreed(rs.getString("breed"));
			tmp.setPrice(rs.getShort("price"));
			//调用df.format方法，把Timestamp类型转化为字符串类型
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
