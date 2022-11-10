package javaCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {

	private void returnchar() {
   	 
    }
	
	private void returnchar1() {
	   	 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String digits = "23";
         char ch;
         int comb1,comb2,comb3,comb4,i=0;
         HashMap<Integer,String> map = new HashMap<Integer,String>(); 
         map.put(2, "abc");
         map.put(3, "def");
         map.put(4, "ghi");
         map.put(5, "jkl");
         map.put(6, "mno");
         map.put(7, "pqrs");
         map.put(8, "tuv");
         map.put(9, "wxyz");
         
         int digitsize = digits.length();
         List<String> li = new ArrayList<String>();
         
         if(digitsize == 0) {
        	 System.out.println(li);
         }
         
         
         
         while(i<digitsize) {
        	 int x = Integer.parseInt(digits, digits.charAt(i));
        	// ch = map.get(x).charA 
         }
         
         System.out.println(map.get(3).charAt(2));
         System.out.println(digits.length());
         
	}

}
