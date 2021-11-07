package org.method;

import java.io.IOException;

import org.gama.Baseclass1;
import org.openqa.selenium.WebElement;

public class MethodName extends Baseclass1 {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		MethodName m = new MethodName();
		m.excelWrite("D:\\javasabari.xls","sabari",0,0,"Amalacyril");
		String excelRead = m.excelRead("D:\\javasabari.xls","sabari",0,0);
		m.Browser("http://demo.automationtesting.in/Register.html");
		WebElement locators = m.locators("xpath","//input[@placeholder='First Name']");
		m.entertext(locators, excelRead);
		m.excelWrite("D:\\javasabari.xls","sabari",0,1,"deva");
		String excelRead2 = m.excelRead("D:\\javasabari.xls","sabari",0,1);
		WebElement locators2 = m.locators("xpath","//input[@placeholder='Last Name']");
		m.entertext(locators2, excelRead2);
		m.excelWrite("D:\\javasabari.xls","sabari",0,2,"Trichy");
		String excelRead3 = m.excelRead("D:\\javasabari.xls","sabari",0,2);
		WebElement locators3 = m.locators("xpath","//textarea[@ng-model='Adress']");
		m.entertext(locators3, excelRead3);
		m.excelWrite("D:\\javasabari.xls","sabari",1,0,"v.cyril95@gmail.com");
		String excelRead4 = m.excelRead("D:\\javasabari.xls","sabari",1,0);
		WebElement locators4 = m.locators("xpath","//input[@ng-model='EmailAdress']");
		m.entertext(locators4, excelRead4);
		m.excelWrite("D:\\javasabari.xls","sabari",1,1,"7456454546");
		String excelRead5 = m.excelRead("D:\\javasabari.xls","sabari",1,1);
		WebElement locators5 = m.locators("xpath","//input[@ng-model='Phone']");
		m.entertext(locators5,excelRead5);
		m.excelWrite("D:\\javasabari.xls","sabari",1,2,"Male");
	    String excelRead6 = m.excelRead("D:\\javasabari.xls","sabari",1,2);
	    WebElement locators6 = m.locators("xpath", "//input[@value='Male']");
	    m.enterClick(locators6);
	    m.excelWrite("D:\\javasabari.xls","sabari",2,0,"Cricket");
	    String excelRead7 = m.excelRead("D:\\javasabari.xls","sabari",2,0);
	    WebElement locators7 = m.locators("id", "checkbox1");
	    m.enterClick(locators7);
	    Thread.sleep(1000);
	    m.excelWrite("D:\\javasabari.xls","sabari",2,1,"english");
	    String excelRead8 = m.excelRead("D:\\javasabari.xls","sabari",2,0);
	    WebElement locators8 = m.locators("id", "msdd");
	    m.enterClick(locators8);
	    
	    
	}
}