package com.Maven_Class;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.Pom_Of_Pom;
import com.propertyfile.File_Read_Manager;

public class Runner_Adactin extends Methods_Base {
	public static WebDriver driver=Methods_Base.browser_Launch();

	public static void main(String[] args) throws IOException {
		Pom_Of_Pom p=new Pom_Of_Pom(driver);
		
		url("https://adactinhotelapp.com/");
		sendkeys(p.getL().getUsername(),
				File_Read_Manager.getinstancefrm().getinstancecr().getusername());
		sendkeys(p.getL().getPassword(),
				File_Read_Manager.getinstancefrm().getinstancecr().getpassword());
		click(p.getL().getLogin());
		dropdown(p.getS().getLocation(), "value", "Melbourne");
		dropdown(p.getS().getHotel(), "text", "Hotel Cornice");
		dropdown(p.getS().getRoom(), "index", "2");
		dropdown(p.getS().getNum(), "text", "4 - Four");
		clear(p.getS().getCheckin());
		sendkeys(p.getS().getCheckin(), "18/03/2022");
		clear(p.getS().getCheckout());
		sendkeys(p.getS().getCheckout(), "20/03/2022");
		dropdown(p.getS().getAdult(), "value", "3");
		dropdown(p.getS().getChild(), "text", "1 - One");
		click(p.getS().getSearch());
		click(p.getS().getButton());
		click(p.getS().getCon());
		sendkeys(p.getB().getFirst(), "selvi");
		sendkeys(p.getB().getLastname(), "R");
		sendkeys(p.getB().getAddr(), "maduravoyal");
		sendkeys(p.getB().getNum(), "12345678999123456");
		dropdown(p.getB().getType(), "index", "3");
		dropdown(p.getB().getMonth(), "value", "3");
		dropdown(p.getB().getYear(), "text", "2022");
		sendkeys(p.getB().getCcv(), "224");
		click(p.getB().getBook());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
		



