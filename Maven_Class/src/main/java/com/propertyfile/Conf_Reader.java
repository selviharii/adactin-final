package com.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Conf_Reader {
	public static Properties p;
	public Conf_Reader() throws IOException {
		File f=new File("C:\\Users\\PRIYA\\SelviSelenium-Workspace22\\Maven_Class\\configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		}
    public String getusername() {
    	String user = p.getProperty("username");
    	return user;   
    	}
    public String getpassword() {
    	String password = p.getProperty("password");
    	return password;   
    	}
}