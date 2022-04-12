package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrizedtest {
	
	@Test
	@Parameters("p1")
	private static void emp_Name(String name) {
		System.out.println("Name="+name);
		}
	
	@Test
	@Parameters("p2")
	private static void emp_Age(int a) {
		System.out.println("Age="+a);
		
	}
	
	@Test
	@Parameters({"p3","p4"})
	public static void emp_Details(String companyname,int salary) {
		System.out.println("companyname="+companyname);
		System.out.println("Salary="+salary);
	}

}
