package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.PetInfo;
import utils.Dbutil;

public class Pet {
	
	/*
	 * ���һ������
	 * obj:�������
	 * �޷���ֵ
	 */
	public void add(PetInfo obj) {
		String sql = "insert into petinfo values(null, ?, ?, ?, ?, ?, ?, ?);";
		
		try {
			Connection conn = Dbutil.open();
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, obj.getName());
			pst.setString(2, obj.getPicture());
			pst.setString(3, obj.getSort());
			pst.setString(4, obj.getBreed());
			pst.setInt(5, obj.getPrice());
			pst.setString(6, obj.getDescribe());
			pst.setInt(6, obj.getFlag());
			
			pst.execute();
			
			Dbutil.close(null, pst, conn);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	/*
	 * �������ݿ⣬�г����г�����Ϣ
	 * ����ֵ�������б�
	 */
	public List<PetInfo> listPet() throws SQLException{
		String sql = "select * from petinfo";
		
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		
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
			tmp.setFlag(rs.getInt("flag"));
			result.add(tmp);
		}
		
		Dbutil.close(rs, pst, conn);
		
		System.out.println(result);
		return result;
	}
	
	/*
	 * �������ݿ⣬���ݷ����г�������Ϣ��flag=1��չʾ��=0��˵������ȥ�ˣ���չʾ��
	 * ����ֵ�������б�
	 */
	public List<PetInfo> listPetBySort(String sort) throws SQLException{
		String sql = "select * from petinfo where sort=? and flag=1";
		
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, sort);
		
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
			tmp.setFlag(rs.getInt("flag"));
			result.add(tmp);
		}
		
		Dbutil.close(rs, pst, conn);
		
		//System.out.println(result);
		return result;
	}
	
	/*
	 * �������ݿ⣬����id��ĳ������
	 * ����ֵ�������б�
	 */
	public PetInfo listPetById(int id) throws SQLException{
		String sql = "select * from petinfo where id=?";
		
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, id);
		
		ResultSet rs = pst.executeQuery();// ���ؽ����
		PetInfo result = new PetInfo();
		if (rs.next()) {
			result.setId(rs.getInt("id"));
			result.setName(rs.getString("name"));
			result.setPicture(rs.getString("picture"));
			result.setSort(rs.getString("sort"));
			result.setPrice(rs.getInt("price"));
			result.setDescribe(rs.getString("describe"));
			result.setBreed(rs.getString("breed"));
			result.setFlag(rs.getInt("flag"));
		}
		
		Dbutil.close(rs, pst, conn);
		
		//System.out.println(result);
		return result;
	}
	
	/*
	 * �������ݿ⣬����id��ĳ�����Ȼ�����������flag��Ϊ0
	 */
	public void deleteOnePet(int id) throws SQLException{
		//�ҵ���Ӧid�ĳ���
		PetInfo pet = this.listPetById(id);
		//����������flag��Ϊ0
		String sql = "update petinfo set flag=0 where id=?";
		
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, pet.getId());
		
		pst.execute();
		
		
		Dbutil.close(null, pst, conn);
		
	}
}
