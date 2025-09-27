package com.tnsif.polymorphism;

public class point {
	int add(int a,int b) {
	return(a+b);

}
	int add(int a,int b,int c) {
		return(a+b+c);
	}
	public static void main(String[] args) {
		point p=new point();
		System.out.println(p.add(2,5));
		System.out.println(p.add(1,2,3));
		
	}
}