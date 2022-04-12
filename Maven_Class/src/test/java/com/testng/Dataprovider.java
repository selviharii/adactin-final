package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@DataProvider
	public static Object[][] login() {
		return new Object[][] {
			{"selviharish","vihaan1234"},
			{"selviharish","vihaan1"}
		
		};
	}
	
	@Test(dataProvider="login")
	private static void dp (String un,String pw) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//upcasting
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.id("username"));
        name.sendKeys(un);
        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys(pw);
        WebElement login = driver.findElement(By.id("login"));
        login.click();

	}
	
	
	
	
	
	
	
	
	
	
}