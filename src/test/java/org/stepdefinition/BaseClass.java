package org.stepdefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {

	
	public static String readExcel(String fileLoc,int sheetNo,int rowNo, int cellNo) throws IOException {
		
		FileInputStream f = new FileInputStream(fileLoc);
		
		 Workbook w = new XSSFWorkbook(f);
               Sheet sheetAt = w.getSheetAt(sheetNo);
               Row row = sheetAt.getRow(rowNo);
               Cell cell = row.getCell( cellNo);
               
              int cellType = cell.getCellType();
              
           // System.out.println(cellType);
             
             if (cellType==1) {
            	 String stringCellValue = cell.getStringCellValue();
            	
            	 return stringCellValue ;
            	 
			}
             else {
            	 double numericCellValue = cell.getNumericCellValue();
     		    String value = String.valueOf(numericCellValue);
     			return value;
			}
			
			
			              
	}
	
	
}
