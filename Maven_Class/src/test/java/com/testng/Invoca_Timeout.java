package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invoca_Timeout {
	@Test
	public static void child1() {
		System.out.println("im child1");
	}
	
	@Test(invocationCount=3)
	public static void child3() {
		System.out.println("im child3");
	}
	
	@Test(timeOut=500)
	public static void child4() throws InterruptedException {   //fails
		Thread.sleep(600);
		System.out.println("im child4");
	}
	
	@Test(timeOut = 2000)     
	public static void child5() throws InterruptedException {     //pass
		Thread.sleep(1500);
    System.out.println("im child5");
 
	}
	

}
