package com.ontestautomation.jgiven.tests.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tngtech.jgiven.Stage;

public class ThenTheLoginActionWillBeSuccessful extends Stage<ThenTheLoginActionWillBeSuccessful> {
	
	WebDriver _driver;
	
	public ThenTheLoginActionWillBeSuccessful the_login_action_will_be_successful(WebDriver driver) {
		
		_driver = driver;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		_driver.findElement(By.xpath("//*[@id='com_ibm_bpm_social_widgets_LaunchableProcessList_0']/ul/li[3]/a")).click();
		//_driver.get("https://bp3-pcadv-856cf2.bp-3.lan:9443/teamworks/executeServiceByName?processApp=BP3UI2X&serviceName=Brazos+Control+Demo+%28Start+Here%29&branchId=2063.ebe03901-e48d-48f4-a744-19cde83c9880&coachDebugTrace=none");
		_driver.switchTo().frame(_driver.findElement(By.xpath("//*[@id='com_ibm_bpm_social_widgets_task_form_CoachRenderer_0']/iframe")));
		_driver.findElement(By.cssSelector("#div_1_1_2_1_1_1_1 > div:nth-child(1) > button:nth-child(1)")).click();
		//_driver.switchTo().frame(_driver.findElement(By.xpath("//*[@id='com_ibm_bpm_social_widgets_task_form_CoachRenderer_0']/iframe")));
		//_driver.findElement(By.id("processPortalUserDropdown")).click();
		//jse.executeScript("window.scrollBy(0, 500)");
		return self();
	}

}
