package com.tnsif.exception;

public class divison {
	public static void divide() {
		int a=6, b=0,c;
		try {
			c=a/b;
			System.out.println("division"+c);
		}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
		catch(ArrayIndexOutOfBoundsException t) {
			System.out.println(t.getMessage());
		}
		catch(IllegalMonitorStateException f) {
			System.out.println(f.getMessage());
		}
		catch(Exception d) {
			System.out.println(d.getMessage());
		}
	}
	public static void main(String[] args) {
		System.out.println("main method");
		divison.divide();
	}


}

