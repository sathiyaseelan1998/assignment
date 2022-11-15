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
		//loop.strongNo();
		//loop.find1to100PrimeNo();
		//loop.find100to1000AmstrongNo();
		//loop.findFirstNprimeNo();
		//loop.findSquareRoot();
		//loop.smallestDivisor();
		//loop.greatestDivisor();
		//loop.samePowerOfNumber();
		//loop.perfectNumber();
		//loop.spyNumber();
		//loop.powerOfNumber(2,5);
		//loop.binaryToDecimal();
		//loop.decimalToBinary(7);
		//loop.swappingNo();
		//loop.swappingNoWithoutThirdVariable();
		//loop.fibonacii(25);
		//loop.findLMC();
		//loop.singleDegit(24567);
		loop.fibonaciiWithoutThirdVariable();
	}
	private void fibonaciiWithoutThirdVariable() {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		while(first<25) {
			System.out.print(first);
			//first=second;
			second=second-first;
			first=first+second;
		}
	}
	private void singleDegit(int number) {
		// TODO Auto-generated method stub
		int sum=0;
		while(0<number) {
			int rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		if(sum>9) {
			singleDegit(sum);
		}
		else {
			System.out.println(sum);
		}
		
	}
	private void findLMC() {
		// TODO Auto-generated method stub
		int no1=3;
		int no2=6;
		int max=no1>no2?no1:no2;
		while(true) {
			if(max%no1==0 && max%no2==0) {
				System.out.println(max);
				break;
			}
			max=max+1;
		}
		
	}
	private void fibonacii(int fibo) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int third=0;
		while(first<fibo) {
			
			System.out.print(first);
			third=first+second;
			first=second;
			second=third;
		}
		
	}
	private void swappingNoWithoutThirdVariable() {
		// TODO Auto-generated method stub
		int no1=25;
		int no2=32;
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println(no1+"--------"+no2);

	}
	private void swappingNo() {
		// TODO Auto-generated method stub
		int no1=27;
		int no2=37;
		int add=no1+no2;
		no2=add-no2;
		no1=add-no1;
		System.out.println(no1+"--------"+no2);
		
	}
	private void decimalToBinary(int number) {
		// TODO Auto-generated method stub
		String binary="";
		while(0<number) {
			int rem=number%2;
			binary=rem+binary;
			number=number/2;
		}
		System.out.println(binary);
	}
	private void binaryToDecimal() {
		// TODO Auto-generated method stub
		int binary=111;
		int power=0;
		int base=2;
		int result=0;
		while(binary>0) {
			int rem=binary%10;
			rem=rem*powerOfNumber(base, power);
			result=result+rem;
			power=power+1;
			binary=binary/10;
		}
		System.out.println(result);
	}
	private int powerOfNumber(int base,int power) {
		// TODO Auto-generated method stub
		int result=1;
		while(power>0) {
			
			result=result*base;
			power=power-1;
		}
	//	System.out.println(result);
		return result;
	}
	private void spyNumber() {
		// TODO Auto-generated method stub
		int number=132;
		int copy=number;
		int sum=0;
		int multiple=1;
		while(0<number) {
			int rem=number%10;
			sum=sum+rem;
			multiple=multiple*rem;
			number=number/10;
		}
		if(sum==multiple) {
			System.out.println(copy+" is spy number");
		}
		else{
			System.out.println(copy+" is not spy number");
		}
		
	}
	private void perfectNumber() {
		// TODO Auto-generated method stub
		int number=6;
		int div=1;
		int sum=0;
		while(div<number) {
			
			if(number%div==0) {
				sum=sum+div;
			}
			div=div+1;
		}
		if(number==sum) {
			System.out.println(number+" is perfet number");
		}
		else{
			System.out.println(number+" is not perfet number");
		}
		
	}
	private void samePowerOfNumber() {
		// TODO Auto-generated method stub
		int number=1;
		while (number < 5) {
			int count = 0;
			int result = 1;
			while (count < number) {

				result = result * number;
				count = count + 1;
			}
			System.out.println(result);
			number=number+1;
		}
	}
	private void greatestDivisor() {
		// TODO Auto-generated method stub
		int number=100;
		int div=number/2;
		while(div>=2) {
			if(number%div==0) {
				System.out.println(div);
				break;
			}
			div=div+1;
		}
	}
	private void smallestDivisor() {
		// TODO Auto-generated method stub
		int number=100;
		int div=2;
		while(div<number) {
			if(number%div==0) {
				System.out.println(div);
				break;
			}
			div=div+1;
		}
		
	}
	private void findSquareRoot() {
		// TODO Auto-generated method stub
		int number=100;
		int div=2;
		while(div<=number) {		//while(div<=number/2)
			
			if(number/div==div) {
				System.out.println(div);
			}
			div=div+1;
		}
		
	}
	private void findFirstNprimeNo() {
		// TODO Auto-generated method stub
		int number = 2;
		int primeCount=0;
		while (primeCount < 10) {
			int div = 2;
			int count = 0;
			while (div < number) {

				if (number % div == 0) {
					count = count + 1;
					break;
				}
				div = div + 1;
			}
			if (count == 0) {
				System.out.print(div+" ");
				primeCount=primeCount+1;
			} 
			number=number+1;
		}
	}
	private void find100to1000AmstrongNo() {
		// TODO Auto-generated method stub
		int number=100;
		while(number<1000) {
			int copy=number;
			int result=0;
			while(0<copy) {
				int rem=copy%10;
				result=result+(rem*rem*rem);
				copy=copy/10;
			}
			if(number==result) {
				System.out.println(number);
			}
			number=number+1;
		}
	}
	private void find1to100PrimeNo() {
		// TODO Auto-generated method stub
		int number=100;
		int div1=2;
		while(div1<number) {
			int div2=div1;
			int count=0;
			while(div2<div1) {
				if(div1%div2==0) {
					count=count+1;
				}
				div2=div2+1;
			}
			if(count==0) {
				System.out.print(div1+" ");
			}
			div1=div1+1;
		}
		
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


