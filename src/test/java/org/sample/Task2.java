

package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task2 {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Java Selenium\\First work.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		//to read excel
		
		Workbook w = new XSSFWorkbook(stream);
		
		//to read the sheet
		
		Sheet s = w.getSheet("Sheet1");
		
		int a = s.getPhysicalNumberOfRows();
		
		
		
		for (int i = 0; i < a; i++) {
			Row row = s.getRow(i);
			
			int ofCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < ofCells; j++) {
				Cell cell = row.getCell(j);
				
				//to find the cell type
				
				int cellType = cell.getCellType();
				if (cellType==1) {
					
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					}
				else {
					double numericCellValue = cell.getNumericCellValue();
					//System.out.println(numericCellValue);
					
					//type casting
					
					Long l =(long)numericCellValue;
					System.out.println(l);
					
					
				
			}
		}
		
		
		
		}}
		
		
		
	}

