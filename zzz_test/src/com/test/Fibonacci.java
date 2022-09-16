package com.test;

public class Fibonacci {

	public static void main(String args[])  
	{
		int num=10;
		int first=0;
		int second=1;
		
		for(int i=0;i<num;i++){
			
			System.out.print(first+" ");
			int total=first+second;
			first=second;
			second=total;
			
		}
		
	}
	
}
