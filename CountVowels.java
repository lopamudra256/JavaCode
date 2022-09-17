package com.Fillo.Test;

public class CountVowels {

	public static void main(String[] args) {
		
		System.out.println(countVow("Lopamudra"));
		}
		
		public static int countVow(String str) {
			int count=0;
			
			for(char ch:str.toCharArray()) {
				
				switch(ch) {
					case 'a':
						count++;
						break;
						
					case 'e':
						count++;
						break;
						
					case 'c':
						count++;
						break;
						
					case 'i':
						count++;
						break;
					case 'o':
						count++;
						break;
					case 'u':
						count++;
						break;
				
			}
			}
			return count;
			
			
			
			
		}
}
