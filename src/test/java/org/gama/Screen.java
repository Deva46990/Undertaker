package org.gama;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File f = new File("D:\\screenshots\\page.png");
		FileUtils.copyFile(screenshotAs, f);
		
		
		
		
		
	}

}
