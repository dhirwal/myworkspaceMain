package com.practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.selenesedriver.FindElement;


public class LoginActiTime {

	
	public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
		//Class.forName("com.practiceSelenium.LaunchActitime");//Why is it not launching the application
		System.out.println("Program Started...................");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//LaunchActitime lAt=new LaunchActitime();
		//Class.forName("com.practiceSelenium.LaunchActitime");
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		System.out.println("logging in to username textbox using 'admin'as name property");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		System.out.println("logging in to password textbox using 'pwd'as name property");
		driver.findElement(By.id("loginButton")).click();
		//driver.findElement(By.xpath())
		System.out.println("clicking the login buttton using id property");
		Thread.sleep(5000);
		System.out.println("Program Ends.......................");
	}

}
