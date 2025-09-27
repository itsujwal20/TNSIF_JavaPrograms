package com.tnsif.abstractiondemo;

public  class square extends shape {
	private float side;
	
	public square() {
		side=2.0f;
	
	}
	public square(float side) {
		this.side=side;
	}
	void calarea() {
		super.area=side*side;
	}
	public String toString() {
		return"square[side="+side+"]";
	}

	

}
