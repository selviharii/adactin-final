package com.browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Outputstream {
public static void Writ() throws IOException {
		
	File f=new File("C:\\Users\\PRIYA\\Desktop\\Book1.xlsx");
	
	XSSFWorkbook wb=new XSSFWorkbook();
       
    wb.createSheet("sheet3").createRow(0).createCell(0).setCellValue("name");
    wb.getSheet("sheet3").getRow(0).createCell(1).setCellValue("password");
    wb.getSheet("sheet3").getRow(0).createCell(2).setCellValue("salary");
    wb.getSheet("sheet3").createRow(1).createCell(0).setCellValue("anu");
    wb.getSheet("sheet3").getRow(1).createCell(1).setCellValue("1234");
    wb.getSheet("sheet3").getRow(1).createCell(2).setCellValue("50000");
    wb.getSheet("sheet3").createRow(2).createCell(0).setCellValue("ram");
    wb.getSheet("sheet3").getRow(2).createCell(1).setCellValue("5678");
    wb.getSheet("sheet3").getRow(2).createCell(2).setCellValue("80000");
    
    
    FileOutputStream fos=new FileOutputStream(f);
    wb.write(fos);
    wb.close();
    System.out.println("sheet created");
     }

public static void main(String[] args) throws IOException {
    Writ();

}

}

