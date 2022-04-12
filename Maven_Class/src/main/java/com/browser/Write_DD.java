package com.browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.io.FileBackedOutputStream;

public class Write_DD {
	
	public static void Write() throws IOException {
		
		File f=new File("C:\\Users\\PRIYA\\Desktop\\Book1.xlsx");
		
	   
		FileInputStream excel=new FileInputStream(f);
	    
	    XSSFWorkbook wb=new XSSFWorkbook(excel);
	    
	     //XSSFSheet createSheet = wb.createSheet("sheet2");
	    // XSSFRow createRow = createSheet.createRow(0);
	    //XSSFCell createCell = createRow.createCell(0);
	    // wb.getSheet("sheet2").getRow(0).getCell(0).setCellValue("name");
	    
	    wb.createSheet("sheet2").createRow(0).createCell(0).setCellValue("name");
	    wb.getSheet("sheet2").getRow(0).createCell(1).setCellValue("password");
	    wb.getSheet("sheet2").getRow(0).createCell(2).setCellValue("salary");
	    wb.getSheet("sheet2").createRow(1).createCell(0).setCellValue("anu");
	    wb.getSheet("sheet2").getRow(1).createCell(1).setCellValue("1234");
	    wb.getSheet("sheet2").getRow(1).createCell(2).setCellValue("50000");
	    wb.getSheet("sheet2").createRow(2).createCell(0).setCellValue("viji");
	    wb.getSheet("sheet2").getRow(2).createCell(1).setCellValue("5678");
	    wb.getSheet("sheet2").getRow(2).createCell(2).setCellValue("60000");
	    
	    
	    FileOutputStream fos=new FileOutputStream(f);
	    
	    wb.write(fos);
	    
	    wb.close();
	    
	    System.out.println("sheet created");
	    
	    }

	public static void main(String[] args) throws IOException {
		
		Write();

	}

}
