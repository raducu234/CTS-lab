package ro.ase.csie.cts.g1093.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1093.testing.exceptions.WrongAgeExceptions;
import ro.ase.csie.cts.g1093.testing.exceptions.WrongGradeException;
import ro.ase.csie.cts.g1093.testing.models.Student;
import ro.ase.csie.cts.g1093.testing.tests.categories.ImportantTests;
import ro.ase.csie.cts.g1093.testing.tests.categories.PerformanceTest;

public class TestStudentNewTests {

	//test fixture
	static Student student;
	static ArrayList<Integer> grades;
	static String initialName;
	static int initialAge;
	static int initialNoGrades;
	
	
	
	static ArrayList<Integer> performanceGrades;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		initialName="John Doe";
		initialAge=Student.MIN_AGE+1;
		initialNoGrades=3;
				grades=new ArrayList<>();
		Random random=new Random();
		
		for(int i=0; i<initialNoGrades;i++) {
			grades.add(random.nextInt(Student.MAX_GRADE)+1);
		}
		
		
		performanceGrades=new ArrayList<>();
		for(int i=0;i<noGrades;i++) {
			performanceGrades.add(random.nextInt(i));
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student= new Student(initialName,initialAge,grades);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetAgeRange() throws WrongAgeExceptions {
		int newAge=Integer.MAX_VALUE;
		student.setAge(newAge);
	}
	@Test(expected=WrongAgeExceptions.class)
		public void testSetAgeRangeMaxValue()throws WrongAgeExceptions{
		int newAge=Integer.MAX_VALUE;
		student.setAge(newAge);
		}
	
	public void testSetAgeBoundaryLowLimit() throws WrongAgeExceptions {
		int newAge=Student.MIN_AGE;
		student.setAge(newAge);
		assertEquals("Testing with the age lower limit",newAge,student.getAge());
	}

	public void testSetAgeBoundaryUpperLimit() throws WrongAgeExceptions {
		int newAge=Student.MAX_AGE;
		student.setAge(newAge);
		assertEquals("Testing with the age UPPER limit",newAge,student.getAge());
	}
	@Category(ImportantTests.class)
	@Test
	public void testSetGradesReferenceDeepCopy() throws WrongGradeException {
		int[] grades=new int[] {9,9,10};
		ArrayList<Integer> refGrades=(ArrayList<Integer>) Arrays.asList(9,9,10);
		for(int grade :grades)
			refGrades.add(grade);
		
		student.setGrades(refGrades);
		
		refGrades.set(0, 5);
		
		int[] studentGrades=new int[student.getNoGrades()];
		for(int i=0;i<student.getNoGrades();i++) {
			studentGrades[i]=student.getGrade(i);
		}
		
		assertArrayEquals("We do shallow copy ", grades,studentGrades);
	}
	
	@Test
	public void testGetGradesAveragePerformance() throws WrongGradeException {
		ArrayList<Integer>grades=new ArrayList<>();
		int noGrades= (int)1e6;
		Random random=new Random();
		for(int i=0;i<noGrades;i++) {
			grades.add(random.nextInt(Student.MAX_GRADE)+1);
			
		}
		student.setGrades(grades);
		
		long tStart=System.currentTimeMillis();
		student.getGradesAverage();
		long
		tFinal=System.currentTimeMillis();
		long delta=tFinal-tStart;
		long performanceLimit=10;
		if(delta <= performanceLimit)
		{
			assertTrue(true);
		}
		else {
			fail("Takes too long");
		}
	}
	
	@Test(timeout=12)
	public void testGetGradesAveragePerformance2() {
		student.setGrades((performanceGrades);
		student.getGradesAverage();
	}
	
	@Test
	public void testSetAgeInverse() throws WrongAgeExceptions {
		int newAge=initialAge+1;
		student.setAge(newAge);
	
		
		
		assertNotEquals("SetAge is not changing the age value",initialAge,student.newAge);
	}
	
	@Test
	public void testGetMinGradeInvers() throws WrongGradeException {
		ArrayList<Integer> grades=new ArrayList<>();
		student.setGrades(performanceGrades);
		int minGrade=student.getMinGrade();
		for( int grade:grades) {
			if(minGrade>grade) {
				fail("The value is not minimum");
			}
		}
	}
	
	@Test 
	public void testGetMinCrossCheck() throws WrongGradeException {
		student.setGrades(performanceGrades);
		
		int expectedMin=Collections.min(performanceGrades);
		int computedMin=student.getMinGrade();
		
		assertEquals("Min is n ot correct" ,expectedMin ,computedMin); 
	}
}
