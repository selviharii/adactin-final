package com.propertyfile;

public class File_Readmanager {
	private File_Readmanager () {
		
	}
 public Conf_Reader getinstancecr() {
	 Conf_Reader cr=new Conf_Reader();
	return cr;
	}
  public static File_Readmanager getinstancefrm() {
	  File_Readmanager fr=new File_Readmanager();
	return fr;
  }
}
