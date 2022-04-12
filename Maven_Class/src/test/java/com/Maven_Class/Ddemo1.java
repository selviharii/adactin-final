package com.Maven_Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ddemo1 extends Ddemo {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize(); 
		FileInputStream f=new FileInputStream("C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Maven_Class\\configuration.properties");
		Properties p=new Properties();
		p.load(f);
		String un = p.getProperty("username");
		
		PageFactory.initElements(driver, Ddemo.class);
		Ddemo.username.sendKeys(un);
		Ddemo.password.sendKeys(p.getProperty("password"));
		Ddemo.login.click();
		Ddemo.location.getLocation();
		Select s=new Select(location);
        s.selectByIndex(4);
		Ddemo.hotel.getLocation();
		Select s1=new Select(hotel);
        s1.selectByValue("Hotel Sunshine");
        Ddemo.room.getLocation();
        Select s2=new Select(room);
        s2.selectByVisibleText("Super Deluxe");
        Ddemo.num1.getLocation();
        Select s3=new Select(num1);
        s3.selectByValue("2");
        Ddemo.checkin.clear();
        Ddemo.checkin.sendKeys("04/04/2022");
        Ddemo.checkout.clear();
        Ddemo.checkout.sendKeys("07/04/2022");
        Ddemo.adult.getLocation();
        Select s4=new Select(adult);
        s4.selectByIndex(3);
        Ddemo.child.getLocation();
        Select s5=new Select(child);
        s5.selectByVisibleText("1 - One");
        Ddemo.search.click();
        Ddemo.button.click();
        Ddemo.con.click();
        Ddemo.first.sendKeys(p.getProperty("name"));
        Ddemo.lastname.sendKeys(p.getProperty("lastname"));
        Ddemo.addr.sendKeys(p.getProperty("Address"));
        Ddemo.num.sendKeys(p.getProperty("creditcardnumber"));
        Ddemo.type.getLocation();
        Select s6=new Select(type);
        s6.selectByIndex(3);
        Ddemo.month.getLocation();
        Select s7=new Select(month);
        s7.selectByValue("9");
        Ddemo.year.getLocation();
        Select s8=new Select(year);
        s8.selectByVisibleText("2022");
        Ddemo.ccv.sendKeys(p.getProperty("ccv"));
        Ddemo.book.click();
        
        
        
        
        
        
        
        
        
        
        
        
		
	    
		

	}

}
