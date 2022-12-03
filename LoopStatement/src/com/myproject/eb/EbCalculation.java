package com.myproject.eb;

import java.util.Scanner;

public class EbCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Units");
		int unit=sc.nextInt();
		double amount=0;
		if(unit<=100) {
			amount=unit*0;
			System.out.println("Pay Amount : "+amount);
		}
		else if(unit<=200) {
			amount=(100*0)+((unit-100)*1.5)+20;
			System.out.println("Pay Amount : "+amount);
		}
		else if(unit<=500) {
			amount=(100*0)+(100*2)+((unit-200)*3)+30;
			System.out.println("Pay Amount : "+amount);
		}
		else if(unit>500) {
			amount=(100*0)+(100*3.5)+(300*4.6)+((unit-500)*6.6)+50;
			System.out.println("Pay Amount : "+amount);
		}
	}

}
