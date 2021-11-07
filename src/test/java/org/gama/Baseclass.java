package org.gama;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
           WebDriver driver;
	public void testId(String url) {
		WebDriverManager.chromedriver().setup();
	       driver = new ChromeDriver();
		driver.get(url);

	}
	public void telc(String text) {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(text);
	}
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(3000);
		Baseclass r = new Baseclass();
		r.testId("https://en-gb.facebook.com/");
		r.telc("deva");
		
		Baseclass c1 = new Baseclass();
		c1.testId("https://en-gb.facebook.com/");
		c1.telc("deva46990@gmail.com");
	}
	
}
