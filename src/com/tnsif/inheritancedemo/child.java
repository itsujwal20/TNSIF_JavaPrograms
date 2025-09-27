package com.tnsif.inheritancedemo;

public class child extends father{
	
		String bike="ktm";
		public static void main(String[] args) {
			child s=new child();
			System.out.println(s.car);
			System.out.println(s.income);	
			System.out.println(s.bike);
			s.drinking();
			s.reading();
		}
		
	

}
