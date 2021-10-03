package com.example.activity.five;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

//import com.example.activity.five.PremiumCustomer;
import java.util.HashMap;

public class AbstractTest {
	
	static PremiumCustomer pc;
	
	@BeforeClass
	public static void setupBeforeClass() throws Exception {
		System.out.println("This runs before any test once");
		pc = new PremiumCustomer();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This runs after the entire test class is finished");
	}
	
	@Before
	public void setup() throws Exception{
		System.out.println("This runs before every test");
	}
	
	@After
	public void tearDown() throws Exception{
		System.out.println("This runs after every test");
	}
	
	@Test
	public void discountPriceTest() {
		System.out.println("85 == pc.discountPrice(100) is: "+ pc.discountPrice(100));
		assertTrue(85.0 == pc.discountPrice(100));
	}
	
	@Test
	public void buyTest() {		
		pc.buy("Aaa", 100);
		pc.buy("Bbb", 200);
		
		HashMap<String, Double> map = new HashMap<>();		 
        map.put("Aaa", 85.0);
        map.put("Bbb", 170.0);        
		assertTrue(map.equals(pc.cartMap));
	}
	
}
