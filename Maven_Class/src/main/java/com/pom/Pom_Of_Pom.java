package com.pom;

import org.openqa.selenium.WebDriver;

public class Pom_Of_Pom {
	public WebDriver driver;
	
	private Login l;
	
	private Search_Hotel s;
	
	private Book_Now b;

	public Pom_Of_Pom(WebDriver driver2) {
		this.driver=driver2;
	}

	public Login getL() {
		l=new Login(driver);
		return l;
	}

	public Search_Hotel getS() {
		s=new Search_Hotel(driver);
		return s;
	}

	public Book_Now getB() {
		b=new Book_Now(driver);
		return b;
	}
	
	
	

}
