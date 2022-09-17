package com.Fillo.Test;

public class CapitalizeEach1stLetter {

	public static void main(String[] args) {
		
		String str= "today is friday";
		String newStr =Capitalize(str).trim();

		System.out.println(newStr);
		System.out.println(newStr.length());
	}
	public static String Capitalize(String str) {
		
		String[] arr=str.split(" ");
		String newStr ="";
		for(String s:arr) {
			newStr=newStr+s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()+" ";
		}
		
		return newStr;
		
	}
}
