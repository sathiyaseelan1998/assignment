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
		at.getBiggest();
		
	}
	private void getBiggest() {
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
