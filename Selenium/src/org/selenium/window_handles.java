package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window_handles {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement hostel = driver.findElement(By.xpath("//a[text()='HOSTEL']"));

		Actions ac=new Actions(driver);
		Robot r=new Robot();
		
		ac.contextClick(hostel).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
        ac.contextClick(course).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
       WebElement hostel1 = driver.findElement(By.xpath("//a[text()='HOSTEL']"));
		
        ac.contextClick(hostel1).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> handles = driver.getWindowHandles();
		for (String id : handles) {
			
			String title = driver.switchTo().window(id).getTitle();	
			System.out.println(title);
		}
		
String mytitle="Food & Accommodation Greens Womens Hostel Adyar | Food & Accommodation Greens Womens Hostel Adyar";
           for (String id : handles) {
        	  if(driver.switchTo().window(id).getTitle().equals(mytitle)){
        	  break;
           }
			
		}
	
		}
       }
