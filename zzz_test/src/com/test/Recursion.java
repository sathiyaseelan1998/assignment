package com.test;

public class Recursion {

	static int fact(int n)
	{
		if(n!=0)
		{
			return n*fact(n-1);
		}
		else{
		return 1;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fact(1));

	}

}
