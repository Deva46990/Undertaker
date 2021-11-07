package org.gama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adacting extends Baseclass1 {
	
	public Adacting() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
     private WebElement Username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="login")
	private WebElement Login;
	
	
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogin() {
		return Login;
	}
	
	
}
