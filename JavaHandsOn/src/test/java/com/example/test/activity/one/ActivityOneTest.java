package com.example.test.activity.one;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.activity.one.Foo;

public class ActivityOneTest {
	
	@Test
	public void testNoArgs() {
		Foo f = new Foo();
		assertEquals(f.bar, "bar");
	}
	
	@Test
	public void oneArgTest() {
		Foo f = new Foo("test");
		assertEquals(f.bar, "test");
	}
	
	@Test
	public void methodTest() {
		Class foo = Foo.class;
		try {
			foo.getDeclaredMethod("printBar", null);
		}
		catch(NoSuchMethodException e) {
			fail("Method does not exist");
		}
		
	}

}
