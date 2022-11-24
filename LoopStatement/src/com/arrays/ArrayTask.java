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
		at.addTwoArray_A();
	}
	private void addTwoArray_A() {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		int b[]= {10,20,30,40,50,70};
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
