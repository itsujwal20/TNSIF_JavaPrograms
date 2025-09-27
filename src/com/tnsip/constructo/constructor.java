package com.tnsip.constructo;

public class constructor {
	public static void main(String[] args) {
		constructor c1=new constructor(2);
		constructor c2=new constructor();
		constructor c3=new constructor(1,"reva");
		constructor c4=new constructor("reva");
	}
	constructor(){
		System.out.println("to");
		
	}
	constructor(int a){
		System.out.println("welcome");
	}
	constructor(int a,String b){
		System.out.println("reva");
	}
	constructor(String b){
		System.out.println("university");
	}

}
