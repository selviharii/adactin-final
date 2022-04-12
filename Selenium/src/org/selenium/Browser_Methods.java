package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver_win32 (3)\\chromedriver.exe");
		//browser launching
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");//url launchin
		driver.manage().window().maximize();
		//String title = driver.getTitle();
		//System.out.println(title);
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		driver.navigate().to("https://www.nykaa.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//close()
		//driver.close();

	}

}
