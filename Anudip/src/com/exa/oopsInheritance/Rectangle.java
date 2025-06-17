package com.exa.oopsInheritance;

public class Rectangle extends Square {

	int base ;
	int height ;
	
	public void rectArea(int base,int height) {
		int rectArea= base*height;
		System.out.println("Area of rectangle:"+rectArea);
	}
}
