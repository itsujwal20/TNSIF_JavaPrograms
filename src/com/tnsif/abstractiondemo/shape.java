package com.tnsif.abstractiondemo;

public abstract class shape {
	protected float area;
	
	abstract void calarea();
	
	void show() {
		System.out.println("area of shape"+area);
	}

}
