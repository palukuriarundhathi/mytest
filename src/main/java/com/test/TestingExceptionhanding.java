package com.test;

import org.testng.annotations.Test;

public class TestingExceptionhanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingExceptionhanding object = new TestingExceptionhanding();
		object.homePageTest();
	}
	
String name = "testng";
	
	@SuppressWarnings("null")
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void homePageTest() {
		System.out.println("homePageTest");
		//int i = 9/0;
		TestingExceptionhanding obj= null;
		System.out.println(obj.name);
	}

}
