package org.gama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;

public class Google extends Baseclass1{
	public static void main(String[] args) {
		
		
		Browser("https://www.facebook.com/");
		Pojoclass d = new Pojoclass();
		WebElement txtuser = d.getUsername();
		entertext(txtuser, "deva");
		WebElement txtpass = d.getPassword();
		entertext(txtpass, "476676");
		WebElement login = d.getLogin();
		enterClick(login);
		driver.navigate().refresh();
		
	    }
	
		
	
		

	}
	
	

