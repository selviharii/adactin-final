package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concepts {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//WebElement singleclick = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]"));
		//singleclick.click();
		
		
	    //WebElement single = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html']"));//mainpage to frame
	    driver.switchTo().frame("single"); //id
	    WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	    text.sendKeys("singleiframe");
	    driver.switchTo().defaultContent();  //frame to mainpage
	    
	    
	    WebElement multiframe = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
	    multiframe.click();
	    
	    WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	    driver.switchTo().frame(outer);//webelement
	    driver.switchTo().frame(0);         //index
	    WebElement multiple = driver.findElement(By.xpath("//input[@type='text']"));
	    multiple.sendKeys("multipleiframe");
	    
	    driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
	    

	}

}
