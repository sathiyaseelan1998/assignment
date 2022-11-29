package com.arrays.dimensional;

import java.util.Scanner;

public class MultiDimensionalArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiDimensionalArrayTask md=new MultiDimensionalArrayTask();
		//md.getMark();
		//md.averageOfMaths();
		//md.highestMark();
		//md.highestMarkOfSubject();
		//md.highestMarkOfEachExam();
		md.spiral();
	}

	private void spiral() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of row and column");
		int no=sc.nextInt();
		int spiral[][]=new int[no][no];
		int value=1;
		int minCol=0;
		int maxCol=no-1;
		int minRow=0;
		int maxRow=no-1;
		while(no*no>=value) {
			for(int i=minCol;i<=maxCol;i++) {//left to right
				spiral[minRow][i]=value;
				value++;
			}
			for(int i=minRow+1;i<=maxRow;i++) {//up to down
				spiral[i][maxCol]=value;
				value++;
			}
			for(int i=maxCol-1;i>=minCol;i--) {//right to left
				spiral[maxRow][i]=value;
				value++;
			}
			for(int i=maxRow-1;i>=minRow;i--) {//down  to up
				spiral[i][minCol]=value;
				value++;
			}
			minCol++;
			minRow++;
			maxCol--;
			maxRow--;
		}
		for(int i=0;i<spiral.length;i++) {
			for(int j=0;j<spiral[i].length;j++) {
				System.out.print(spiral[i][j]+" ");
			
			}
			System.out.println();
		}
	}

	private void highestMarkOfEachExam() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of exam");
		int exam=sc.nextInt();
		System.out.println("enter no of subject");
		int sub=sc.nextInt();
		int mark[][]=new int[exam][sub];
		int highest=0;
		for(int i=0;i<mark.length;i++) {
			int total=0;
			for(int j=0;j<mark[i].length;j++) {
				System.out.println("enter mark of ["+i+"]"+"["+j+"]");
				mark[i][j]=sc.nextInt();
				total+=mark[i][j];
				if(highest<mark[i][j]) {
					highest=mark[i][j];
				}
				System.out.println("highest mark of each exam in a subject "+highest);
			}
		}
	}

	private void highestMarkOfSubject() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of exam");
		int exam=sc.nextInt();
		System.out.println("enter no of subject");
		int sub=sc.nextInt();
		int mark[][]=new int[exam][sub];
		int highest=0;
		for(int i=0;i<mark.length;i++) {
			int total=0;
			for(int j=0;j<mark[i].length;j++) {
				System.out.println("enter mark of ["+i+"]"+"["+j+"]");
				mark[i][j]=sc.nextInt();
				total+=mark[i][j];
				if(highest<mark[i][j]) {
					highest=mark[i][j];
				}
				System.out.println("highest mark of all exam in a subject "+highest);
			}
		}
	}

	private void highestMark() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of exam");
		int exam=sc.nextInt();
		System.out.println("enter no of subject");
		int sub=sc.nextInt();
		int mark[][]=new int[exam][sub];
		int highest=0;
		for(int i=0;i<mark.length;i++) {
			int total=0;
			for(int j=0;j<mark[i].length;j++) {
				System.out.println("enter mark of ["+i+"]"+"["+j+"]");
				mark[i][j]=sc.nextInt();
				total+=mark[i][j];
			}
			if(highest<total) {
				highest=total;
			}
		}
		System.out.println("highest total of all exam "+highest);
	}

	private void averageOfMaths() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of exam");
		int exam=sc.nextInt();
		System.out.println("enter no of subject");
		int sub=sc.nextInt();
		int mark[][]=new int[exam][sub];
		int total=0;
		for(int i=0;i<mark.length;i++) {
			for(int j=0;j<mark[i].length;j++) {
				System.out.println("enter mark of ["+i+"]"+"["+j+"]");
				mark[i][j]=sc.nextInt();
				if(j==2) {
					total+=mark[i][j];
				}
			}
		}
		float average=total/mark.length;
		System.out.println("average of maths "+average);
	}

	private void getMark() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of exam");
		int exam=sc.nextInt();
		System.out.println("enter no of subject");
		int sub=sc.nextInt();
		int mark[][]=new int[exam][sub];
		for(int i=0;i<mark.length;i++) {
			int total=0;
			for(int j=0;j<mark[i].length;j++) {
				System.out.println("enter mark of ["+i+"]"+"["+j+"]");
				mark[i][j]=sc.nextInt();
				total+=mark[i][j];
			}
			System.out.println("total "+total);
			//System.out.println("average "+(float)total/mark[i].length);
		}
	}

}
