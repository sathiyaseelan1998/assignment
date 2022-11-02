package com.loop.nov2;

public class Looping {
	
	void oddNumber() {
		int count=1;
		while(count<=9) {
			System.out.print(count+" ");
			count=count+2;
		}
		System.out.println();
	}
	void evenNumber() {
		int count=0;
		while(count<=8) {
			System.out.print(count+" ");
			count=count+2;
		}
		System.out.println();
	}
	void threeTimes() {
		int count=3;
		while(count<=15) {
			System.out.print(count+" ");
			count=count+3;
		}
		System.out.println();
	}
	void fiveTimes() {
		int count=25;
		while(count>=5) {
			System.out.print(count+" ");
			count=count-5;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping loop=new Looping();
		loop.oddNumber();
		loop.evenNumber();
		loop.threeTimes();
		loop.fiveTimes();
	}

}
