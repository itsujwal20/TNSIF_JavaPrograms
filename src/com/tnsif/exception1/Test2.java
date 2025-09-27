package com.tnsif.exception1;

public class Test2 {
	
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("hello java");
		}
	}

}
