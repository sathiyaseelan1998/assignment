package com.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling eh=new ExceptionHandling();
		eh.tryCatch();
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
