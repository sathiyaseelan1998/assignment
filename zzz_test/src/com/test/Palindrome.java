package com.test;

public class Palindrome {

	public static void main(String arg[]){
		
		String orginal="madam";
		String reverse="";
		for(int i=orginal.length()-1;i>=0;i--)
		{
			reverse=reverse+orginal.charAt(i);
		}
		if(orginal.equals(reverse)){
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");

		}
	}
	
}
