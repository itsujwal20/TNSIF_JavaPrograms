package com.tnsif.inheritancedemo;

public class grandson extends child{
	
		String cycle="red";
		public static void main(String[] args) {
			grandson g=new grandson();
			System.out.println(g.car);
			System.out.println(g.bike);
			System.out.println(g.income);
			System.out.println(g.cycle);
			
			g.drinking();
			g.reading();
		
		
	}

}
