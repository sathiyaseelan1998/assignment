package com.arrays.dimensional;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiDimensionalArray md=new MultiDimensionalArray();
		int ar[][]= {{1,2},{3,4},{5,6}};
		md.printArray(ar);
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
