package com.Fillo.Test;

public class StringPallindrome {

	public static void main(String[] args) {
		
		System.out.println(checkPallindrome("madam"));
	}
	
	public static Boolean checkPallindrome(String str) {
		
		int len=str.length();
		char arr[]=str.toCharArray();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(str))
			return true;
		else return false;
		
		
	}
		

}
