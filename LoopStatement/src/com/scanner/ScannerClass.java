package com.scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerClass s=new ScannerClass();
		//s.primeNo();
		//s.divisorOfNo();
		//s.additionOf_N_No();
		//s.printReverseNo();
		//s.reverseNo();
		//s.commonDivisor();
		//s.greatestCommonDivisor();
		//s.smallestCommonDivisor();
		//s.palindrome();
		//s.factorial();
		//s.allFactorial();
		//s.powerOfSquare();
		//s.powerOfCube();
	}
	private void powerOfCube() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int no1=sc.nextInt();
		System.out.println("Enter Ending Number");
		int no2=sc.nextInt();
		int result=0;
		while(no1<=no2) {
			result=no1*no1;
			System.out.print(result+"  ");
			no1++;
		}
		
	}

	private void powerOfSquare() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int no1=sc.nextInt();
		System.out.println("Enter Ending Number");
		int no2=sc.nextInt();
		int result=0;
		while(no1<=no2) {
			result=no1*no1*no1;
			System.out.print(result+"  ");
			no1++;
		}
		
	}

	private void allFactorial() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = sc.nextInt();
		while (0 < no) {
			int rem=no%10;
			no/=10;
			int fact = 1;
			while (0 < rem) {
				fact = fact * rem;
				rem--;
			}
			System.out.println(fact);
		}
	}

	private void factorial() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int fact=1;
		while(0<no) {
			fact=fact*no;
			no--;
		}
		System.out.println(fact);
	}

	private void palindrome() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int copy=no;
		int reverse=0;
		while(0<no) {
			int rem=no%10;
			reverse=(reverse*10)+rem;
			no=no/10;
		}
		if(copy==reverse) {
			System.out.println(copy+" is palindrome");
		}
		else {
			System.out.println(copy+" is not palindrome");
		}
	}

	private void smallestCommonDivisor() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int div=2;
		int smallest=0;
		while(div<no) {
			if(no%div==0) {
				smallest=div;
				break;
			}
			div++;
		}
		System.out.println(smallest);
	}

	private void greatestCommonDivisor() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int div=2;
		int greatest=0;
		while(div<no) {
			if(no%div==0) {
				greatest=div;
			}
			div++;
		}
		System.out.println(greatest);
	}

	private void commonDivisor() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no1=sc.nextInt();
		System.out.println("Enter the Number");
		int no2=sc.nextInt();
		int div=2;
		while(div<no2) {
			if(no1%div==0 && no2%div==0) {
				System.out.print(div+" ");
			}
			div++;
		}
		
		
	}

	private void reverseNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int reverse=0;
		while(0<no) {
			int rem=no%10;
			reverse=(reverse*10)+rem;
			no=no/10;
		}
		System.out.println(reverse);
	}

	private void printReverseNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		while(0<no) {
			int rem=no%10;
			System.out.print(rem);
			no=no/10;
		}
	}

	private void additionOf_N_No() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int start=sc.nextInt();
		System.out.println("Enter Ending Number");
		int end=sc.nextInt();
		int sum=0;
		while(start<=end) {
			sum=sum+start;
			start++;
		}
		System.out.println(sum);
	}

	private void divisorOfNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int div=2;
		while(div<no) {
			if(no%div==0) {
				System.out.print(div+" ");
			}
			div++;
		}
	}

	private void primeNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int div=2;
		int count=0;
		while(div<no) {
			if(no%div==0) {
				count++;
			}
			div++;
		}
		if(count==0) {
			System.out.println(no+" is prime no");
		}
		else {
			System.out.println(no+" is not prime no");
		}
	}

}
