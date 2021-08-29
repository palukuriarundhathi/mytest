package com.test;

import java.awt.Point;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Resize {
  static WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
   driver.get("https://www.google.com/");
	//
     //positioning
    Point pt = new Point();
	}

}
