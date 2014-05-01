package com.practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchActitime {
	//public static void main(String[]args){
	
	LaunchActitime()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
			
	}
	
	
	
}
