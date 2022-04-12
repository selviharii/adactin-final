package com.testng;

import org.testng.annotations.Test;

public class Groupin {
	@Test(groups="science")
	public static void math() {
		System.out.println("math");
	}
	
	@Test(groups="arts")
	private static void commerce() {
		System.out.println("commerce");
	}
	
	@Test(groups="science")
	public static void csc() {
		System.out.println("computer science");
	}
	
	@Test(groups="arts")
	public static void english() {
		System.out.println("english");
	}
	
	@Test(groups="arts")
	private static void travelandtourism() {
		System.out.println("ttm");
	}
	
	@Test(groups="science")
	private static void physics() {
		System.out.println("physics");
	}

}
