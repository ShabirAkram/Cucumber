package com.omrbranch.generateJvmReport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJvmReport(String jsonFile) {
		//1. Mention the path of JVM Report-->where to store?
		File file = new File("C:\\Users\\Md Shabir Akram\\eclipse-workspace\\Cucumber\\target");

		// 2. Create Object for Configuration Class
		Configuration configuration = new Configuration(file, "Facebook Project");

		// 3. Pass key and value pair as os, browser, version, sprint, Testing
		configuration.addClassifications("OS", "win11");
		configuration.addClassifications("Browser", "Edge");
		configuration.addClassifications("Browser Version", "133");
		configuration.addClassifications("Sprint", "34");
		configuration.addClassifications("Testing", "Reg");

		// 4. Pass the jason file to read result
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);

		// 5. Generate JVM Report
		builder.generateReports();
	}
}
