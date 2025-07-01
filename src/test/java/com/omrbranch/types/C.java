package com.omrbranch.types;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.When;

public class C {
	WebDriver driver;

	@When("User Login")
	public void userLogin(io.cucumber.datatable.DataTable dataTable) {
//		List<List<String>> emp = dataTable.asLists();
//		List<String> e = emp.get(2);
		driver = new EdgeDriver();
		List<List<String>> emp = dataTable.asLists();
		List<String> e = emp.get(2);
		String s1 = e.get(0);
		String s2 = e.get(1);

		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
	}

	@When("User Login")
	public void userLogin1(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> emp = dataTable.asMaps();
		Map<String, String> m = emp.get(2);
		String s1 = m.get("name");
		String s2 = m.get("password");

		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
	}

}
