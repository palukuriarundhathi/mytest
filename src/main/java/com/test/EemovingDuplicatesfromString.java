package com.test;

import java.util.LinkedHashSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EemovingDuplicatesfromString {

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(); // launching browser
	
	System.setProperty(null, null);
		
	//	removeDuplicates("Arundahthi");
	}
	static void removeDuplicates(String str)   
    {     
        LinkedHashSet<Character> set = new LinkedHashSet<>();   
           for(int i=0;i<str.length();i++)   
            set.add(str.charAt(i));   
            for(Character ch : set)   
            System.out.print(ch);   
    }   
}
