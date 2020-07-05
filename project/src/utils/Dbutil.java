package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//工具包，用于与数据库连接与断开连接
public class Dbutil {
	private static final String url = "jdbc:mysql://127.0.0.1:3306/project?charactorEncoding=utf8";
	private static final String user = "root";
	private static final String password = "root";

	static {
		//加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	//连接数据库
	public static Connection open() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
	
	//关闭数据库
	public static void close(ResultSet set, Statement st, Connection conn) {
		try {
			if (set != null) {
				set.close();
			}
			if (st != null) {
				st.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
