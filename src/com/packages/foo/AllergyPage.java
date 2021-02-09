package com.packages.foo;


public class AllergyPage {
	
	static {
		System.out.println("God is good. All the time");
	}
	public static void main(String[] args) {
		gradCompute("GPA");
	}
	
	static {
		System.out.println("Good Day");
	}
	
	public static void gradCompute(String studentName) {
		double res = 519.5 + 75 + 30;
		double myRes = 107 + 15 + 6;
		System.out.println(myRes);
		System.out.println(studentName + ": " + res / myRes);
	}
	
}
