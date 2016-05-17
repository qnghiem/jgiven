package com.ontestautomation.jgiven.tests.steps;

import com.tngtech.jgiven.Stage;
import org.openqa.selenium.*;

public class GivenIAmAtTheLoginPage extends Stage<GivenIAmAtTheLoginPage>{
	
	WebDriver _driver;
	
	public GivenIAmAtTheLoginPage I_am_at_the_login_page(WebDriver driver) {
		
		_driver = driver;
		
		_driver.get("https://bp3-pcadv-856cf2.bp-3.lan:9443/ProcessPortal/login.jsp");
		
		return self();
	}
}
