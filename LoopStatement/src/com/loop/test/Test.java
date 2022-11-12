package com.loop.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		int fact=test.factorial(5);
		//System.out.println(fact);
		test.allFactorial(5);
	}

	private void allFactorial(int fact) {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=fact) {
			
			System.out.print(factorial(no)+" ");
			no=no+1;
		}
	}

	private int factorial(int fact) {
		// TODO Auto-generated method stub
		int no=1;
		while(0<fact) {
			no=no*fact;
			fact=fact-1;
		}
		return no;
	}

}
