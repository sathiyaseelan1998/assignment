package com.string;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringClass sc=new StringClass();
		//sc.stringMethods();
		//sc.countOfChar("dhoni");
		//sc.printNoOnly("dhoni07");
		//sc.printCharOnly("Dhoni");
		//sc.countOfVowels("dhoni");
		//sc.printSpecialChar("dhoni&*$@gmail.com");
		//sc.presentChar("dhoni");
		//sc.printReverse("virat");
		//sc.palindrome("madam");
		//sc.repeatedElement("sathiyaseelan");
		//sc.repeatedElement_A("sathiyaseelan");
		
	}

	private void repeatedElement_A(String name) {
		// TODO Auto-generated method stub
		int freq[]=new int[name.length()];
		for(int i=0;i<name.length();i++) {
			char key=name.charAt(i);
			int count=1;
			for(int j=i+1;j<name.length();j++) {
				if(key==name.charAt(j)) {
					freq[j]=-1;
					count++;
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1)
			System.out.println(name.charAt(i)+" is "+freq[i]+" time repeated ");
		}
	}

	private void repeatedElement(String name) {
		// TODO Auto-generated method stub
		char[] ch=name.toCharArray();
		int[] freq=new int[ch.length];
		for(int i=0;i<ch.length;i++) {
			char key=ch[i];
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(key==ch[j]) {
					freq[j]=-1;
					count++;
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1)
			System.out.println(ch[i]+" is "+freq[i]+" time repeated ");
		}
	}

	private void palindrome(String name) {
		// TODO Auto-generated method stub
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
		}
		if(name.equals(reverse)) {
			System.out.println(name +" is palindrome");
		}
		else{
			System.out.println(name +" is not palindrome");
		}
	}

	private void printReverse(String name) {
		// TODO Auto-generated method stub
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	}

	private void presentChar(String name) {
		// TODO Auto-generated method stub
		char key='h';
		for(int i=0;i<name.length();i++) {
			if(key==name.charAt(i)) {
				System.out.print("yes");
			}
		}
	}

	private void printSpecialChar(String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<name.length();i++) {
			if(!(name.charAt(i)>='0' && name.charAt(i)<='9') &&
					!(name.charAt(i)>=65 && name.charAt(i)<=122)) {
				System.out.print(name.charAt(i));
			}
		}
	}

	private void countOfVowels(String name) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<name.length();i++) {
				if(name.charAt(i)=='a' ||
					name.charAt(i)=='e' ||
					name.charAt(i)=='i' ||
					name.charAt(i)=='o' ||
					name.charAt(i)=='u' ) {
				count++;
			}
		}
		System.out.println(count);
	}

	private void printCharOnly(String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<name.length();i++) {					//ASII value
			if(name.charAt(i)>=65 && name.charAt(i)<=122) { //A to Z - 65 to 90
				System.out.print(name.charAt(i));			//a to z - 97 to 122			
			}												//0 to 9 - 48 t0 57
		}
	}

	private void printNoOnly(String name) {
		// TODO Auto-generated method stub
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='0' && name.charAt(i)<='9') {
				System.out.print(name.charAt(i));
			}
		}
	}

	private void countOfChar(String name) {
		// TODO Auto-generated method stub
		System.out.println(name.length());
	}

	private void stringMethods() {
		// TODO Auto-generated method stub
		String name="dhoni";
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(i));
		}
	}

}
