package com.browser;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Bowser_Launch {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize(); 
			
			}
}
