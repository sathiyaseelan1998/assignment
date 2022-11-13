package com.recursion;

public class RecursionPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionPrograms rp=new RecursionPrograms();
		//System.out.println(rp.factorial(5));
		//rp.print1111(4);
		//rp.print1234(1);
		int prime=rp.primeOrNot(2);
		if(prime==0) {
			System.out.println("prime no");
		}
		else {
			System.out.println("not prime no");
		}
	}

	private int primeOrNot(int div) {
		// TODO Auto-generated method stub
		int no=11;
		int count=0;
			if(no>div) {
				if(no%div==0) {
				count=count+1;
				return count;
				}
				div=div+1;
				return primeOrNot(div);	
			}
				return count;
	}

	private int print1234(int no) {
		// TODO Auto-generated method stub
		System.out.println(no);
		no=no+1;
		if(no<=4) {
			return print1234(no);
		}
		
		return no;
	}

	private int print1111(int no) {
		// TODO Auto-generated method stub
		System.out.println(1);
		no=no-1;
		if(no>0) {
			return print1111(no);
		}
		return no;
		
	}

	private int factorial(int no) {
		// TODO Auto-generated method stub
		if(no==1) {
			return 1;
		}
		else {
			return no*factorial(no-1);
		}
	}

}
