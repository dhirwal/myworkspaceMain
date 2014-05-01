package com.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BookPrice {

	
	public static void main(String[] args) {
		System.out.println("Program Starts........................");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com/books?otracker=hp_menu_new_header_Books");
		String Price=driver.findElement(By.linkText("Rs. 389")).getAttribute("class");
		System.out.println("the price the book is: "+Price);
		

	}

}
