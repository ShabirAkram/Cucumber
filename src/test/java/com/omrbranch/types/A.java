package com.omrbranch.types;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class A {
	public static void main(String[] args) {
		// 1D without header
		List<String> emp = new ArrayList<>();

		emp.add("Ramesh");
		emp.add("Ramesh@gmail.com");
		emp.add("Java");

		String s = emp.get(2);
		System.out.println(s);
		// -------------------------------------------------------------------------------
		// 2D without header
		List<ArrayList<String>> emp1 = new ArrayList<>();

		// Insert into Inner ArrayList
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Ramesh");
		a1.add("Ramesh@gmail.com");
		a1.add("Java");
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("Bala");
		a2.add("Bala@gmail.com");
		a2.add("SQL");
		ArrayList<String> a3 = new ArrayList<>();
		a3.add("Mani");
		a3.add("Mani@gmail.com");
		a3.add("API");
		ArrayList<String> a4 = new ArrayList<>();
		a4.add("Abu");
		a4.add("Abu@gmail.com");
		a4.add("Appium");

		// Insert into Outer List
		emp1.add(a1);
		emp1.add(a2);
		emp1.add(a3);
		emp1.add(a4);

		ArrayList<String> a = emp1.get(3);
		String s1 = a.get(2);
		System.out.println(s1);

		// -------------------------------------------------------------------------------

		// 1D with header

		Map<String, String> emp2 = new LinkedHashMap<>();

		emp2.put("name", "Ramesh");
		emp2.put("email", "Ramesh@gmail.com");
		emp2.put("course", "java");

		String v = emp2.get("name");
		System.out.println(v);

		// ---------------------------------------------------------------------------------

		// 2D with header

		List<LinkedHashMap<String, String>> emp3 = new ArrayList<>();

		LinkedHashMap<String, String> m1 = new LinkedHashMap<>();
		m1.put("name", "Ramesh");
		m1.put("email", "Ramesh@gmail.com");
		m1.put("course", "Java");

		LinkedHashMap<String, String> m2 = new LinkedHashMap<>();
		m2.put("name", "Bala");
		m2.put("email", "Bala@gmail.com");
		m2.put("course", "SQL");

		LinkedHashMap<String, String> m3 = new LinkedHashMap<>();
		m3.put("name", "Mani");
		m3.put("email", "Mani@gmail.com");
		m3.put("course", "API");

		LinkedHashMap<String, String> m4 = new LinkedHashMap<>();
		m4.put("name", "Abu");
		m4.put("email", "Abu@gmail.com");
		m4.put("course", "Appium");

		emp3.add(m1);
		emp3.add(m2);
		emp3.add(m3);
		emp3.add(m4);

		LinkedHashMap<String, String> m = emp3.get(2);
		String v1 = m.get("course");
		System.out.println(v1);

	}
}
