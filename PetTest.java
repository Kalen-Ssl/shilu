package dao.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dao.Pet;
import pojo.PetInfo;

public class PetTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		PetInfo pet = new PetInfo();
		pet.setName("neko");
		pet.setPicture(".jpg");
		pet.setSort("miao~");
		pet.setPrice(233);
		pet.setDescribe("a great cat!");
		pet.setBreed("water cat");
		Pet dao = new Pet();
		dao.add(pet);
	}
	
	@Test
	public void testListPet() throws SQLException {
		Pet dao = new Pet();
		List<PetInfo> result = dao.listPet();
		System.out.println(result);
	}
	
	@Test
	public void testListPetBySort() throws SQLException {
		Pet dao = new Pet();
		List<PetInfo> result = dao.listPetBySort("dog");
		System.out.println(result);
	}
	
	@Test
	public void testListPetById() throws SQLException {
		Pet dao = new Pet();
		PetInfo result = dao.listPetById(1);
		System.out.println(result);
	}
	
	@Test
	public void testDeleteOnePet() throws SQLException {
		Pet dao = new Pet();
		dao.deleteOnePet(1);
	}

}
