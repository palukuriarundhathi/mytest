import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Strrev {

	public static void main(String[] args) {
		
		Eliminatesduplicateswithset();
		reversewithchararray();
		splitstring();
		eliminateduplicatessanddisplaycount();
		largestsequence();
	}
	
	
		static void eliminateduplicatessanddisplaycount()   
	    {   
			String info = "javaTpoint is the best learning website";  
	          char str[] = info.toCharArray();  
	          int length = str.length;   
              int index = 0;   
	        for (int i = 0; i < length; i++)   
	        {   
	              
	            // Check whether str[i] is present before or not   
	            int j;   
	            for (j = 0; j < i; j++)    
	            {   
	                if (str[i] == str[j])   
	                {   
	                    break;   
	                }   
	            }   
	    
	            // If the character is not present before, add it to resulting string   
	            if (j == i)    
	            {   
	                str[index++] = str[i];   
	            }   
	        }   
	        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
	    }   
	
	public static void largestsequence() {
		String strnumber = "19,20,45,46,47";
		int k =0;
		String[] strarr = strnumber.split(",");
		String[] strarr1 = strnumber.split(",");
		
//		for(int i =0;i<strarr.length-1;i++) {
//			int j =Integer.parseInt( strarr[i]);
//			for
//			int l =Integer.parseInt( strarr[i+1]);
//			System.out.println(l);
//		     if(j==l) {
//				k=k+1;
//				System.out.println(k);
//			}
//		}
		
	}
	public static void Eliminatesduplicates() {
	}
	      
	public static void Eliminatesduplicateswithset() {
		String str = "aabbccddeeffgghhiijj";		
		Set<Character> charset = new LinkedHashSet<Character>();
		char[] charr=str.toCharArray();
		for(int  i=0;i<charr.length;i++) {
		charset.add(charr[i]);
		}
		System.out.println(charset);
	}
	public static void reversewithchararray() {
		
      String str = "aabbccddeeffgghhiijj";
	
		char[] charr=str.toCharArray();
		int length =charr.length;
		char[] charset  = new char[length];
	
		  for(int j =0;j<length;j++)
		  {
			charset[j]= charr[length-j-1];
		  }
		

		System.out.println(charset);

}
	
	public static void splitstring() {
		
	      String str = "20 out of 50 50067 google search";
		
			String[] strarr=str.split(" ");
			int length =strarr.length;
			
			if(Integer.parseInt(strarr[4])>5000) {
			
			System.out.println("true");

	}
			else
				System.out.println("false");
	
	}
	
	
	
}