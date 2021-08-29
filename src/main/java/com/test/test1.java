package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //  WebDriverManager.chromedriver().setup();
    //  ChromeDriver obj new ChromeDriver()
   //   WebDriver driver = new ChromeDriver();
      
    //  driver.get("https://www.google.com/");
		
   // String Strverify = driver.findElement(By.xpath("//div[@class ='pcTkSc']//span")).getText();
      
      Findrepeter();
    //  FindrepeterAndDisplayCount();
   
	}
	static void FindrepeterAndDisplayCount()
	{
	String str = "AABBCCDDEEFFGGHH";
	int repeatedcount =0;
	int length = str.length();
      for(int i =0;i<length;i++) {
		   for(int j =0;j<length;j++)
		    {
			 if(str.charAt(i)==str.charAt(j))
			  {
				 repeatedcount++;
				 char ch = str.charAt(i);
			  }
			 }
		   System.out.println(str.charAt(i)+"--"+repeatedcount);
		  String replace= String.valueOf(str.charAt(i)).trim();
		  str.replaceAll(replace,"");
		   repeatedcount=0;
         	}
         }
	  
	
	
	
	
	static void Findrepeter(){
	    String s="aabbccddee" ;//"mmababctamantlslmag";
	    int distinct = 0 ;

	    for (int i = 0; i < s.length(); i++) {

	        for (int j = 0; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                distinct++;

	            }
	        }   
	        System.out.println(s.charAt(i)+"--"+distinct);
	        String d=String.valueOf(s.charAt(i)).trim();
	        s=s.replaceAll(d,"");
	        distinct = 0;

	    }

	}
	
}

