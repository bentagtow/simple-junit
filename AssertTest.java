package com.in28minutes.junit;

//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		assertEquals(1, 1);
		//lots of different args for assertEquals
		
		assertTrue(true);
		
		assertFalse(false);
		
		assertNull(null);
		
		
	}
	


}
