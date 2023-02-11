package com.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		//t.biggestNo();
		//t.smallestNo();
		//t.secondBiggest();
		t.secondSmallest();
	}

	private void secondSmallest() {
		// TODO Auto-generated method stub
		int[] ar= {8,25,10,30,26,50};
		int small1=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<small1) {
				small2=small1;
				small1=ar[i];
			}
			else if(ar[i]<small2) {
				small2=ar[i];
			}
		}
		System.out.println(small2);
	}

	private void secondBiggest() {
		// TODO Auto-generated method stub
		int[] ar= {12,25,11,30,26,50};
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>big1) {
				big2=big1;
				big1=ar[i];
			}
			else if(ar[i]>big2){
				big2=ar[i];
			}
		}
		System.out.println(big2);
	}

	private void smallestNo() {
		// TODO Auto-generated method stub
		int[] ar= {12,25,11,30,26};
		int small=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<small) {
				small=ar[i];
			}
		}
		System.out.println(small);
	}

	private void biggestNo() {
		// TODO Auto-generated method stub
		int[] ar= {12,25,11,30,26};
		int big=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>big) {
				big=ar[i];
			}
		}
		System.out.println(big);
	}

}
