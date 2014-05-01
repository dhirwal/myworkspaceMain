package com.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Html {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//driver.get("file:///C:/QSP%20Java%20Classes/html/MyFirstWebPage.htm");
		driver.get("file:///C:/QSP Java Classes/html.fi/MyFirstWebPage.htm");
		boolean Radio=driver.findElement(By.id("male")).isSelected();
		System.out.println("Radio button is: "+Radio);
		String href=driver.findElement(By.linkText("click here for facebook")).getAttribute("href");
		System.out.println("the link of the text called 'click here for facebook' is: "+ href);
		driver.findElement(By.xpath("//a[@href='http://www.facebook.com']")).click();
		System.out.println("Program Ends..........................");
		
		

	}

}
