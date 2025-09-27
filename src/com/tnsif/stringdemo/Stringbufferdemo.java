package com.tnsif.stringdemo;

public class Stringbufferdemo {
	public static void main(String[] args) {
		
		
		StringBuffer str=new StringBuffer("welcome");
		
		System.out.println(str);
		System.out.println(str.append(" to java"));
		
		// insert
		System.out.println(str.insert(4, "to python"));
		
		// length 
		System.out.println(str.length());
		// delete
		
		System.out.println(str.delete(5, 9));
		
		//reverse
		System.out.println(str.reverse());
		
		//replace()
		
		System.out.println(str.replace(1, 4, "fire"));

	}


}
