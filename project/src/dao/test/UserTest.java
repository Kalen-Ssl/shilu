package dao.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.User;
import pojo.PetInfo;
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
	
	@Test
	public void testAddPetToCart() throws SQLException {
		User dao = new User();
		dao.addPetToCart(1, 1);
	}
	
	@Test
	public void testListPetsInCart() throws SQLException {
		User dao = new User();
		List<PetInfo> result = dao.listPetsInCart(1);
		System.out.println(result);
	}
	
	@Test
	public void testRemoveOnePetInCart() throws SQLException {
		User dao = new User();
		dao.removeOnePetInCart(2, 1);
	}
	
	@Test
	public void testRemoveAllPetInCart() throws SQLException {
		User dao = new User();
		dao.removeAllPetsInCart(2);
	}
	
	@Test
	public void testAddHistory() {
		User dao = new User();
		dao.addHistory(1, 1);
	}
	
	@Test
	public void testShowHistoryInfo() throws SQLException {
		User dao = new User();
		dao.showHistoryInfo(1);
	}

}
