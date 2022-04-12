package com.browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Data_Drive {

	public static void Driven() throws IOException {
		File f=new File("C:\\Users\\PRIYA\\Desktop\\Book1.xlsx");
		FileInputStream excel=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(excel);
		//XSSFSheet sheet = wb.getSheet("sheet1");
		XSSFSheet sheetAt = wb.getSheetAt(0);
		XSSFRow row = sheetAt.getRow(3);
		
		int physical = sheetAt.getPhysicalNumberOfRows();
		System.out.println(physical);
		int phycell = row.getPhysicalNumberOfCells();
		System.out.println(phycell);
		
		System.out.println("**************************************");
		
		for (int i = 0; i < physical; i++) {
			
			XSSFRow row1 = sheetAt.getRow(i);
			int cellsize = row1.getPhysicalNumberOfCells();
			
		 for (int j = 0; j < cellsize; j++) {
			 
			 XSSFCell cell = row1.getCell(j);
				CellType cellType = cell.getCellType();
				
				//System.out.println(cellType);		
				
			
		if (cellType.equals(cellType.STRING)) {
			
		String sv = cell.getStringCellValue();
		System.out.print("  "+sv);
		
			
		} else if (cellType.equals(CellType.NUMERIC)){
			double nv = cell.getNumericCellValue();
			int k=(int)nv;
			System.out.print("  "+k);
		}
		}
		System.out.println();
		}
		}
	public static void main(String[] args) throws IOException {
		Driven();
	}
	
	

}
