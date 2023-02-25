package com.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		//t.biggestNo();
		//t.smallestNo();
		//t.secondBiggest();
		//t.secondSmallest();
		String str="sathiyaseelan";
		//char[] name=str.toCharArray();
		//t.firstDuplicate(name);
		//t.allDuplicate(name);
		//t.removeElement();
		//t.moveLeft();
		//t.moveRight();
		//t.multiDimensional();
		//t.jagged();
		System.out.println(t.factorial(5));
	}

	private int factorial(int fact) {
		// TODO Auto-generated method stub
		if(fact==1) {
			return 1;
		}
		else {
			return fact*factorial(fact-1);
		}
	}

	private void jagged() {
		// TODO Auto-generated method stub
		int[][] ar= {{1,2,4,5},{3,4,5},{1,2},{1}};
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

	private void multiDimensional() {
		// TODO Auto-generated method stub
		int[][] ar= {{1,2,4,5},{3,4,5,6}};
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

	private void moveRight() {
		// TODO Auto-generated method stub
		int[] ar= {10,20,30,40,50};
		int temp=ar[ar.length-1];
		int i;
		for(i=ar.length-1;i>=1;i--) {
			ar[i]=ar[i-1];
		}
		ar[i]=temp;
		for(i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

	private void moveLeft() {
		// TODO Auto-generated method stub
		int[] ar= {10,20,30,40,50};
		int temp=ar[0];
		int i;
		for(i=0;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
		}
		ar[i]=temp;
		for(i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}

	private void removeElement() {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int key=30;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				index=i;
				break;
			}
		}
		for(int i=index;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}

	private void allDuplicate(char[] name) {
		// TODO Auto-generated method stub
		int[] dup=new int[name.length];
		for(int i=0;i<name.length;i++) {
			char key=name[i];
			int count=1;
			for(int j=i+1;j<name.length;j++) {
				if(key==name[j]) {
					dup[j]=-1;
					count++;
				}
			}
			if(dup[i]!=-1) {
				dup[i]=count;
			}
		}
		for(int i=0;i<dup.length;i++) {
			//System.out.print(dup[i]+" ");
			if(dup[i]==1) {
				System.out.print(name[i]);
			}
		}
		
	}

	private void firstDuplicate(char[] name) {
		// TODO Auto-generated method stub
		for(int i=0;i<name.length-1;i++) {
			char key=name[i];
			boolean repeat=false;
			for(int j=i+1;j<name.length;j++) {
				if(key==name[j]) {
					System.out.println(name[j]);
					repeat=true;
					break;
				}
			}
			if(repeat==true) {
				break;
			}
		}
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
