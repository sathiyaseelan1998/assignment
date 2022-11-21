package com.loop.pattern;

public class PatternProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternProgram2 pp=new PatternProgram2();
		//pp.pattern1();
		//pp.pattern2();
		//pp.pattern3();
		//pp.pattern4();
		//pp.pattern5();
		//pp.pattern6();
		//pp.pattern7();
		//pp.pattern8();
		//pp.pattern9();
		//----------------
		pp.pattern10();
		//pp.pattern11();
	}
	private void pattern11() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(" "+" ");
			}
			for(int col=1;col<=6-row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern10() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			for(int col=1;col<=6-row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern9() {
		// TODO Auto-generated method stub
		
	}

	private void pattern8() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row-1;col++) {
				System.out.print(col+" ");
			}
			System.out.print(1);
			System.out.println();
		}
	}

	private void pattern7() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row-1;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern6() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=row;col<=5;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) {
			for(int col=5;col>=row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
	}

}
