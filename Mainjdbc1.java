package jdbc;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.*;

public class Mainjdbc1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、获取驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/java000?useSSL=false";
        String username = "root";
        String password = "root";
        //2、获取连接
        Connection connection = DriverManager.getConnection(url,username,password);
        //3、获取语句
        Statement statement=connection.createStatement();
        //4、执行语句
        String sql="show tables";
        ResultSet resultSet = null;
        resultSet=statement.executeQuery(sql);
        if(resultSet.next()){
            String str=resultSet.getString(1);
            System.out.println(str);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
