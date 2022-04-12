package com.testng;

import org.testng.annotations.Test;

public class Exception {
	@Test(expectedExceptions=Exception.class)
	public static void aa() {
		int a=14;
		System.out.println(a/0);//arithmetic exception
		
		String b=null;
		
	System.out.println(b.length());//nullpointerexception
	}

}
