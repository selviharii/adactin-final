package com.testng;

import org.testng.annotations.Test;

public class Dependency {
	@Test
	public static void emp_name() {
		System.out.println("name is"+" "+"vihaan");
	}
	@Test(dependsOnMethods ="emp_name")
	public static void emp_id() {
		System.out.println("id is"+"1234");
	}
	@Test(dependsOnMethods="emp_name")
	public static void emp_salary() {
		System.out.println("salary is"+" "+"50000");
	}

}
