package ro.ase.csie.cts.g1093.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1093.testing.exceptions.WrongAgeExceptions;
import ro.ase.csie.cts.g1093.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1093.testing.models.Student;

public class TestStudent {

	static Student student;
	static ArrayList<Integer> grades;
	static String initiaLName;
	static int initialAge;
	
	
	
	
			
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ArrayList<Integer> grades=new ArrayList<>();
		grades.add(9);
		grades.add(10);
		grades.add(8);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		grades.clear();
		grades=null;
	}

	@Before
	public void setUp() throws Exception {
		 student=new Student("John",21,grades);
	}

	@After
	public void tearDown() throws Exception {
		student=null;
		
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testSetNameConformanceForRightInput() throws WrongNameException {
		
		String newName="John Doe";
		student.setName(newName);
		
		assertEquals("Testing with a proper name",newName,student.getName());
		
	}
	
	
	@Test
	public void TestSetAgeConformanceForRightInput() {
		int newAge = initialAge + 1;
		try {
			student.setAge(newAge);
			assertEquals("Testing for right age value", newAge, student.getAge());
		} catch (WrongAgeExceptions e) {
			fail("We got an exception for right data");
		}
	}
	
	@Test
	public void testSetAgeErrorConditionNegativeValue() {
		int newAge=initialAge*-1;
		try {
			student.setAge(newAge);
			fail("We didnt got the exception");
		} catch (WrongAgeExceptions e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testSetNameErrorCondition() {
		String newName = "Io";
		try {
			student.setName(newName);
			fail("We didn't got the exception");
		} catch (WrongNameException e) {
			assertTrue(true);
		}
	}
}
