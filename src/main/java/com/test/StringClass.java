package com.test;

public class StringClass {
	
 public static void main(String[] args) {
	 String str = "This is rainy season";
	 String strcompare = "This is rainy season";
	System.out.println("length : " +str.length());
	
	System.out.println(str.charAt(5));
	System.out.println(str.indexOf("i"));
	System.out.println(str.indexOf(str.indexOf("i")));
	System.out.println(str.indexOf(str.indexOf(str.indexOf("i"))));
	
	System.out.println(str.compareToIgnoreCase(strcompare));
	System.out.println(str.equalsIgnoreCase(strcompare));
	System.out.println(str.substring(6));
	
	 StringClass obj = new StringClass();
	 System.out.println(obj.breverseString("Arundhathi"));
	 System.out.println(obj.creverseString("hasini"));
	 
	 String test = "Hello_world_Test_Selenium";
	
	 
	  String str1[]= test.split("_");
	  for (String resultstring : str1) {
	

		  System.out.println(resultstring);
		 System.out.println(repeatedcount("ddhhhshsh",'d'));
		 
	  }  
 }
 public static int repeatedcount(String s, char c)
 {
     int res = 0;

     for (int i=0; i<s.length(); i++)
     {
         // checking character in string
         if (s.charAt(i) == c)
         res++;
     }
  
     return res;
 }
  
	  //using byte[] array
	  public  String  breverseString(String str) {
	   String input = str;
      byte[] strAsByteArray = input.getBytes();
      byte[] result = new byte[strAsByteArray.length];

      for (int i = 0; i < strAsByteArray.length; i++)
          result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        return new String(result);
	  }
  
	  //using char[] array
	  public  String creverseString(String str) {
	   String input = str;
      char[] strAscharArray = input.toCharArray();
      char[] result = new char[strAscharArray.length];

      for (int i = 0; i < strAscharArray.length; i++)
          result[i] = strAscharArray[strAscharArray.length - i - 1];
        return new String(result);
	  }
}


