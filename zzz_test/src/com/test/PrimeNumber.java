package com.test;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=372,rem,rev=0;
	
	int copy=n;
	
	while(copy!=0)
	{
		rem=copy%10;
		rev=rev+(rem*rem*rem);
		copy=copy/10;
	}
	
	if(n==rev)
	{
		System.out.println("amstrong");
	}
	else
	{
		System.out.println("not amstrong");
	}
	}

}
