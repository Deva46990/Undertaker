package org.gama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adacting2 extends Baseclass1 {
	
	public Adacting2() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	@FindBy(id="continue")
	private WebElement Continue;
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}
	public WebElement getContinue() {
		return Continue;
	}
	
	
	

}
