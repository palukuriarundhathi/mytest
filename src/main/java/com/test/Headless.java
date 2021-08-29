package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//headless - no browser
		//testing is happening behind the scene
		//faster
	
		WebDriverManager.chromedriver().setup();
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
	      co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		
		//WebDriver driver = new FirefoxDriver(fo);
		driver.get("http://wwww.amazon.com");
		
		System.out.println(driver.getTitle());
		driver.quit();


	}

}
