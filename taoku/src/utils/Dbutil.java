package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//���߰������������ݿ�������Ͽ�����
public class Dbutil {
	private static final String url = "jdbc:mysql://127.0.0.1:3306/project?charactorEncoding=utf8";
	private static final String user = "root";
	private static final String password = "root";

	static {
		//��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	//�������ݿ�
	public static Connection open() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
	
	//�ر����ݿ�
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
