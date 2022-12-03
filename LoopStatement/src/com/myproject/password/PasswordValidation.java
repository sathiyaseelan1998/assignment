package com.myproject.password;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String old[]= {"abcA@123","abcA$123","sa123!B7"};
		int lower=0;
		int upper=0;
		int number=0;
		int special=0;
		boolean check=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password");
		String pass=sc.nextLine();
		for(int i=0;i<old.length;i++) {
			if(pass.equals(old[i])) {
				System.out.println("Already used this password please create new one");
				check=true;
				break;
			}
		}
		if(!(pass.length()>=8 && pass.length()<=15)) {
			System.out.println("password must have 8 to 15 character");
			check=true;
		}
		if(check==false) {
			
				for(int i=0;i<pass.length();i++) {
			if(pass.charAt(i)>='A' && pass.charAt(i)<='Z') {
				upper++;
			}
			else if(pass.charAt(i)>='a' && pass.charAt(i)<='z') {
				lower++;
			}
			else if(pass.charAt(i)>='0' && pass.charAt(i)<='9') {
				number++;
			}
			else if((pass.charAt(i)>=58 && pass.charAt(i)<=64) ||(pass.charAt(i)>=33 && pass.charAt(i)<=47)||
					(pass.charAt(i)>=94 && pass.charAt(i)<=96) || (pass.charAt(i)>=123 && pass.charAt(i)<=126)) {
				special++;
			}
		}
		if(upper==0) {
			System.out.println("Atleast add one upper case");
		}
		else if(lower==0) {
			System.out.println("Atleast add one lower case");
		}
		else if(number==0) {
			System.out.println("Atleast add one number ");
		}
		else if(special==0) {
			System.out.println("Atleast add one special character");
		}
		else {
			System.out.println("Password is Valid");
		}
		}
	}

}
