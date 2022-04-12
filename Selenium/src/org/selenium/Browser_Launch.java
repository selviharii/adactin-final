package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                       //drivername //location
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\eclipse-workspace\\Selenium\\Chromedriver\\chromedriver_win32 (3)\\chromedriver.exe");
			//browser launching
			//interface          //class
			WebDriver driver=new ChromeDriver();//upcasting
			driver.get("https://www.ajio.com/");
			driver.manage().window().maximize(); 

		}

	

	}


