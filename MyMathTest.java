package com.in28minutes.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}

	@After
	void sumWithThreeNumbers() {
		//check that result is 6
		//check result == 6
		System.out.println("Test 1");

		
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	@Test
	void sumWithOneNumber(){
		System.out.println("Test 2");

		assertEquals(3, myMath.sum(new int[] { 3 }));
	}
	
	
}
