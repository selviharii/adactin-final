package org.selenium;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {

	public static void main(String[] args)  throws IOException { 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		TakesScreenshot TS=(TakesScreenshot)driver;
		File src = TS.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\screenshot\\firstcry.png");
		FileUtils.copyFile(src,des);

	}

}
