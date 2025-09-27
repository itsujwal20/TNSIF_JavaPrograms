package com.tnsif.stringdemo;

public class stringdemo {
	
	public static void main(String[] args) {
		String std=new String("hello");
		System.out.println(std);
		
		std=std.concat("welcome");
		System.out.println(std);
		System.out.println(std.length());
		System.out.println(std.indexOf("h"));
		System.out.println(std.toLowerCase());
		System.out.println(std.toUpperCase());
		
	}

}
