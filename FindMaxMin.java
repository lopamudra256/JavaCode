package com.Fillo.Test;

public class FindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,9,56,78,34,2,0,4,89};
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) 
				max=arr[i];
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println(max+"   "+min);
		

	}

}
