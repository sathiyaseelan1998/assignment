package com.arrays;

import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTask at=new ArrayTask();
		int[] arr= {10,40,30,40,50,40};
		//at.printArray(arr);
		//at.printIndex(arr);
		//at.reverseArray(arr);
		//at.linearSearch(arr,50);
		//at.linear(arr);
		//at.oddIndex(arr);
		//at.evenIndex(arr);
		//at.getMark();
		//at.getBiggest();
		//at.getSmallest();
		//at.lowestMark();
		//at.secondBiggestNo();
		//at.secondSmallestNo();
		//at.addOfOddIndex();
		//at.copyArrayReverseOrder();
		//at.negativeNoArray();
		//int ar[]= {40,20,-10,-20,-30,50};
		//int count=at.countOfNegativeNo(ar);
		//at.copyNegativeNoArray(ar,count);
		//at.addTwoArray();
		//at.addTwoArray_A();
		//at.lastPlace();
		//int ar[]= {10,20,30,40,50};
		//at.moveLeft(ar);
		//at.twiceLeftMove();
		//at.moveRight(ar);
		//at.twiceRightMove();
		//at.removeValueInArray();
		//at.firstRepeatedElement();
		//at.allRepeatedElement();
		//at.allRepeatedChracter("sathiyaseelan");
		//at.mostRepeatedCharacter("sathiyaseelan");
		//at.nonRepeatedElement("sathiyaseelan");
		//at.findIndexAdd10();
		//at.findIndexMultiple20();
		//at.primeNo();
		//at.perfectNo();
		//at.factorial(5);
		//at.strongNo();
		//at.printOddElementInEevenIndex();
		at.printEvenElementInOddIndex();

	}
	private void printEvenElementInOddIndex() {
		// TODO Auto-generated method stub
		int []ar= {10,20,40,10,13,15,16,18};
		for(int i=0;i<ar.length;i++) {
			if(i%2!=0 && ar[i]%2==0) {
				System.out.print(ar[i]+" ");
			}
		}
	}
	private void printOddElementInEevenIndex() {
		// TODO Auto-generated method stub
		int ar[]= {9,11,17,13,14,16,5};
		for(int i=0;i<ar.length;i++) {
			if(i%2==0 && ar[i]%2!=0) {
				System.out.print(ar[i]+" ");
			}
		}
	}
	private void strongNo() {
		// TODO Auto-generated method stub
		int ar[]= {1,100,145,148,234};
		for(int i=0;i<ar.length;i++) {
			int temp=ar[i];
			int sum=0;
			while(0<ar[i]) {
				int rem=ar[i]%10;
				sum=sum+factorial(rem);
				ar[i]=ar[i]/10;
			}
			if(sum==temp) {
				System.out.println(temp+" is strong no");
			}
			else{
				System.out.println(temp+" is not strong no");
			}
		}
		
	}
	private int factorial(int no) {
		// TODO Auto-generated method stub
		int fact=1;
		while(0<no) {
			fact=fact*no;
			no--;
		}
		//System.out.println(fact);
		return fact;
	}
	private void perfectNo() {
		// TODO Auto-generated method stub
		int ar[]= {6,7,45,28};
		for(int i=0;i<ar.length;i++) {
			int div=1;
			int sum=0;
			while(div<ar[i]) {
				if(ar[i]%div==0) {
					sum=sum+div;
				}
				div++;
			}
			if(ar[i]==sum) {
				System.out.println(ar[i]+" is perfect no");
			}
			else{
				System.out.println(ar[i]+" is not perfect no");
			}
		}
		
	}
	private void primeNo() {
		// TODO Auto-generated method stub
		int ar[]= {3,5,6,7,8,11,12,13};
		for(int i=0;i<ar.length;i++) {
			int div=2;
			int count=0;
			while(div<ar[i]) {
				if(ar[i]%div==0) {
					count++;
				}
				
				div++;
			}
			if(count==0) {
				System.out.println(ar[i]+" is prime no");
			}
			else{
				System.out.println(ar[i]+" is not prime no");
			}
		}
		
	}
	private void findIndexMultiple20() {
		// TODO Auto-generated method stub
		int ar[]= {1,20,5,3,5,6,4};
		for(int i=0;i<ar.length;i++) {
			int key=ar[i];
			for(int j=i+1;j<ar.length;j++) {
				if(key*ar[j]==20) {
					System.out.println(i+"   "+j);
				}
			}
		}
	}
	private void findIndexAdd10() {
		// TODO Auto-generated method stub
		int ar[]= {0,10,5,3,5,6,7};
		for(int i=0;i<ar.length;i++) {
			int key=ar[i];
			for(int j=i+1;j<ar.length;j++) {
				if(key+ar[j]==10) {
					System.out.println(i+"   "+j);
				}
			}
		}
	}
	private void nonRepeatedElement(String str) {
		// TODO Auto-generated method stub
		char[] name=str.toCharArray();
		int[] freq=new int[name.length];
		for(int i=0;i<name.length;i++) {
			char key=name[i];
			int count=1;
			for(int j=i+1;j<name.length;j++) {
				if(key==name[j]) {
					freq[j]=-1;
					count++;
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==1)
				System.out.println(name[i]+" - is non repeated ");
		}
	}
	private void mostRepeatedCharacter(String str) {
		// TODO Auto-generated method stub
		char[] name=str.toCharArray();
		int[] freq=new int[name.length];
		for(int i=0;i<name.length;i++) {
			char key=name[i];
			int count=1;
			for(int j=i+1;j<name.length;j++) {
				if(key==name[j]) {
					freq[j]=-1;
					count++;
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		char highest=0;
		int big=Integer.MIN_VALUE;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>big) {
				big=freq[i];
				highest=name[i];
			}
		}
		System.out.println(highest+" is most repeated character "+ big);
	}
	private void allRepeatedChracter(String str) {
		// TODO Auto-generated method stub
		char[] name=str.toCharArray();
		int[] freq=new int[name.length];
		for(int i=0;i<name.length;i++) {
			char key=name[i];
			int count=1;
			for(int j=i+1;j<name.length;j++) {
				if(key==name[j]) {
					freq[j]=-1;
					count++;
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1)
				System.out.println(name[i]+" times "+freq[i]+" repeate");
		}
	}
	private void allRepeatedElement() {
		// TODO Auto-generated method stub
		int[] no = { 10, 20, 30, 10, 50, 20, 10, 30, 60 };
		int[] repeatCount = new int[no.length];
		
		for (int i = 0; i < no.length; i++) {
			int key = no[i];
			int count = 1;
			for (int j = i + 1; j < no.length; j++) {
				if (key == no[j]) {
					// System.out.println(no[j]);
					repeatCount[j] = -1;
					count++;
				}
			}
			if (repeatCount[i] != -1) {
				repeatCount[i] = count;
			}
		}
		for(int i=0;i<repeatCount.length;i++) {
			if(repeatCount[i]>1)
			System.out.println(no[i]+" times "+repeatCount[i]+" repeate");
		}
	}
	private void firstRepeatedElement() {
		// TODO Auto-generated method stub
		String str="sathiyaseelan";
		boolean repeat=false;
		char[] name=str.toCharArray();
		for(int i=0;i<name.length-1;i++) {
			char key=name[i];
			for(int j=i+1;j<name.length;j++) {
				if(key==name[j]) {
					System.out.println(name[j]);
					repeat=true;
					break;
				}
			}
			if(repeat==true) {
				break;
			}
		}
	}
	private void removeValueInArray() {
		// TODO Auto-generated method stub
		int ar[]= {10,20,30,40,50};
		System.out.println("Print value ");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("Remove value ");
		int key=20;
		int index=-1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==key) {
				index=i;
				break;
			}
		}
		for(int i=index;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
		}
		for(int i=0;i<ar.length-1;i++) {
			System.out.print(ar[i]+" ");
		}
	}
	private void twiceRightMove() {
		// TODO Auto-generated method stub
		int ar[]= {10,20,30,40,50};
		for (int shift = 1; shift <= 2; shift++) { //twice move from right
			int right[] = moveRight(ar);
			for (int i = 0; i < right.length; i++) {
				System.out.print(right[i] + " ");
			}
		}
	}
	private int[] moveRight(int[] ar) {
		// TODO Auto-generated method stub
		//int ar[]= {10,20,30,40,50};
		System.out.println();
		System.out.print("Before Move ");
		int temp=ar[ar.length-1];
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.print("After Move ");
		int i;
		for(i=ar.length-1;i>=1;i--) {
			ar[i]=ar[i-1];
		}
		ar[i]=temp;
		return ar;
	}
	private void twiceLeftMove() {
		// TODO Auto-generated method stub
		int ar[]= {10,30,59,40,20};
		for (int shift = 1; shift <= 2; shift++) { //twice move from left
			int left[] = moveLeft(ar);
			for (int i = 0; i < left.length; i++) {
				System.out.print(left[i] + " ");
			}
		}
	}
	private int[] moveLeft(int ar[]) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.print("Before Move ");
		int temp=ar[0];
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.print("After Move ");
		int i;
		for(i=0;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
		}
		ar[i]=temp;
		return ar;
			
	}
	private void lastPlace() {
		// TODO Auto-generated method stub
		int ar[]= {10,20,40};
		int key=30;
		ar[ar.length-1]=key;
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
	private void addTwoArray_A() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		int b[]= {10,20,30,40,50,70,90};
		int small=a.length<b.length?a.length:b.length;
		int big=a.length>b.length?a.length:b.length;
		int c[]=new int[big];
		for(int i=0;i<small;i++) {
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
		for(int i=small;i<c.length;i++) {
			c[i]=b[i];
			System.out.print(c[i]+" ");
		}
		
	}
	private void addTwoArray() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		int c[]=new int[b.length];
		for(int i=0;i<b.length;i++) {
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
		
	}
	private void copyNegativeNoArray(int[] ar, int count) {
		// TODO Auto-generated method stub
		int neg[]=new int[count];
		int j=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<0) {
				neg[j]=ar[i];
				System.out.print(neg[j]+" ");
				j++;
			}
		}
	}
	private int countOfNegativeNo(int ar[]) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(0>ar[i]) {
				count++;
			}
		}
		//System.out.println("No of negative = "+count);
		return count;
	}
	private void negativeNoArray() {
		// TODO Auto-generated method stub
		int ar[]= {40,20,-10,-20,-30,50};
		for(int i=0;i<ar.length;i++) {
			if(0>ar[i]) {
				System.out.print(ar[i]+" ");
			}
		}
	}
	private void copyArrayReverseOrder() {
		// TODO Auto-generated method stub
		int ar[]= {10,20,30,50};
		int rev[]=new int[ar.length];
		int j=ar.length-1;
		for(int i=0;i<ar.length;i++) {
				rev[i]=ar[j];
				System.out.print(rev[i]+" ");
				j--;
		}
	}
	private void addOfOddIndex() {
		// TODO Auto-generated method stub
		int []ar= {10,20,30,40,50,60};
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(i%2!=0) {
				sum+=ar[i];
			}
		}
		System.out.println(sum);
	}
	private void secondSmallestNo() {
		// TODO Auto-generated method stub
		int ar[]= {15,25,18,12,40};
		int small1=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<small1) {
				small2=small1;
				small1=ar[i];
			}
			else if(ar[i]<small2) {
				small2=ar[i];
			}
		}
		System.out.println("First smallest no: "+small1);
		System.out.println("Second smallest no: "+small2);
	}
	private void secondBiggestNo() {
		// TODO Auto-generated method stub
		int ar[]= {15,25,18,12,40};
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>big1) {
				big2=big1;
				big1=ar[i];
			}
			else if(ar[i]>big2) {
				big2=ar[i];
			}
		}
		System.out.println("First biggest no: "+big1);
		System.out.println("Second biggest no: "+big2);
	}
	private void lowestMark() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of subject");
		int sub=sc.nextInt();
		int mark[]=new int[sub];
		int low=Integer.MAX_VALUE;
		for(int i=0;i<mark.length;i++) {
			System.out.print("Enter mark: ");
			mark[i]=sc.nextInt();
			if(mark[i]<low) {
				low=mark[i];
			}
			
		}
		System.out.println("Lowest mark: "+low);
	}
	private void getSmallest() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of days");
		int day=sc.nextInt();
		int temp[]=new int[day];
		int small=Integer.MAX_VALUE;
		int big=Integer.MIN_VALUE;
		for(int i=0;i<temp.length;i++) {
			System.out.print("Enter temperature: ");
			temp[i]=sc.nextInt();
			if(temp[i]<small) {
				small=temp[i];
			}
			if(temp[i]>big) {
				big=temp[i];
			}
			
		}
		System.out.println("Lowest temperature: "+small);
		System.out.println("Highest temperature: "+big);
	}
	private void getBiggest() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of subject");
		int sub=sc.nextInt();
		int mark[]=new int[sub];
		int big=0;
		for(int i=0;i<mark.length;i++) {
			System.out.print("Enter mark: ");
			mark[i]=sc.nextInt();
			if(mark[i]>big) {
				big=mark[i];
			}
			
		}
		System.out.println("Highest mark: "+big);
	}
	private void getMark() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of subject");
		int sub=sc.nextInt();
		int mark[]=new int[sub];
		int total=0;
		for(int i=0;i<mark.length;i++) {
			System.out.print("Enter mark: ");
			mark[i]=sc.nextInt();
			total+=mark[i];
		}
		System.out.println("Total: "+total);
		System.out.println("Average: "+total/mark.length);
	}

	
	private void evenIndex(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i+=2) {
			System.out.print(arr[i]+" ");
			System.out.println("index "+i);
		}
	}


	private void oddIndex(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i+=2) {
			System.out.print(arr[i]+" ");
			System.out.println("index "+i);
		}
	}


	private void linear(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		int key=40;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		System.out.println(count);
	}


	private void linearSearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println(key +" is present");
				break;
			}
		}
	}

	private void printIndex(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+" ");
		}
	}

	private void reverseArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

	private void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
