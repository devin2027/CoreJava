package javaCollections;

import java.util.HashMap;

public class longestPalindromeOfString {

//	public static String palindrome(String s) {
//
//		int max = 0;
//		String longestPalindromeOfSubstring = "";
//
//		for (int l = 0; l < s.length(); l++) {
//			for (int i = l; i < s.length(); i++) {
//				String str1 = "", str2 = "";
//				for (int k = l,j=i; k <= i && j>=l; j--,k++) {
//					str1 = str1 + s.charAt(k);
//					str2 = str2 + s.charAt(j);
//				}
//				if (str2.equals(str1)) {
//					if (str2.length() > max) {
//						max = str2.length();
//						
//						longestPalindromeOfSubstring = str2;
//						
//					}
//				}
//
//			}
//		}
//	
	
//return longestPalindromeOfSubstring;
//		if (s == null || s.length() == 0) {
//            return "";
//        }
//        int n = s.length();
//        boolean[][] dp = new boolean[n][n];
//        int max = 0;
//        String res = "";
//        for (int i = n - 1; i >= 0; i--) {
//            for (int j = i; j < n; j++) {
//                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
//                    dp[i][j] = true;
//                    if (j - i + 1 > max) {
//                        max = j - i + 1;
//                        res = s.substring(i, j + 1);
//                    }
//                }
//            }
//        }
//        return res;  
//	}
		
	
	
//static String result = "";
//    
//    public static String palindrome(String s) {
//        
//        if (s == null || s.length()==0) return "";
//        
//        for (int i = 0; i < s.length(); i++) {
//		
//			// if palindrome length is odd
//            expandAroundCenter(s, i, i);
//			
//			// if palindrome length is even
//            expandAroundCenter(s, i, i + 1);
//			
//        }
//        
//        return result;
//    }
//
//    private static void expandAroundCenter(String s, int left, int right) {
//        
//        int n = s.length();
//		
//		// expand until we found different character in left and r
//        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
//		
//            int len = right - left + 1;
//			
//			// if current palindrome string is of length greater than previous result
//            if(result.length()<len){
//                result = s.substring(left,right+1);
//            }
//			
//            left--;
//            right++;
//        }
//    }
//		
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s = "abccdadadeff";
//		 String output = palindrome(s);
//		palindrome(s);
//		 System.out.println(output);
//	}

	
	 static int longestPalSubstr(String str)
	    {
	        int n = str.length(); // calculcharAting size of string
	        if (n < 2)
	            return n; // if string is empty then size will be 0.
	                  // if n==1 then, answer will be 1(single
	                  // character will always palindrome)
	 
	        int maxLength = 1,start=0;
	        int low, high;
	        for (int i = 0; i < n; i++) {
	            low = i - 1;
	            high = i + 1;
	            while ( high < n && str.charAt(high) == str.charAt(i)) //increment 'high'                                  
	                high++;
	       
	            while ( low >= 0 && str.charAt(low) == str.charAt(i)) // decrement 'low'                   
	                low--;
	       
	            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high) ){
	                  low--;
	                high++;
	        }
	 
	        int length = high - low - 1;
	        if (maxLength < length){
	            maxLength = length;
	            start=low+1;
	        }
	    }   
	    System.out.print("Longest palindrome substring is: ");
	    System.out.println(str.substring(start, start + maxLength ));
	    return maxLength;
	       
	 }
	 
	    // Driver program to test above function
	    public static void main(String[] args)
	    {
	 
	        String str = "forgeeksskeegfor";
	        System.out.println("Length is: "
	                           + longestPalSubstr(str));
	    }
}
