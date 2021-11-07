package org.goo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;

public class Writethefile {

	public static void main(String[] args) throws IOException {
		
		
		File f = new File("D:\\Excel 2.0.xls");
		
		FileOutputStream st = new FileOutputStream(f);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet createSheet = w.createSheet("GOOD");
			
		Row row = createSheet.createRow(0);
		
		Cell cell = row.createCell(0);
		
		cell.setCellValue("DEVARAJAN");
		w.write(st);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
