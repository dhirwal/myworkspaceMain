package com.yatra.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BookYatra {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http:www.yatra.com");
		driver.findElement(By.id("BE_flight_origin_city")).sendKeys("Bangalore");
		driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("Chennai");
		
		 

	}

}
