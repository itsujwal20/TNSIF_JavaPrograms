package com.tnsif.collection;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		int size=v.size();
		System.out.println("vector size"+size);
		
		// adding an element
		
		v.add("Rose");
		v.add("orange");
		v.add("mango");
		v.add("red");
		
		int cap=v.capacity();
		System.out.println(cap);
		
		v.add(null);
		System.out.println(v);
	}


}