package com.tnsif.superkeyworddemo;

public class maindemo extends superdemo {
	int a=8;
	void drinking() {
		System.out.println("oldmonk");
	}
	void display() {
		System.out.println(a);
		System.out.println(super.a);
		super.drinking();
	}
	public static void main(String[] args) {
		
	
		maindemo d=new maindemo();
		d.display();
		d.drinking();
	}
		



	
} 
