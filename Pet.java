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
	 * 添加一个宠物
	 * obj:宠物对象
	 * 无返回值
	 */
	public void add(PetInfo obj) {
		String sql = "insert into petinfo values(null, ?, ?, ?, ?, ?, ?);";
		
		try {
			Connection conn = Dbutil.open();
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, obj.getName());
			pst.setString(2, obj.getPicture());
			pst.setString(3, obj.getSort());
			pst.setString(4, obj.getBreed());
			pst.setInt(5, obj.getPrice());
			pst.setString(6, obj.getDescribe());
			
			pst.execute();
			
			Dbutil.close(null, pst, conn);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	/*
	 * 查找数据库，列出所有宠物信息
	 * 返回值：宠物列表
	 */
	public List<PetInfo> listPet() throws SQLException{
		String sql = "select * from petinfo";
		
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		
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
		
		System.out.println(result);
		return result;
	}
	
	/*
	 * 查找数据库，根据分类列出宠物信息
	 * 返回值：宠物列表
	 */
	public List<PetInfo> listPetBySort(String sort) throws SQLException{
		String sql = "select * from petinfo where sort=?";
		
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, sort);
		
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
		
		System.out.println(result);
		return result;
	}
	
	/*
	 * 查找数据库，根据id找某个宠物
	 * 返回值：宠物列表
	 */
	public PetInfo listPetById(int id) throws SQLException{
		String sql = "select * from petinfo where id=?";
		
		Connection conn = Dbutil.open();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, id);
		
		ResultSet rs = pst.executeQuery();// 返回结果集
		PetInfo result = new PetInfo();
		if (rs.next()) {
			result.setId(rs.getInt("id"));
			result.setName(rs.getString("name"));
			result.setPicture(rs.getString("picture"));
			result.setSort(rs.getString("sort"));
			result.setPrice(rs.getInt("price"));
			result.setDescribe(rs.getString("describe"));
			result.setBreed(rs.getString("breed"));
		}
		
		Dbutil.close(rs, pst, conn);
		
		System.out.println(result);
		return result;
	}
}
