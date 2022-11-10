package javaCollections;

public class ZigzagConversion {

	
	public static String zigZagConversion(String str,int numRows) {
		int strSize = str.length();
		String result = "";
	//	String s = result + str.charAt(0);
		int i=0;
		while(i<=strSize) {
			result = result + str.charAt(i);
			i = i + numRows+1;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "PAYPALISHIRING";
		int numRows = 3;
         System.out.println(zigZagConversion(str,numRows));
	}

}
