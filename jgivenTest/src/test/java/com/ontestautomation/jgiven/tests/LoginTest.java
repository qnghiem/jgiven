package com.ontestautomation.jgiven.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tngtech.jgiven.testng.ScenarioTest;
import com.ontestautomation.jgiven.tests.steps.*;

public class LoginTest extends ScenarioTest<GivenIAmAtTheLoginPage, WhenILoginToProcessPortal, ThenTheLoginActionWillBeSuccessful> {
	
	WebDriver driver;
	//WebDriver driver2;
	@BeforeTest
	public void initBrowser() {

		//driver2 = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\system32\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.setBinary("C:\\Users\\quang\\AppData\\Local\\CocCoc\\Browser\\Application\\browser.exe");
		driver = new ChromeDriver();
		Dimension d = new Dimension(1903,1000);
		//Resize the current window to the given dimension
		driver.manage().window().setSize(d);
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	@Test
	public void aFirstLoginTest() {
		
		given().I_am_at_the_login_page(driver);
		when().I_login_to_process_portal(driver);
		then().the_login_action_will_be_successful(driver);

		//given().I_am_at_the_login_page(driver2);
		//when().I_login_to_process_portal(driver2);
		//then().the_login_action_will_be_successful(driver2);
	}
	
	@AfterTest
	public void tearDown() {
		
	}
}
