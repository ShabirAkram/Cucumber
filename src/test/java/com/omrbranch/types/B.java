package com.omrbranch.types;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class B {
	WebDriver driver;
	@When("User search Product")
	public void a(io.cucumber.datatable.DataTable dataTable) {
		// 1D without header
		List<String> emp = dataTable.asList();
		String v = emp.get(1);

		WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearchBox.sendKeys(v, Keys.ENTER);
	}

	@When("User search Product")
	public void b(io.cucumber.datatable.DataTable dataTable) {
		// 2D without header
		Map<String, String> emp = dataTable.asMap();
		String v = emp.get("Laptop");

		WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearchBox.sendKeys(v, Keys.ENTER);
	}
}
