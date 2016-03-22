package simplon.formation.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import simplon.formation.Hello;
import simplon.formation.Helloimpl;
import simplon.formation.holidaysHelper;

public class HelloimplTest {

	private Hello hello;

	@Before
	public void setup() {
		hello = new Helloimpl();
	}
	
	@BeforeClass
	public static void beforeAllTest(){
		System.out.println("     beforeAllTest");
	}

	@Test
	public void test() {

		String result = hello.hello("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void helloShouldThrowAnException_For_NameIsNull() {
		hello.hello(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void helloShouldThrowAnException_For_NameIsBlank() {
		hello.hello("");
	}
	
	@Test
	public void test_easterDay_in_2016_is_april_2014() throws Exception{
		//Given
		int year = 2016;
		LocalDate easterDayExpected = LocalDate.of(2016, Month.MARCH, 27);
		
		//When
		LocalDate easterDayActual = holidaysHelper.identifyEasterDay(year);
		
		//Then
		assertEquals(easterDayExpected, easterDayActual);
		System.out.println(easterDayActual);
	}
	
	
	

	@After
	public void teardown(){
		System.out.println("teardown");
		hello=null;
	}
	
	@AfterClass
	public static void afterAllTest(){
		System.out.println("     afterAllTest");
	}
}
