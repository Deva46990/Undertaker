package org.gama;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adactingcall extends Baseclass1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
 		Browser("https://adactinhotelapp.com/index.php");
 		
		Adacting a = new Adacting();
		WebElement txtuser = a.getUsername();
		String excelRead1 = excelRead("D:\\App2.xlsx","Sheet1",0, 0);
		Thread.sleep(2000);
		entertext(txtuser, excelRead1);
		
		
		WebElement txtpass = a.getPassword();
		String excelRead2 = a.excelRead("D:\\App2.xlsx","Sheet1",0, 1);
		entertext(txtpass, excelRead2);
		WebElement login = a.getLogin();
		enterClick(login);
		
		Adacting1 a1 = new Adacting1();
		WebElement location = a1.getLocation();
		String excelRead3 = a.excelRead("D:\\App.xlsx","Sheet1",0, 2);
		int parseInt = Integer.parseInt(excelRead3);
		selectIndex(location, parseInt);
		
		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
