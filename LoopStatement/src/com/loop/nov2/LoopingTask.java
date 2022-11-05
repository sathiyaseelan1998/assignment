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
		//loop.printOne();
		//loop.print1234();
		//loop.multiple3And5();
		//loop.multiple3OR5();
		//loop.divide100();
		//loop.countOf100();
		//loop.addOf_n_No();
		//loop.primeOrNot();
		//loop.reverseNumber();
		//loop.noOfReverseNumber();
		//loop.sumOfReverseNumber();
		//loop.commonDivisor();
		//loop.greatestCommonDivisor();
		//loop.reverseInteger();
		//loop.palindrome();
		//loop.factorial(5);
		//loop.allFactorials();
		//loop.multiple1To10();
		//loop.multiple11();
		//loop.powerOfCube();
		//loop.powerOfSquare();
		//loop.amstrongNo();
		//loop.neonNumber();
		loop.strongNo();
	}
	private void strongNo() {
		// TODO Auto-generated method stub
		int number=145;
		int original=number;
		int fact=0;
		while(0<number) {
			int rem=number%10;
			fact=fact+factorial(rem);//call factorial method
			number=number/10;
		}
		if(original==fact) {
			System.out.println(original+" is Strong Number");
		}
		else{
			System.out.println(original+" is Not Strong Number");
		}
		
	}
	private void neonNumber() {
		// TODO Auto-generated method stub
		int number=9;
		int square=number*number;
		int sum=0;
		while(0<square) {
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		if(number==sum) {
			System.out.println(number+" is Neon Number");
		}
		else{
			System.out.println(number+" is Not Neon Number");
		}
		
	}
	private void amstrongNo() {
		// TODO Auto-generated method stub
		int number=153;
		int original=number;
		int sum=0;
		while(0<number) {
			int rem=number%10;
			sum=sum+(rem*rem*rem);
			number=number/10;
		}
		if(original==sum) {
			System.out.println(original+" is Amstrong Number");
		}
		else {
			System.out.println(original+" is Not Amstrong Number");
		}
	}
	private void powerOfSquare() {
		// TODO Auto-generated method stub
		int start=1;
		int end=10;
		while(start<=end) {
			int result=start*start;
			System.out.print(result+" ");
			start=start+1;
		}
		
	}
	private void powerOfCube() {
		// TODO Auto-generated method stub
		int number=1;
		int end=4;
		while(number<=end) {
			int result=number*number*number;
			System.out.println(result);
			number=number+1;
		}
	}
	private void multiple11() {
		// TODO Auto-generated method stub
		int number=1;
		int multiple=11;
		while(number<=121) {
			System.out.println(number);
			number=number*multiple;
		}
		
	}
	private void multiple1To10() {
		// TODO Auto-generated method stub
		int start=1;
		int end=10;
		while(start<=4) {
			int result=start*end;
			System.out.println(result);
			start=start+1;
			end=end-1;
		}
		
	}
	private void allFactorials() {
		// TODO Auto-generated method stub
		int fact=5;
		while(0<fact) {
			System.out.println(factorial(fact));//call factorial method
			fact=fact-1;
		}
	}
	private int factorial(int fact) {
		// TODO Auto-generated method stub
		//int fact=10;
		int count=1;
		while(0<fact) {
			count=count*fact;
			fact=fact-1;
		}
		//System.out.println(count);
		return count;
	}
	private void palindrome() {
		// TODO Auto-generated method stub
		int number=7887;
		int original=number;
		int reverse=0;
		while(0<number) {
			int rem=number%10;
			reverse=(reverse*10)+rem;
			number=number/10;
		}
		if(original==reverse) {
			System.out.println(original+" is palindrome");
		}
		else {
			System.out.println(original+" is not palindrome");
		}
	}
	private void reverseInteger() {
		// TODO Auto-generated method stub
		int number=78966;
		int reverse=0;
		while(0<number) {
			int rem=number%10;
			reverse=(reverse*10)+rem;
			number=number/10;
		}
		System.out.println(reverse);
	}
	private void greatestCommonDivisor() {
		// TODO Auto-generated method stub
		int no1=100;
		int no2=120;
		int div=2;
		int common=0;
		int small=no1<no2?no1:no2;
		while(div<small) {
			if(no1%div==0 && no2%div==0) {
				common=div;
			}
			div=div+1;
		}
		System.out.println("Greatest Common Number: "+common);
		
	}
	private void commonDivisor() {
		// TODO Auto-generated method stub
		int no1=100;
		int no2=120;
		int div=2;
		int small=no1<no2?no1:no2;
		//System.out.println(small);
		while(div<=small) {
			if(no1%div==0 && no2%div==0) {
				System.out.println(div);
			}
			div=div+1;
		}
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


