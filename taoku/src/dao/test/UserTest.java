package dao.test;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import dao.User;
import pojo.UserInfo;

public class UserTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindUser() throws SQLException {
		User dao = new User();
		UserInfo u = new UserInfo();
		
		u.setName("admin");		
		u.setPasswd("123456");
		
		UserInfo user = dao.findUser(u);
		System.out.println(user);
	}

	@Test
	public void testAdd() {
		User dao = new User();
		UserInfo u = new UserInfo();
		u.setName("admin");
		u.setPasswd("123");
		u.setPhone("15266664268");
		u.setEmail("zs@163.com");
		dao.add(u);
	}

}
