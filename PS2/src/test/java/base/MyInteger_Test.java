package base;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	public static MyInteger obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj = new MyInteger(9);
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertFalse(obj.isEven());
		assertTrue(obj.isOdd());
		assertFalse(obj.isPrime());
		assertTrue(obj.equals(9));
		assertFalse(obj.equals(10));
		assertTrue(obj.equals(obj));
	}

}

