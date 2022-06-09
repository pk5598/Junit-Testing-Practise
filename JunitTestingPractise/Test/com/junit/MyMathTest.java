package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void sum_with_3numbers() {
		MyMath myMath=new MyMath();
		int result=myMath.sum(new int[] {1,2,3});
		assertEquals(6, result);
		
	}
	
	@Test
	void sum_with_1numbers() {
		MyMath myMath=new MyMath();
		int result=myMath.sum(new int[] {1});
		assertEquals(10, result);
		
	}

}
