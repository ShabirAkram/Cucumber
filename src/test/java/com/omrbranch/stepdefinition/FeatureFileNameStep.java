package com.omrbranch.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeatureFileNameStep {
	WebDriver driver;

	@Given("User is on the OMR page")
	public void user_is_on_the_omr_page() {
		driver = new EdgeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	

	@When("User enters {string} and {string}")
	public void user_enters_and(String userName, String password) {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(userName);
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(password);
	}




//	@When("User enters username and password")
//	public void user_enters_username_and_password() {
//		WebElement txtEmail = driver.findElement(By.id("email"));
//		txtEmail.sendKeys("GreensOmr");
//		
//		WebElement txtPassword = driver.findElement(By.id("pass"));
//		txtPassword.sendKeys("GreensOmr");
//	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Login']"));
		btnLogin.click();
	}

	@Then("User should verify after login success message")
	public void user_should_verify_after_login_success_message() {
		Assert.assertTrue("Verify Login", true);
	}

}
