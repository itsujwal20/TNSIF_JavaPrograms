package com.tnsif.scannerporactice;

import java.util.Scanner;
class Maindemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		String name=sc.nextLine();
		System.out.println("enter the income");
		int income=sc.nextInt();
		
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		
		Taxcalucation t=new Taxcalucation ();
		t.calucatetax(pp);
		
		System.out.println("after tax calucation");
		System.out.println(pp);
		
	}

}
