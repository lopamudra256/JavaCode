package com.Fillo.Test;

public class ArrayOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {8,9,7,5,4,2,3,1};
		System.out.println(arr1.length);
		
		int n=arr1.length+1;
		int sum=n*(n+1)/2;
		int sum2=0;
		for(int a:arr1) {
			sum2=sum2+a;
		}
		
		System.out.println("Missing element is :"+(sum-sum2));
	}

}
