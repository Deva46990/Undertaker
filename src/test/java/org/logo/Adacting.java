package org.logo;

import java.io.IOException;

import org.gama.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adacting extends Baseclass1 {
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Adacting a = new Adacting();
		a.Browser("https://adactinhotelapp.com/");
		Thread.sleep(1000);
		
		WebElement locators = a.locators("id","username");
		String excelRead = a.excelRead("D:\\App.xlsx","sheet1",0, 0);
		a.entertext(locators, excelRead);
		WebElement locators2 = a.locators("id","password");
		String excelRead2 = a.excelRead("D:\\App.xlsx","sheet1",0, 1);
		a.entertext(locators2, excelRead2);
		WebElement locators3 = a.locators("id","login");
		a.enterClick(locators3);
		
		WebElement locators4 = a.locators("id","location");
		String index = a.excelRead("D:\\App.xlsx","sheet1",0, 2);
		int parseInt = Integer.parseInt(index);
		a.selectIndex(locators4, parseInt);
		WebElement locators5 = a.locators("id","hotels");
		String Index1 = a.excelRead("D:\\App.xlsx","sheet1",1,2);
		int parseInt2 = Integer.parseInt(Index1);
		a.selectIndex(locators5, parseInt2);
		WebElement locators6 = a.locators("id", "room_type");
		String index2 = a.excelRead("D:\\App.xlsx","sheet1",1,0);
		int parseInt3 = Integer.parseInt(index2);
		a.selectIndex(locators6, parseInt3);
		WebElement locators7 = a.locators("id","room_nos");
		String index3 = a.excelRead("D:\\App.xlsx","sheet1",1,1);
		int parseInt4 = Integer.parseInt(index3);
		a.selectIndex(locators7, parseInt4);
		WebElement locators8 = a.locators("id","datepick_in");
		a.enterClear(locators8);
		String checkin= a.excelRead("D:\\App.xlsx","sheet1",2,0);
		a.entertext(locators8, checkin);
		WebElement locators9 = a.locators("id","datepick_out");
		a.enterClear(locators9);
		String checkout = a.excelRead("D:\\App.xlsx","sheet1",2,1);
		a.entertext(locators9, checkout);
		WebElement locators10 = a.locators("id", "adult_room");
		String rooms = a.excelRead("D:\\App.xlsx","sheet1",2,2);
		int parseInt5 = Integer.parseInt(rooms);
		a.selectIndex(locators10, parseInt5);
		WebElement locators11 = a.locators("id","child_room");
		String childroom = a.excelRead("D:\\App.xlsx","sheet1",3,0);
		int parseInt6 = Integer.parseInt(childroom);
		a.selectIndex(locators11, parseInt6);
		WebElement locators12 = a.locators("id","Submit");
		String searchbtn = a.excelRead("D:\\App.xlsx","sheet1",3,1);
		a.enterClick(locators12);
		
		Thread.sleep(3000);
		WebElement locators13 = a.locators("id","radiobutton_0");
		String radio = a.excelRead("D:\\App.xlsx","sheet1",3,2);
		a.enterClick(locators13);
		WebElement locators14 = a.locators("id","continue");
		String con = a.excelRead("D:\\App.xlsx","sheet1",4,0);
		a.enterClick(locators14);
		
		WebElement locators15 = a.locators("id","first_name");
		String firstname = a.excelRead("D:\\App.xlsx","sheet1",4,1);
		a.entertext(locators15, firstname);
		WebElement locators16 = a.locators("id", "last_name");
		String lastname = a.excelRead("D:\\App.xlsx","sheet1",4,2);
		a.entertext(locators16, lastname);
		WebElement locators17 = a.locators("id","address");
		String address = a.excelRead("D:\\App.xlsx","sheet1",5,0);
		a.entertext(locators17, address);
		WebElement locators18 = a.locators("id","cc_num");
		String cardnum = a.excelRead("D:\\App.xlsx","sheet1",5,1);
		a.entertext(locators18, cardnum);
		WebElement locators19 = a.locators("id","cc_type");
		String visa = a.excelRead("D:\\App.xlsx","sheet1",5,2);
		int parseInt7 = Integer.parseInt(visa);
		a.selectIndex(locators19, parseInt7);
		WebElement locators20 = a.locators("id","cc_exp_month");
		String expiremonth = a.excelRead("D:\\App.xlsx","sheet1",6,0);
		int parseInt8 = Integer.parseInt(expiremonth);
		a.selectIndex(locators20, parseInt8);
		WebElement locators21 = a.locators("id","cc_exp_year");
		String selectyear = a.excelRead("D:\\App.xlsx","sheet1",6,1);
		int parseInt9 = Integer.parseInt(selectyear);
		a.selectIndex(locators21, parseInt9);
		WebElement locators22 = a.locators("id","cc_cvv");
		String cvv = a.excelRead("D:\\App.xlsx","sheet1",6,2);
		a.entertext(locators22, cvv);

		WebElement locators23 = a.locators("id","book_now");
		//String btnclick = a.excelRead("D:\\App.xlsx","sheet1",6,3);
		a.enterClick(locators23);
		
		a.excelWrite("D:\\\\java.xls", "Sheet1", 0,1,"4H50KHBGP6");
		String excelRead3 = a.excelRead("D:\\\\java.xls", "Sheet1", 0,1);
		WebElement locators24 = a.locators("id","order_no");
		a.entertext(locators24, excelRead3);
		
	}

}
