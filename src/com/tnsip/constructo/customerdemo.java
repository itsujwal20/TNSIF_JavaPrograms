package com.tnsip.constructo;

import java.util.Scanner;

public class customerdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer name");
		String name=sc.next();
		System.out.println("enter customer id");
		int id=sc.nextInt();
		System.out.println("enter customer address");
		String address=sc.next();
	customer c=new customer();
	c.setCustomeraddress(address);
	c.setCustomerid(id);
	c.setCustomername(name);
	System.out.println(c);
	
	boolean b=c instanceof customer;
	
	System.out.println(b);
	
	
	}
}
