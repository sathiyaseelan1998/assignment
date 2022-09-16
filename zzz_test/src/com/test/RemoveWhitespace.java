package com.test;

public class RemoveWhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//space only remove
		String space=" Hi Bye   ";
		System.out.println(space+"....."+space.length());
		String removeSpace=space.trim();
		System.out.println(removeSpace+"....."+removeSpace.length());
		System.out.println("----------------------------------------");
		//space and tap remove
		
		String tap="I Am Indian		of tamilnadu	student";
		
		String t=tap.replaceAll("\\s", "");

		System.out.println(t);

	}

}
