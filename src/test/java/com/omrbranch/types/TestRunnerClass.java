package com.omrbranch.types;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.generateJvmReport.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class) // to get report in json format - "json:target\\output.json"
							// to get report in xml format - "junit:target\\output.xml"
							// to get report in html format html:target\\output.html
//to ignore colours in console use monochrome = true
//to ensure all methods in camelCase us SnippetType.CAMELCASE
//to ensure all methods in underscore us SnippetType.UNDERSCORE
@CucumberOptions(stepNotifications = true, publish = true, snippets = SnippetType.CAMELCASE, dryRun = false, monochrome = true, plugin = {
		"pretty", "html:target\\output.html" }, name = { "Amazon Product Search",
				"Login with valid credentials" }, glue = "com.omrbranch.stepdefinition", features = "src\\test\\resources")
public class TestRunnerClass {
	@AfterClass
	public static void afterClass() {
		Reporting.generateJvmReport("C:\\Users\\Md Shabir Akram\\eclipse-workspace\\Cucumber\\target\\output.json");
	}
}
