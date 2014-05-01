package com.practiceSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://irctc.co.in/");
		Set<String> windowHandler = driver.getWindowHandles();// Using Set collection object because windowHandlers
					// are unique in nature and can be caught as String variable.
		Iterator it=windowHandler.iterator();// Set collection object is not index based so we can not call the bojects
					// using index number in for loop, in that case we will use iterator. for Set collection objects 
					// iterator has methods called 

	}

}
