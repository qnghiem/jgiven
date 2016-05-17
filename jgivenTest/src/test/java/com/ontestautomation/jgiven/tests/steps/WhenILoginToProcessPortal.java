package com.ontestautomation.jgiven.tests.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tngtech.jgiven.Stage;

public class WhenILoginToProcessPortal extends Stage<WhenILoginToProcessPortal>{
	
	WebDriver _driver;
	
	public WhenILoginToProcessPortal I_login_to_process_portal(WebDriver driver) {
		
		_driver = driver;
		
		_driver.findElement(By.id("username")).sendKeys("qnghiem");
		_driver.findElement(By.id("password")).sendKeys("vodanh0830");
		_driver.findElement(By.xpath("//input[@value='Log In']")).click();
		return self();
	}
}