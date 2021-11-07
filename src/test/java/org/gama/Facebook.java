package org.gama;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Facebook extends Baseclass1{
public static void main(String[] args) throws IOException {
	Facebook f = new Facebook();
	f.Browser("https://en-gb.facebook.com/");
	f.excelWrite("D:\\\\deva.xls", "food", 0, 0, "Rajan");
	String excelRead = f.excelRead("D:\\\\deva.xls", "food", 0, 0);
	WebElement locators = f.locators("id","email");
	f.entertext(locators, excelRead);
	
}
}
