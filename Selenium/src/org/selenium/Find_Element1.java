package org.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement mail = driver.findElement(By.id("email"));
		boolean displayed = mail.isDisplayed();
		System.out.println("whether it is displayed or not="+displayed);
		mail.sendKeys("Harizvar@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("selvi1992$");
		WebElement login = driver.findElement(By.name("login"));
		boolean enabled = login.isEnabled();
		System.out.println("whether it is enabled or not="+enabled);
		login.click();
		
		
		
		

	}

}
