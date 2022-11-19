package com.loop.pattern;

public class LetterPattern {
	public static void main(String[] args) {
		LetterPattern lp=new LetterPattern();
		//lp.printC();
		//lp.printI();
		//lp.printD();
		//lp.printS();
		//lp.printH();
		//lp.printA();
		//lp.printK();
		//lp.printT();
		//lp.printH();
		//lp.printI();
		lp.myNameCalling();
	}

	private void myNameCalling() {
		// TODO Auto-generated method stub
				printS();
				System.out.println();
				System.out.println();
				printH();
				System.out.println();
				System.out.println();
				printA();
				System.out.println();
				System.out.println();
				printK();
				System.out.println();
				System.out.println();
				printT();
				System.out.println();
				System.out.println();
				printH();
				System.out.println();
				System.out.println();
				printI();
	}

	private void printT() {
		// TODO Auto-generated method stub
		for(int col=1;col<=5;col++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=2;col++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
	}

	private void printK() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			System.out.print("*");
			for(int space=1;space<=5;space++) {
				if(row==1 && space==5 || row==2 && space==3 || row==3 && space==2 ||row==4 && space==3||row==5 && space==5) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	private void printA() {
		// TODO Auto-generated method stub
		for(int col=1;col<=5;col++) {
			if(col==1) {
				System.out.print(" ");
			}
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1;row<=5;row++) {
			System.out.print("*");
			for(int space=1;space<=4;space++) {
				if(space==1) {
					System.out.print(" ");
				}
				if(row==3) {
					System.out.print("* ");
				}
				else
				System.out.print("  ");
			}
			System.out.println("*");
		}
	}

	private void printH() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			System.out.print("*");
			for(int space=1;space<=7;space++) {
				if(row==3) {
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
	}

	private void printS() {
		// TODO Auto-generated method stub
		for(int col=1;col<=5;col++) {
			if(col==1) {
				System.out.print(" ");
			}
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1;row<=3;row++) {
			System.out.println("* ");
		}
		for(int col=1;col<=5;col++) {
			if(col==1) {
				System.out.print(" ");
			}
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1;row<=3;row++) {
			for(int space=1;space<=5;space++) {
				System.out.print("  ");
			}
			System.out.println("* ");
		}
		for(int col=1;col<=5;col++) {
			if(col==1) {
				System.out.print(" ");
			}
			System.out.print("* ");
		}
	}

	private void printD() {
		// TODO Auto-generated method stub
		for(int col=1;col<=5;col++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1;row<=5;row++) {
			System.out.print(" *");
			for(int col=1;col<=4;col++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
		for(int col=1;col<=5;col++) {
			
			System.out.print("* ");
		}
	}

	private void printI() {
		// TODO Auto-generated method stub
		for(int col=1;col<=5;col++) {
			if(col==1) {
				System.out.print(" ");
			}
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int col=1;col<=5;col++) {
			if(col==1) {
				System.out.print(" ");
			}
			System.out.print("* ");
		}
	}

	private void printC() {
		// TODO Auto-generated method stub
		for(int col=1;col<=5;col++) {
			if(col==1) {
				System.out.print(" ");
			}
			System.out.print("* ");
		}
		System.out.println();
		for(int row=1;row<=5;row++) {
			System.out.println("* ");
		}
		for(int col=1;col<=5;col++) {
			if(col==1) {
				System.out.print(" ");
			}
			System.out.print("* ");
		}
	}
}
