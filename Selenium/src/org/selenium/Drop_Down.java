package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drop_Down { //singledropdown

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		WebElement create = driver.findElement(By.id("createacc"));
		create.click();
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("selvi");
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastname.sendKeys("R");
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//implicitwait
		
		WebDriverWait w =new WebDriverWait(driver,30);
	    w.until(ExpectedConditions.visibilityOf(lastname)); //explicit wait
		
		WebElement code = driver.findElement(By.name("shortCountryCode"));
		Select a2=new Select(code);
		a2.selectByValue("IN");
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("9840688999");
		WebElement month = driver.findElement(By.id("usernamereg-month"));
		Select a=new Select(month);
		a.selectByIndex(1);
		WebElement day = driver.findElement(By.id("usernamereg-day"));
		day.sendKeys("30");
		WebElement year = driver.findElement(By.name("yyyy"));
		year.sendKeys("1992");
		
		
		

	}

}
