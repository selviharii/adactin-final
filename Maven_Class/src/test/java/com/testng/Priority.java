package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=-1)
	public static void amazon() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 System.out.println("im amazon");
	 }
	//@Test(enabled=false)
	@Ignore
	public static void flipkart() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 System.out.println("im flipkart");
	 }
	@Test(priority=0)
	public static void nykaa() {
		System.out.println("im nykaa");
	}
	@Test(priority=1)
	public static void max() {
		System.out.println("im max");
	}
	
	

}
