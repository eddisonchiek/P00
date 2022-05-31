import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public final void testAdd() {
		//fail("Not yet implemented");
		
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals ("",expected, actual);
	}
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	@Test
	public final void testMultiply() {
		int a = 1234;
		int b = 5;
		Calculator cal = new Calculator();
		int actual= cal.multiply(a, b);
		int expected = 6170;
		assertEquals(actual, expected);
	}
	@Test
	public final void testDivide() {
		int a = 1000;
		int b = 5;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 200;
		assertEquals(actual,expected);
	}
	@Test
	public final void testAddError() {
		int a = -10;
		int b = 10000;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		String expected = "Error!";
		assertNotEquals (expected, actual);
		
	}
	@Test
	public final void testSubtractError() {
		int a = -10;
		int b = 10000;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		String expected = "Error!";
		assertNotEquals (expected, actual);
		
	}
	@Test
	public final void testMultiplyError() {
		int a = -10;
		int b = 10000;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		String expected = "Error!";
		assertNotEquals (expected, actual);
		
	}
	@Test
	public final void testDivisionError() {
		int a = -10;
		int b = 10000;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		String expected = "Error!";
		assertNotEquals (expected, actual);
		
	}
	@Test
	public final void testAddboundary() {
		int a = 0;
		int b = 0;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}
	@Test
	public final void testSubtractboundary() {
		int a = 0;
		int b = 0;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}
	@Test
	public final void testMultiplyboundary() {
		int a = 0;
		int b = 0;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}
	@Test
	public final void testDivisionboundary() {
		int a = 0;
		int b = 0;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}

}
