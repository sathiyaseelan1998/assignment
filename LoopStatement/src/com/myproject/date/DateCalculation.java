package com.myproject.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCalculation {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		int secs=60;
		int mins=60;
		int hrs=24;
		int yrs=365;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your date of birth (dd/mm/yyyy)");
		String birth=sc.next();
		Date d=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyy");
		String current=sd.format(d);
		Date d1=sd.parse(birth);
		Date d2=sd.parse(current);
		long time=d2.getTime()-d1.getTime();
		long year=(time/(1000l*secs*mins*hrs*yrs));
		long day=(time/(1000*secs*mins*hrs))%yrs;
		System.out.println(year +" years "+ day+" days");
	}

}
