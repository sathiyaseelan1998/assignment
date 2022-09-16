package com.test;

import java.util.Scanner;

public class StringReverse {

	public static void main(String arg[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String...");

		String orginal=sc.nextLine();
		//String orginal="Reverse The String";
		int size=orginal.length();
		String reverse="";
		for(int i=size-1;i>=0;i--){
			
			reverse=reverse+orginal.charAt(i);
		}
		
		//System.out.println(orginal);
		System.out.println(reverse);
	}
	
	
}
