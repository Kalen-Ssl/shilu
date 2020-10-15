package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
