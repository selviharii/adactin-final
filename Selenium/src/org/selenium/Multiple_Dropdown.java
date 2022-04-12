package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Dropdown.html");
        driver.manage().window().maximize();
        WebElement mul = driver.findElement(By.xpath("(//select)[6]"));
        Select s=new Select(mul);
        boolean multiple = s.isMultiple();
        System.out.println(multiple);
        
        
        s.selectByIndex(2);
        s.selectByValue("1");
        s.selectByVisibleText("Loadrunner");
        
        
        //deselct()
        s.deselectByValue("2");
        
        //getoptions
        List<WebElement> options = s.getOptions();
        for (WebElement all : options) {
        	String text = all.getText();
        	System.out.println(text);
			}
        
        //getallselectedoptios
        List<WebElement>selected = s.getAllSelectedOptions();
        for (WebElement select : selected) {
        	String text1 = select.getText();
        	System.out.println(text1);
			}
         
        //getfirstselectedoption
        WebElement first = s.getFirstSelectedOption();
        String text2 = first.getText();
        System.out.println(text2);
        
	    
	    //deselectall
	   s.deselectAll();
	}

}
