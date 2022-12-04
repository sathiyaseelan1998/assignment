package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling eh=new ExceptionHandling();
		//eh.tryCatch();
		//eh.multipleCatch();
		eh.multipleTry();
	}

	private void multipleTry() {
		// TODO Auto-generated method stub
		try {
			System.out.println("hi"+10/5);
			try {
				String s="virat";
				System.out.println(s.charAt(7));
			}
			catch (StringIndexOutOfBoundsException e) {
				System.out.println("name index small");
			}
		}
		
		catch (ArithmeticException e) {
			System.out.println("0 not use by divisor");
		}
	}

	private void multipleCatch() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no1=0;
		int no2=0;
		int[] ar=new int[3];
		try {
			int[] a=new int[-3];
			no1=sc.nextInt();
			no2=sc.nextInt();
			System.out.println(no1/no2);
			ar[3]=10;
		}
		catch(ArithmeticException e) {
			System.out.println("chek no2");
		}
		catch(InputMismatchException e) {
			System.out.println("enter number only");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("should be not index negative");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

	private void tryCatch() {
		// TODO Auto-generated method stub
		int no1=10;
		int no2=0;
		try {
			System.out.println(no1/no2);
		}
		catch(ArithmeticException e) {
			System.out.println("check no2");
		}
		
		
	}

}
