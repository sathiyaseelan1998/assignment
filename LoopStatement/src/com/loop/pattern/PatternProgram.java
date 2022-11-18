package com.loop.pattern;

public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternProgram pp=new PatternProgram();
		//pp.pattern1();
		//pp.pattern2();
		//pp.pattern3();
		//pp.pattern4();
		//pp.pattern5();
		//pp.pattern6();
		//pp.pattern7();
		//pp.pattern7_a();
		//pp.pattern8();// empty space 
		//pp.pattern9();
		//pp.pattern10();
		//pp.pattern11();
		//------------------------
		//pp.pattern12();
		//pp.pattern13();
		//pp.pattern14();
		//pp.pattern15();
		//pp.pattern16();
		//pp.pattern17();
		pp.pattern18();
	}
	private void pattern18() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(""+" ");
			}
			for(int col=5;col>=6-row;col--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	private void pattern17() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(""+" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
	private void pattern16() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(""+" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern15() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(" "+" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

	private void pattern14() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(" "+" ");
			}
			for(int col=5;col>=6-row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern13() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(" "+" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern12() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(" "+" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
	}

	private void pattern11() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(col+" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	private void pattern10() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(col+" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
	}

	private void pattern9() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(col+" ");
			}
			System.out.print(1);
			System.out.println();
		}
	}

	private void pattern8() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern7_a() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=row;col<=5;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
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
