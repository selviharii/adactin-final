package com.stepdefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.pom.Pom_Class;
import com.propertyfile.File_Readmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactinbooking extends Base_Class {
	public static WebDriver driver=Base_Class.browser_Launch();
	Pom_Class a=new Pom_Class(driver);
	
	@Given("adactin hotel website loginpage should be open")
	public void adactin_hotel_website_loginpage_should_be_open() throws IOException {
	    url("https://adactinhotelapp.com/");
	}
	
	@When("user should enter valid username")
	public void user_should_enter_valid_username() {
		
		sendkeys(a.getUsername(),File_Readmanager.getinstancefrm().getinstancecr().getusername());
		System.out.println("fgh");
	}
	
	@When("user should enter valid password")
	public void user_should_enter_valid_password() {
		sendkeys(a.getPassword(),File_Readmanager.getinstancefrm().getinstancecr().getpassword());
	}
	
	@Then("aferclicking login button navigate to homepage")
	public void aferclicking_login_button_navigate_to_homepage() {
		click(a.getLogin());
    }
	
	@Given("select location from dropdown")
	public void select_location_from_dropdown() {
		dropdown(a.getLocation(), "value", "Melbourne"); 
	}
	
	@When("select your room you want from dropdown")
	public void select_your_room_you_want_from_dropdown() {
		dropdown(a.getHotel(), "text", "Hotel Cornice");
	}
	
	@Then("select roomtype from dropdown")
	public void select_roomtype_from_dropdown() {
		dropdown(a.getRoom(), "index", "2");
	}
	
	@Then("select number of rooms in your dropdown")
	public void select_number_of_rooms_in_your_dropdown() {
		dropdown(a.getNum1(), "text", "4 - Four");

	}
	
	@Then("select checkin date with valid format")
	public void select_checkin_date_with_valid_format() {
		clear(a.getCheckin());
		sendkeys(a.getCheckin(), "17/04/2022");
	}
	
	@Then("select checkoutdate from dropdown")
	public void select_checkoutdate_from_dropdown() {
		clear(a.getCheckout());
		sendkeys(a.getCheckout(), "20/04/2022");

	}
	
	@Then("select number of adult in one room")
	public void select_number_of_adult_in_one_room() {
		dropdown(a.getAdult(), "value", "3");
	}
	
	@Then("selct number of children count it is not mandatory")
	public void selct_number_of_children_count_it_is_not_mandatory() {
		dropdown(a.getChild(), "text", "1 - One");
	}
	
	@Then("click search button")
	public void click_search_button() {
		click(a.getSearch());
	}
	
	@Given("check hotel details")
	public void check_hotel_details() {
	    System.out.println("navigate into next page");
	    click(a.getButton());
	}
	
	@When("click on continue button")
	public void click_on_continue_button() {
		click(a.getCon());
	   
	}
	
	@Then("navigate to next page")
	public void navigate_to_next_page() {
	    System.out.println("nextpage");
	}
	
	@Given("enter name in first name")
    public void enter_name_in_first_name() {
		sendkeys(a.getFirst(), File_Readmanager.getinstancefrm().getinstancecr().getname());
    }
	
   @When("enter name in lastname field")
   public void enter_name_in_lastname_field() {
	   sendkeys(a.getLastname(), File_Readmanager.getinstancefrm().getinstancecr().getlastname());
    
}
@Then("user enter billing address")
public void user_enter_billing_address() {
    sendkeys(a.getAddr(), File_Readmanager.getinstancefrm().getinstancecr().getAddress());
}
@Then("user enter valid credit card number")
public void user_enter_valid_credit_card_number() {
	sendkeys(a.getNum(), File_Readmanager.getinstancefrm().getinstancecr().getcreditcardnumber());
    
}
@Then("select card type")
public void select_card_type() {
	dropdown(a.getType(), "index", File_Readmanager.getinstancefrm().getinstancecr().gettype());
   }
@Then("user select valid expiry month")
public void user_select_valid_expiry_month() {
	dropdown(a.getMonth(), "value", "9");
    }
@Then("select valid expiry year")
public void select_valid_expiry_year() {
	dropdown(a.getYear(), "text", "2022");
   }
@Then("enter valid ccv number")
public void enter_valid_ccv_number() {
	sendkeys(a.getCcv(), File_Readmanager.getinstancefrm().getinstancecr().getccv());
    }
@Then("click on booknow button")
public void click_on_booknow_button() {
	click(a.getBook());
   }
@Given("navigate to booking history page")
public void navigate_to_booking_history_page() {
	click(a.getIternity());
   }
@When("takescreenshot of reference number")
public void takescreenshot_of_reference_number() throws IOException {
	takeshot("C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Adactin_Final\\screenshot\\adactin.png");
   
}
@Then("click booking history reference button")
public void click_booking_history_reference_button() {
	click(a.getCancel());
    
}
@Then("click ok in alert")
public void click_ok_in_alert() {
	accept_alert();
  
}
@Then("click on logout button")
public void click_on_logout_button() {
	click(a.getLogout());
    }









}
