package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();

		WebElement alertbox = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alertbox.click();

		Alert simplealert = driver.switchTo().alert();
		simplealert.accept(); // simple alert

		WebElement confirmbox = driver.findElement(By.xpath("(//button)[2]"));
		confirmbox.click();

		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept(); // confirm alert

		WebElement promptbox = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		promptbox.click();

		Alert promptalert = driver.switchTo().alert();
		// Thread.sleep(3000);
		promptalert.sendKeys("text");
		promptalert.dismiss(); // prompt alert
	}
}
