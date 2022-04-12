package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Softassert {

	
	@Test
	public static void asse() {
		
		String actual="arjun";
		String expected="arjun";
		
		//hardassert=validation
		Assert.assertEquals(actual, expected);
		//Assert.assertNotEquals(actual, expected)
	}

		
		//softassert=verification
		
		@Test
		public static void soft() {
			String actual="anand";
			String expected="ANAND";
		
		
		SoftAssert soft=new SoftAssert();
		//soft.assertEquals(actual, expected);
		
		soft.assertNotEquals(actual, expected);
		
		}
	}

