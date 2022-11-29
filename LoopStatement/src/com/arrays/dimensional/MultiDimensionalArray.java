package com.arrays.dimensional;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiDimensionalArray md=new MultiDimensionalArray();
		int ar[][]= {{1,2},{3,4},{5,6}};
		//md.printArray(ar);
		md.jaggedArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no row");
		int row=sc.nextInt();
		System.out.println("Enter no colunm");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		
		int matrix[][]=md.matrix3_OF_3(arr);
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				
				System.out.print(arr[i][j]+" "); 
			}
			System.out.println();
		}
	}

	private void jaggedArray() {
		// TODO Auto-generated method stub
		int ar[][]=new int[3][];
		ar[0]=new int[2];
		ar[1]=new int[3];
		ar[2]=new int[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println("enter no of "+i+" "+j+" ");
				ar[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" "); 
			}
			System.out.println();
		}
	}

	private int[][] matrix3_OF_3(int[][] arr) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter no of "+i+" "+j+" ");
				 arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}

	private void printArray(int[][] ar) {
		// TODO Auto-generated method stub
		for(int row=0;row<ar.length;row++) {
			for(int col=0;col<ar[row].length;col++) {
				System.out.print(ar[row][col]+" ");
			}
			System.out.println();
		}
	}

}
