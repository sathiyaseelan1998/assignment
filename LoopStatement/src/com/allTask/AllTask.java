package com.allTask;

public class AllTask {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllTask at=new AllTask();
		//at.divisorOf100(100);
		//at.primeOrNot(13);
		//at.divisorOf100OnlyPrime(100);
		//at.reverseNo(456789);
		//at.reverseNo2(456789);
		//at.powerOf5(2,5);
		//at.powerOfNo(2,5);
		//at.threeSwappingNo(5,6,7);
		//at.fourSwappingNo(5,6,7,8);
		//at.powerOfcube(1);
		//at.oddOfCube(1);
		//at.powerOfSameNo(1,1);
		//at.binaryToDecimal(111);
		//at.fibonacii(100);
		//at.print1To100(1);
		//at.print5Series(1);
		//at.additionOf20No(1);
		//at.additionOf20PrimeNo();
		//at.print1_11_111(1);
		//at.print12345();
		//at.print1To15();
		//at.multipleOf5();
		//at.multipleOf5singleLoop();
		//at.factorial(10);
		//at.binaryToOctal();
		//at.fibonacii5to80();
		//at.findLCM(3,6);
		//at.greatestDivisor();
		//at.smallestDivisor();
		//at.greatestAndsmallDivisor();
		//at.palindrome(1221);
		at.print_101010();
	}

	private void print_101010() {
		// TODO Auto-generated method stub
		int count=1;
		while (count <= 4) {
			int no = 1;
			while (no >= 0) {
				System.out.print(no + " ");
				no--;
			}
			count++;
		}
	}

	private void palindrome(int no) {
		// TODO Auto-generated method stub
		int copy=no;
		int reverse=0;
		while(copy>0) {
			int rem=copy%10;
			reverse=(reverse*10)+rem;
			copy=copy/10;
		}
		if(no==reverse) {
			System.out.println(no+" is palindrome");
		}
		else{
			System.out.println(no+" is not  palindrome");
		}
		
	}

	private void greatestAndsmallDivisor() {
		// TODO Auto-generated method stub
		int no=300;
		int div=2;
		boolean identity=false;
		int small=0;
		while(div<no) {
			if(no%div==0) {
				small=div;
				identity=true;
				//System.out.println("smallest divisor "+div);
				div=no/2;
				if(div>2) {
					System.out.println("greatest divisor "+div);
					break;
				}
			}
			
			div++;
		}
	}

	private void smallestDivisor() {
		// TODO Auto-generated method stub
		int no=15;
		int div=2;
		while(div<no) {
			if(no%div==0) {
				System.out.println(div);
				break;
			}
			div++;
		}
	}

	private void greatestDivisor() {
		// TODO Auto-generated method stub
		int no=100;
		int div=no/2;
		while(div>2) {
			if(no%div==0) {
				System.out.println(div);
				break;
			}
			div++;
		}
	}

	private  void findLCM(int no1, int no2) {
		// TODO Auto-generated method stub
		int max=no1>no2?no1:no2;
		while(true) {
			if(max%no1==0 && max%no2==0) {
				System.out.println(max);
				break;
			}
			max++;
		}
	}

	private void fibonacii5to80() {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int third=0;
		while(first<80) {
			
			if(first>5 && first<80) {
				System.out.print(first+" ");
			}
			third=first+second;
			first=second;
			second=third;
		}
		
	}

	private void binaryToOctal() {
		// TODO Auto-generated method stub
		int binary=1010101;
		int decimal=binaryToDecimal(binary);
		String octal=" ";
		while(0<decimal) {
			int rem=decimal%8;
			octal=rem+octal;
			decimal=decimal/8;
		}
		System.out.println(binary+" to octal no "+octal);
	}

	private void factorial(int no) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int third=0;
		while(first<no) {
			//System.out.print(first+" ");
			third=first+second;
			first=second;
			second=third;
			if(first>2 && first<10) {
				primeOrNot(first);
			}
		}
		
	}

	private void multipleOf5singleLoop() {
		// TODO Auto-generated method stub
		int no=1;
		int table=5;
		while(no<=5) {
			int result=no*table;
			System.out.print(result+" ");
			result=result-no;
			System.out.print(result+" ");
			
			no++;
		}
	}

	private void multipleOf5() {
		// TODO Auto-generated method stub
		int no=1;
		int table=5;
		while(no<=5) {
			int result=no*table;
			System.out.print(result+" ");
			no++;
		}
		
	}

	private void print1To15() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=15) {
			System.out.print(no+" ");
			if(no%5==0) {
				System.out.println();
			}
			no++;
		}
		
	}

	private void print12345() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5) {
			System.out.print(no+" ");
			no++;
		}
	}

	private void print1_11_111(int no1) {
		// TODO Auto-generated method stub
		while(no1<=5) {
			int no2=1;
			while(no1>=no2) {
				System.out.print(1);
				no2++;
			}
			System.out.print(" ");
			no1++;
		}
		
	}

	private void additionOf20PrimeNo() {
		// TODO Auto-generated method stub
		int number = 2;
		int primeCount=0;
		int sum=0;
		while (primeCount < 20) {
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
				sum=sum+div;
				//System.out.print(div+" ");
				primeCount=primeCount+1;
			} 
			number=number+1;
		}
		System.out.println(sum);
	}

	private void additionOf20No(int no) {
		// TODO Auto-generated method stub
		int sum=0;
		while(no<=20) {
			sum=sum+no;
			no++;
		}
		System.out.println(sum);
		
	}

	private void print5Series(int no) {
		// TODO Auto-generated method stub
		while(no<=100) {
			if(no%10==5 || no/10==5) {
				System.out.print(no+" ");
			}
			no++;
		}
	}

	private void print1To100(int no) {
		// TODO Auto-generated method stub
		while(no<=100) {
			System.out.print(no+" ");
			no++;
		}
		
	}

	private void fibonacii(int no) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int third=0;
		while(first<=no) {
			//System.out.print(first);
			third=first+second;
			first=second;
			second=third;
			primeOrNot(first);
		}
	}

	private int binaryToDecimal(int binary) {
		// TODO Auto-generated method stub
		int decimal=0;
		int power=0;
		while(0<binary) {
			int rem=binary%10;
			decimal=decimal+(rem*powerOf5(2, power));
			power++;
			binary=binary/10;
		}
		System.out.println(decimal);
		return decimal;
	}

	private void powerOfSameNo(int no, int power) {
		// TODO Auto-generated method stub
		while(no<=4) {
			int result=1;
			int count=0;
			while(count<no) {
				result=result*no;
				count++;
			}
			System.out.print(result+" ");
			no++;
		}
		
	}

	private void oddOfCube(int no) {
		// TODO Auto-generated method stub
		while(no<=5) {
			if(no%2!=0) {
				int result=no*no*no;
				System.out.print(result+" ");
			}
			no++;
		}
	}

	private void powerOfcube(int no) {
		// TODO Auto-generated method stub
		while(no<=4) {
			int result=no*no*no;
			System.out.print(result+" ");
			no++;
		}
		
	}

	private void fourSwappingNo(int a, int b, int c, int d) {
		// TODO Auto-generated method stub
		System.out.println("before swapping---> "+"a="+a+" b="+b+" c="+c+" d="+d);

		a=a+b+c+d;
		b=a-(b+c+d);
		c=a-(b+c+d);
		d=a-(b+c+d);
		a=a-(b+c+d);
		System.out.println("after swapping---> "+"a="+a+" b="+b+" c="+c+" d="+d);

	}

	private void threeSwappingNo(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("before swapping---> "+"a="+a+" b="+b+" c="+c);
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println("after swapping---> "+"a="+a+" b="+b+" c="+c);
		
	}

	private void powerOfNo(int no, int power) {
		// TODO Auto-generated method stub
		while(0<power) {
			
			int result=powerOf5(no, power);
			System.out.println(no+" power of "+power+"= "+result);
			power--;
		}
		
	}

	private int powerOf5(int no,int power) {
		// TODO Auto-generated method stub
		int result=1;
		while(0<power) {
			result=result*no;
			power--;
		}
		//System.out.println(result);
		return result;
	}

	private void reverseNo2(int no) {
		// TODO Auto-generated method stub
		int reverse=0;
		while(0<no) {
			int rem=no%100;
			reverse=(reverse*100)+rem;
			no=no/100;
		}
		System.out.println(reverse);
	}

	private void reverseNo(int no) {
		// TODO Auto-generated method stub
		int reverse=0;
		while(0<no) {
			int rem=no%10;
			reverse=(reverse*10)+rem;
			no=no/10;
		}
		System.out.println("reverse no "+reverse);
	}

	private void divisorOf100OnlyPrime(int no) {
		// TODO Auto-generated method stub
		int div=2;
		while(div<no) {
			if(no%div==0) {
				primeOrNot(div);
			}
			div++;
		}
	}

	private void primeOrNot(int no) {
		// TODO Auto-generated method stub
		int div=2;
		boolean check=true;
		while(div<no) {
			if(no%div==0) {
				check=false;
			}
			div++;
		}
		if(check) {
			System.out.println(no +" is prime no");
		}
		
	}

	private void divisorOf100(int no) {
		// TODO Auto-generated method stub
		int div=2;
		while(div<no) {
			if(no%div==0) {
				System.out.print(div+" ");
				primeOrNot(div);
			}
			div++;
		}
		
	}
}
