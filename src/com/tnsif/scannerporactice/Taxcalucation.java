package com.tnsif.scannerporactice;

public class Taxcalucation {
	public void calucatetax(Person p) {
		if(p.getIncome()<=15000) {
			p.setTax(0);
		}
		else if(p.getIncome()>16000 && p.getIncome()<=20000) {
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}

}



