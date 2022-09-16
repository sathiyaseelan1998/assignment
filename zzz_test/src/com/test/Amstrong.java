package com.test;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=356;
		int temp=n;
		
		int d1,d2,d3;
		
		d3=temp%10;
		temp=temp/10;
		
		d2=temp%10;
		temp=temp/10;
		
		d1=temp%10;
		
		int result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
		if(n==result){
			
			System.out.println("Amstrong Number");
		}
		else{
			System.out.println("Not Amstrong Number");
		}

	}

}
