package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	static WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup() ;
		driver= new ChromeDriver();
	//	driver.get("https://www.google.com/");
		try {
			testScreenShot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void testScreenShot() throws Exception{

	    //goto url

		driver.get("https://demoqa.com");
        
	       //Take the screenshot
	        File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        System.out.println("System.getProperty(user.dir)" + "projectScreenshots\\homePageScreenshot.png");
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	            FileUtils.copyFile(srcfile, new File("System.getProperty(user.dir)" + "projectScreenshots\\homePageScreenshot.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	           

    }


}
