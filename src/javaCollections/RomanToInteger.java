package javaCollections;

import java.util.HashMap;

public class RomanToInteger {

//	public static void addition(Integer s,HashMap<String,Integer> map) {
//		
//	}
	
    public static int subtraction(int x,int y) {
		int result;
		result = x+y;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "IV";
     int size = s.length();
    
     HashMap<String,Integer> map = new HashMap<String,Integer>();
     map.put("I",1);
     map.put("V",5);
     map.put("X",10);
     map.put("L",50);
     map.put("C",100);
     map.put("D",500);
     map.put("M",1000);
     
     System.out.println(map.get("I"));
     String str = s.substring(1, 1);
    	 if(size == 2 ) {
        	if( s.charAt(0)=='I' && ( s.charAt(1) == 'V' || s.charAt(1) == 'X' )) {
        		System.out.println( subtraction(map.get("I"),map.get(str) ) );
        	}
        	if( s.charAt(0)=='X' && ( s.charAt(1) == 'L' || s.charAt(1) == 'C' )) {
        		System.out.println(subtraction(map.get("X"),map.get(s.substring(1, 1))));
        	}
        	if( s.charAt(0)=='C' && ( s.charAt(1) == 'D' || s.charAt(1) == 'M' )) {
        		System.out.println(subtraction(map.get("C"),map.get(s.substring(1, 1))));
        	}
         } 
    	// else
    		// addition(s,map);
     
	}

}
