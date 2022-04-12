package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Annotation {
	@Test
	public static void Browsr() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();//upcasting
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize(); 

}

}


