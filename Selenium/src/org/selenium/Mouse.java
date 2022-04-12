package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		//driver.get("http://www.leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));
		Actions ac=new Actions(driver);
		//ac.clickAndHold(src).moveToElement(des).build().perform();
	    ac.dragAndDrop(src, des).build().perform();
		//ac.dragAndDropBy(src, 120, 60).build().perform();
		
	    //ac.dragAndDropBy(src, 20, 50).build().perform();  for drag url
	   
	    
	    driver.navigate().to("https://www.amazon.in/");
	    WebElement acc = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	    ac.contextClick(acc).build().perform();  //rightclick
			}
	

}
