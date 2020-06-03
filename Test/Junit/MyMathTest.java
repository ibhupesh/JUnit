package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@BeforeClass 
	public static void beforeclass() {
		System.out.println("Before Class");
	}
	
	@Before 
	public  void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("Afer");
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("Afer Class");
	}
	@Test
	public void testwith3() {
		MyMath myMath= new MyMath();
		int r= myMath.sum(new int[] {1,2,3});
		assertEquals(6,r);
	}
	@Test
	public void testwith4() {
		MyMath myMath= new MyMath();
		assertEquals(18,myMath.sum(new int[] {12,1,2,3}));
	}

}
