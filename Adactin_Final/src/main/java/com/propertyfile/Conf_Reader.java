package com.propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Conf_Reader {
	public static Properties p;
	public  void con_reader() throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Adactin_Final\\configuraton.properties");
		p=new Properties();
		p.load(f);
		}
   public String getusername() {
	   String un = p.getProperty("username");
	   return un;
   }
   
   public String getpassword() {
	   String pw= p.getProperty("password");
	   return pw;
   }
   
   public String getname() {
	   String name = p.getProperty("name");
	   return name;
   }
   public String getlastname() {
	   String lm = p.getProperty("lastname");
	   return lm;
   }
   public String getAddress() {
	   String Address = p.getProperty("Address");
	   return Address;
   }
   public String getcreditcardnumber() {
	   String ccn = p.getProperty("creditcardnumber");
	   return ccn;
   }
   
   public String gettype() {
	   String type= p.getProperty("type");
	   return type;
   }

   public String getccv() {
	   String ccv = p.getProperty("ccv");
	   return ccv;
   }

   
   
   
   
   
   
   
}
