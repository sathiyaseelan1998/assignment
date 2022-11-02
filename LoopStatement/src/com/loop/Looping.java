package com.loop;

public class Looping {
	
	void amount() {
		int amount=0;
		int day=1;
		while(day<=10) {
			amount=amount+day;
			day=day+1;
		}
		System.out.println("Amount:"+amount);
	}
	void security(int beats) {
		int security=0;
		while(beats>1) {
			beats=beats/2;
			security=security+1;
		}
		System.out.println("Security:"+security);
	}
	void dosai(int dosai) {
		int count=3;
		while(count>=1) {
			dosai=dosai+dosai/2;
			count=count-1;
		}
		System.out.println("Dosai:"+dosai);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping loop=new Looping();
		loop.amount();
		loop.security(1024);
		loop.dosai(8);
	}

}
