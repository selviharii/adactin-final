package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement { //using xpath

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
        driver.manage().window().maximize();
       WebElement userid = driver.findElement(By.xpath("//input[@type='text']"));
       boolean displayed = userid.isDisplayed();
       System.out.println("it is displayed or not="+displayed);
       userid.sendKeys("selvir30@yahoo.com");
       WebElement click = driver.findElement(By.xpath("//input[@id='login-signin']"));
       click.click();
       driver.close();
       
       
       
    
       
       
        
	}

}
