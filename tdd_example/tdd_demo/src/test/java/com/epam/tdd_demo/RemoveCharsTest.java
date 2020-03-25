package com.epam.tdd_demo;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RemoveCharsTest {
	
	RemoveFirst2Chars obj;
	
	@BeforeEach
	void setUp() {
		obj = new RemoveFirst2Chars();
	}

	@Test
	public void test2chars() {
		String actual = obj.remove("BB");
		assertEquals("BB", actual);  
	}
	
	@Test
	public void test1char() {
		String actual = obj.remove("B");
		assertEquals("B", actual);
	}
	
	@Test
	public void testNchars() {
		String actual = obj.remove("AABAA");
		assertEquals("BAA", actual);
	}
	
	@Test
	public void testEmptychar() {
		String actual = obj.remove("");
		assertEquals("", actual);
	}

}
