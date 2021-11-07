package org.game;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
		 
		 WebElement table = driver.findElement(By.tagName("table"));
		 
		 WebElement heading = driver.findElement(By.tagName("thead"));
		
		 WebElement headingrow = driver.findElement(By.tagName("tr"));
		 
		 List<WebElement> headingelements = headingrow.findElements(By.tagName("th"));
		 
		 int size = headingelements.size();
		 for (int i = 0; i < size; i++) {
			 WebElement dataele = headingelements.get(i);
			String text = dataele.getText();
			System.out.print(text+"\t");
		 }
			WebElement content = table.findElement(By.tagName("tbody"));
			
			  List<WebElement> listrows = content.findElements(By.tagName("tr"));
			  for (int i = 0; i < listrows.size(); i++) {
				WebElement element = listrows.get(i);
			List<WebElement> tbody = element.findElements(By.tagName("td"));
			for (int j = 0; j < tbody.size(); j++) {
				WebElement tbody2 = tbody.get(j);
				String text = tbody2.getText();
				System.out.print(text + "\t");
			}
			System.out.println();
			}
			
	}

	
	}
