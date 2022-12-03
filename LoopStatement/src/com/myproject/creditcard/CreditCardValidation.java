package com.myproject.creditcard;

import java.util.Scanner;

public class CreditCardValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Credit Card No");
		String card=sc.next();
		int sum=0;
		int[] cardNo=new int[card.length()];
		for(int i=0;i<card.length();i++) {
			cardNo[i]=Character.getNumericValue(card.charAt(i));
		}
		for(int i=0;i<cardNo.length;i++) {
			
			if(i%2==0) {
				cardNo[i]=cardNo[i]*2;
			}
			if(cardNo[i]>9) {
				cardNo[i]=(cardNo[i]%10)+(cardNo[i]/10);
			}
			sum=sum+cardNo[i];
		}
		if(sum%10==0) {
			System.out.println("Card Number is valid");
		}
		else{
			System.out.println("Card Number is Not valid");
		}
	}

}
