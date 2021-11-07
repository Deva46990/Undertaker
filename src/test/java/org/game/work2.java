package org.game;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class work2 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Java Selenium\\work.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet sheet = w.getSheet("Sheet2");
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(0);
		
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		
	}
}
