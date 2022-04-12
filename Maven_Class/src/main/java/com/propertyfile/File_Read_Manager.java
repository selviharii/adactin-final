package com.propertyfile;

import java.io.IOException;

public class File_Read_Manager {
	private File_Read_Manager() {
	}
	
	public Conf_Reader getinstancecr() throws IOException {
		Conf_Reader cr=new Conf_Reader();
		return cr;
		}
	
	public static File_Read_Manager getinstancefrm() {
		File_Read_Manager frm=new File_Read_Manager();
		return frm;
		}
	
	}
