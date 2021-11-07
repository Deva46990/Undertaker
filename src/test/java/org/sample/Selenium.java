package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	public static void main(String[] args) throws IOException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	File f = new File("D:\\cyril1rex.xlsx");
	FileOutputStream output = new FileOutputStream(f);
	Workbook dst = new XSSFWorkbook();
	Sheet sheet = dst.createSheet("kfc1");
	Row createRow = sheet.createRow(0);
	driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
	WebElement kkr = driver.findElement(By.tagName("table"));
	WebElement vvy = driver.findElement(By.tagName("thead"));
	WebElement bbb = driver.findElement(By.tagName("tr"));
List<WebElement> sss = driver.findElements(By.tagName("th"));
	
	for (int i = 0; i < sss.size(); i++) {
		WebElement webElement = sss.get(i);
		String text = webElement.getText();
		System.out.println(text);
		Cell createCell = createRow.createCell(i);
		createCell.setCellValue(text);
		
		
	}
	WebElement element = driver.findElement(By.tagName("tbody"));
List<WebElement> elements = driver.findElements(By.tagName("tr"));
	for (int j =1; j <elements.size();j++) {
		
		WebElement element2 = elements.get(j);
		Row createRow2 = sheet.createRow(j);
		
		
		List<WebElement> list = element2.findElements(By.tagName("td"));
		
		for (int k = 0; k <list.size(); k++) {
			WebElement element3 = list.get(k);
			String text1 = element3.getText();
			Cell createCell1 = createRow2.createCell(k);

		createCell1.setCellValue(text1);
	
		System.out.println(text1);
		
		
			
		}
		
		
		
	}
	dst.write(output);
		
	}

}