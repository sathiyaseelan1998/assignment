package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegexDemo rd=new RegexDemo();
		//rd.regex1();
		//rd.regex2();
		//rd.regex3();
		//rd.regex4();
		//rd.regex5();
		rd.regex6();
	}
	private void regex6() {
		// TODO Auto-generated method stub
		String input="mobile no is 918878784567";
		//Pattern pat=Pattern.compile("[0-9]");//only number
		Pattern pat=Pattern.compile("(0|91)?[6-9][0-9]{9}");// character & number
		Matcher mat=pat.matcher(input);
		//System.out.println(mat.find());
		while(mat.find()) {
			System.out.print(mat.group());
		}
	}

	private void regex5() {
		// TODO Auto-generated method stub
		String input="Sathiya123@gmail.com";
		//Pattern pat=Pattern.compile("[0-9]");//only number
		Pattern pat=Pattern.compile("[a-z0-9]");// character & number
		Matcher mat=pat.matcher(input);
		//System.out.println(mat.find());
		while(mat.find()) {
			System.out.print(mat.group());
		}
	}

	private void regex4() {
		// TODO Auto-generated method stub
		String input="sathiya123@gmail.com";
		Pattern pat=Pattern.compile("[a-z]");
		Matcher mat=pat.matcher(input);
		//System.out.println(mat.find());
		while(mat.find()) {
			System.out.print(mat.group());
		}
	}

	private void regex3() {
		// TODO Auto-generated method stub
		String input="abcd abcd abcd abcd abcd abc bc abc";
		Pattern pat=Pattern.compile("[^abc]");
		Matcher mat=pat.matcher(input);
		//System.out.println(mat.find());
		while(mat.find()) {
			System.out.print(mat.group());
		}
	}

	private void regex2() {
		// TODO Auto-generated method stub
		String input="abcd abcd abcd abcd abcd abc bc abc";
		Pattern pat=Pattern.compile("[abc]");
		Matcher mat=pat.matcher(input);
		//System.out.println(mat.find());
		while(mat.find()) {
			System.out.print(mat.group());
		}
	}

	private void regex1() {
		// TODO Auto-generated method stub
		String input="abcd abcd abcd abcd abcd abc bc abc";
		Pattern pat=Pattern.compile("abc");
		Matcher mat=pat.matcher(input);
		//System.out.println(mat.find());
		while(mat.find()) {
			System.out.println(mat.group());
		}
	}

}
