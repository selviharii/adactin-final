package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {
public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
    private WebElement username;
	
	@FindBy(id="password")
	 private  WebElement password;
	
	@FindBy(id="login")
	 private WebElement login;
	
	//search hotel
	
	@FindBy(id="location")
	 private WebElement location;
	
	@FindBy(id="hotels")
	 private WebElement hotel;
	
	@FindBy(id="room_type")
	 private WebElement room;
	
	@FindBy(id="room_nos")
	 private WebElement num1;
	
    @FindBy(id="datepick_in")
    private WebElement checkin;
	
	@FindBy(id="datepick_out")
	 private WebElement checkout;
	
	@FindBy(id="adult_room")
	 private WebElement adult;
	
	@FindBy(id="child_room")
	 private WebElement child;
	
	@FindBy(id="Submit")
	 private WebElement search;
	
	@FindBy(id="radiobutton_0")
	 private WebElement button;
	
	@FindBy(id="continue")
	 private WebElement con;
	
	//book now
	
	@FindBy(id="first_name")
	 private WebElement first;
	
	@FindBy(id="last_name")
	 private WebElement lastname;
	
	@FindBy(id="address")
	 private WebElement addr ;
	
	@FindBy(id="cc_num")
	 private WebElement num;
	
	@FindBy(id="cc_type")
	 private WebElement type;
	
	@FindBy(id="cc_exp_month")
	 private WebElement month;
	
	@FindBy(id="cc_exp_year")
	 private WebElement year;
	
	
	@FindBy(id="cc_cvv")
	 private WebElement ccv;
	
	@FindBy(id="book_now")
	 private WebElement book;
	
	//cancel
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement iternity;
	
	@FindBy(xpath="//input[@type='checkbox'][2]")
	 private WebElement checkbox;
	
	@FindBy(name="cancelall")
	 private WebElement cancel;
	
	@FindBy(xpath="//a[text()='Logout']")
	 private WebElement logout;
	
	

	public Pom_Class(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


		public   WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public void setRoom(WebElement room) {
		this.room = room;
	}

	public WebElement getNum1() {
		return num1;
	}

	public void setNum1(WebElement num1) {
		this.num1 = num1;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public void setCheckin(WebElement checkin) {
		this.checkin = checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public void setAdult(WebElement adult) {
		this.adult = adult;
	}

	public WebElement getChild() {
		return child;
	}

	public void setChild(WebElement child) {
		this.child = child;
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public WebElement getButton() {
		return button;
	}

	public void setButton(WebElement button) {
		this.button = button;
	}

	public WebElement getCon() {
		return con;
	}

	public void setCon(WebElement con) {
		this.con = con;
	}

	public WebElement getFirst() {
		return first;
	}

	public void setFirst(WebElement first) {
		this.first = first;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getAddr() {
		return addr;
	}

	public void setAddr(WebElement addr) {
		this.addr = addr;
	}

	public WebElement getNum() {
		return num;
	}

	public void setNum(WebElement num) {
		this.num = num;
	}

	public WebElement getType() {
		return type;
	}

	public void setType(WebElement type) {
		this.type = type;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public void setCcv(WebElement ccv) {
		this.ccv = ccv;
	}

	public WebElement getBook() {
		return book;
	}

	public void setBook(WebElement book) {
		this.book = book;
	}
	
	public WebElement getIternity() {
		return iternity;
	}


	public void setIternity(WebElement iternity) {
		this.iternity = iternity;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(WebElement checkbox) {
		this.checkbox = checkbox;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public void setCancel(WebElement cancel) {
		this.cancel = cancel;
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	

}





