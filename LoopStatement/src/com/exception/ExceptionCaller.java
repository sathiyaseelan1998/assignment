package com.exception;

import java.io.FileNotFoundException;

public class ExceptionCaller {
	//checked exception must be declared in method caller ex:FileNotFoundException 
	//unchecked exception is option ex:ArithmeticException
	public static void main(String[] args) throws Exception { 
		ExceptionHandling eh=new ExceptionHandling();
		MobileNoException me=new MobileNoException();
		eh.usingThrow();
		me.mobileNoCheck("98980080");
		eh.throws2();
		try {
			eh.usingThrows();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch blocks
			System.out.println("divisor not zero");
		}
		
	}

}
