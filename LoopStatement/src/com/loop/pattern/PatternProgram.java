package com.loop.pattern;

public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternProgram pp=new PatternProgram();
		//pp.pattern1();
		//pp.pattern2();
		//pp.pattern3();
		pp.pattern4();
		//pp.pattern5();
		//pp.pattern6();
		//pp.pattern7();
	}

	private void pattern7() {
		// TODO Auto-generated method stub
		for(int row=0;row<=4;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print((col+row)+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern6() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=6-row;col++) {
				System.out.print((col*row)+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=6-row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=6-row;col--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=6-row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=6-row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=6-row;col++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
	}

}
