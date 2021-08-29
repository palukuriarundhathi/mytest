package com.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringReverse {

	public static void main(String[] args) {
		
		//using StringBuilder
		String str = "Arundhathi";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
		//using stringBuffer
		String str1 = "hasini";
		StringBuffer sbr = new StringBuffer(str1);
		System.out.println(sbr.reverse());
		System.out.println("reverseString : " + reverseString("hai"));
		System.out.println("EliminateDuplicates:"  + EliminateDuplicates("arundahthi"));
		System.out.println("Repeatedcharcount in a sring  : " + repeatedcount("arundhathi",'a'));
		
		 
	}
	public static String reverseString(String str){  
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    return rev;  
	} 
	public static String EliminateDuplicates(String str){  
	   Set<Character> objset = new LinkedHashSet<>();
	   StringBuilder sb ;
	   for(int i=0;i<str.length();i++)
	   {
		   objset.add(str.charAt(i));
	   }
	   for(Character ch :objset)
	   {
		 //  sb.append(0);
	   }
		   
	   return str;
	}
	public static int repeatedcount(String s, char c)
	 {
	     int res = 0;
	     for (int i=0; i<s.length(); i++)
	     {
	       if (s.charAt(i) == c)
	         res++;
	     }
	   return res;
	 }
	
//	public static String EliminateDuplicates(String str){  
//	    char ch[]=str.toCharArray();  
//	   String rev="";  
//	    for(int i=0;i>=ch.length;i++){  
//	         
//	    }  
//	    return rev;  
//	    
//	}
	


}
