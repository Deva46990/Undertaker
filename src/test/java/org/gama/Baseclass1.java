package org.gama;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.databind.deser.AbstractDeserializer;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.internal.connection.RouteSelector.Selection;

public class Baseclass1 {

	static WebDriver driver;
	
	public static void Browser(String url) {
		WebDriverManager.chromedriver().setup();
	       driver = new ChromeDriver();
		driver.get(url);
		}
	
	public static WebElement locators(String type,String value) {
		if (type.equals("xpath")) {
			WebElement findElement = driver.findElement(By.xpath(value));
			return findElement;
		}
		else if (type.equals("id")) {
			WebElement element = driver.findElement(By.id(value));
			return element;
		}
		else {
			WebElement name = driver.findElement(By.name(value));
			return name;
		}
	}
	public static void entertext(WebElement element, String text) {
		element.sendKeys(text);
		
		
}
	public static void enterClick(WebElement findElement) {
		findElement.click();
		}
	public static void enterClear(WebElement element) {
		element.clear();
	}
	public static String gettingtitle() {
		String title = driver.getTitle();
		return title;
	}
	public static String gettingcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		}
	public static String gettingtext(WebElement element) {
		String text = element.getText();
		return text;
		}
	public static String gettingattribute(WebElement element,String value) {
            String attribute = element.getAttribute(value);
            return attribute;
	}
	public static void selectIndex(WebElement element,int num) {
		Select s1 = new Select(element);
		s1.selectByIndex(num);

	}
	public void Selection(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
		
		s.selectByVisibleText(value);
	}
	public void actions(WebElement element) {
		Actions a = new Actions(driver);
        
        
        a.moveToElement(element).perform();
        a.clickAndHold(element);
        a.contextClick(element).perform();
        a.doubleClick().perform();  
		}
	public void drag(WebElement element,WebElement elements) {
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(element, element);

	}
	public void keyboardactions(int value) throws AWTException {
		Robot r = new Robot();
		r.keyPress(value);
		r.keyRelease(value);
		}
	public Alert alerts() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		return alert;
	}
	public void javaExcutor(String value) {  //using pixel Scrollup and Scrolldown
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript(value);
		j.executeScript(value);
		
		j.executeScript(value);
		j.executeScript(value);
	}
	public void navi(String value) {
		driver.navigate().to(value);
		driver.navigate().forward();
		driver.navigate().refresh();
		}
	
	public static String excelRead(String path, String sheetname,int rowindex, int cellindex) throws IOException {
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rowindex);
    	Cell cell = row.getCell(cellindex);
    	int cellType = cell.getCellType();
    	if (cellType==1) {
             String stringCellValue = cell.getStringCellValue();
         return stringCellValue;   
		}else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
			String format = s.format(dateCellValue);
			return format;
			
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			Long l = (long)numericCellValue;
			String valueOf = String.valueOf(l);
			return valueOf;
		}
    	

	}
	public void excelWrite(String path,String sheetname,int rowindex,int cellindex,String value) throws IOException {
		File f = new File(path);
		FileOutputStream stream = new FileOutputStream(f);
		Workbook  w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet(sheetname);
		Row createRow = createSheet.createRow(rowindex);
		Cell createCell = createRow.createCell(cellindex);
		createCell.setCellValue(value);
		w.write(stream);

	}
	
	
	

	
	
	
	
}

















 
























//	public static void main(String[] args) {
//	
//		DemoAuto a = new DemoAuto();
//		a.Browser("http://demo.automationtesting.in/Register.html");
//		WebElement locators = a.locators("xpath","//input[@placeholder='First Name']");
//		a.entertext(locators, "deva");
//		WebElement locators2 = a.locators("xpath","//input[@placeholder='Last Name']");
//		a.entertext(locators2, "b");
//		WebElement locators3 = a.locators("xpath","//textarea[@ng-model='Adress']");
//		a.entertext(locators3, "trfftfgf");
//		WebElement locators4 = a.locators("xpath","//input[@ng-model='EmailAdress']");
//		a.entertext(locators4, "deva@5r6.com");
//		WebElement locators5 = a.locators("xpath", "//input[@ng-model='Phone']");
//		a.entertext(locators5, "7767676866");
//		WebElement locators6 = a.locators("xpath","//input[@value='Male']");
//		a.enterClick(locators6);
//		WebElement locators7 = a.locators("id", "checkbox1");
//		a.enterClick(locators7);
//		WebElement locators8 = a.locators("id","msdd");
//		a.enterClick(locators8);
//		WebElement locators9 = a.locators("xapth","//a[text()='English']");
//		a.enterClick(locators9);
////		a.locators("", value)
////		
//		
//		
//		
//	}
//	
//	
//	
//}
