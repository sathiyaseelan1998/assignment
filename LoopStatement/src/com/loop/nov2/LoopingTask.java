package com.loop.nov2;

public class LoopingTask {

	private void printOne() {
		
		int start=0;
		int end=5;
		while(start<end) {
			System.out.print(1+" ");
			start=start+1;
		}	
		System.out.println();
	}
	private void print1234() {
		
		int start=1;
		int end=5;
		while(start<end) {
			System.out.print(start+" ");
			start=start+1;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoopingTask loop=new LoopingTask();
		loop.printOne();
		loop.print1234();
		loop.multiple3And5();
		loop.multiple3OR5();
		loop.divide100();
		loop.countOf100();
		loop.addOf_n_No();
		loop.primeOrNot();
		loop.reverseNumber();
		loop.noOfReverseNumber();
		loop.sumOfReverseNumber();

	}
	private void sumOfReverseNumber() {
		// TODO Auto-generated method stub
		int number=67547;
		int sum=0;
		while(0<number) {
			int rem=number%10;
			sum=sum+rem;
			number=number/10;
			
		}
		System.out.println("Sum of Reverse number: "+sum);
	}
	private void noOfReverseNumber() {
		// TODO Auto-generated method stub
		int number=5678892;
		int count=0;
		while(0<number) {
			int rem=number%10;
			count=count+1;
			number=number/10;
		}
		System.out.println("No of Reverse No: "+count);
		
	}
	private void reverseNumber() {
		// TODO Auto-generated method stub
		int number=2345;
		while(0<number) {
			int rem=number%10;
			System.out.print(rem);
			number=number/10;
		}
		System.out.println();
	}
	private void primeOrNot() {
		// TODO Auto-generated method stub
		int number=17;
		int div=2;
		int count=0;
		while(div<number) {
			if(number%div==0) {
				count=count+1;
			}
			div=div+1;
		}
		if(count==0) {
			System.out.println(number+" is prime number");
		}
		else {
			System.out.println(number+" is not prime number");
		}
		
	}
	private void addOf_n_No() {
		// TODO Auto-generated method stub
		int start=1;
		int end=10;
		int total=0;
		while(start<=end) {
			total=total+start;
			start=start+1;
		}
		System.out.println("Add of first "+end+" No:"+total);
	}
	private void countOf100() {
		// TODO Auto-generated method stub
		int number=100;
		int div=2;
		int count=0;
		while(div<number) {
			if(number%div==0) {
				count=count+1;
			}
			div=div+1;
		}
		System.out.println("count of hundred:"+count);
	}
	private void divide100() {
		// TODO Auto-generated method stub
		int number=100;
		int div=2;
		while(div<number) {
			if(number%div==0) {
				System.out.print(div+" ");
			}
			div=div+1;
		}
		System.out.println();
	}
	private void multiple3OR5() {
		// TODO Auto-generated method stub
		int start=3;
		while(start<=30) {
			if(start%3==0 || start%5==0) {
				System.out.print(start+" ");
			}
			start=start+1;
		}
		System.out.println();
	}
	private void multiple3And5() {
		// TODO Auto-generated method stub
		int start=3;
		
		while(start<=30) {
			
			if(start%3==0 && start%5==0) {
				System.out.print(start);
			}
			start=start+1;
		}
		System.out.println();
	}
	

}	


