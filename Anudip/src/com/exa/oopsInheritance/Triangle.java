package com.exa.oopsInheritance;

public class Triangle extends Shape {

	
	public int base ;
	public int height;
	public void triArea(int base , int height) {
		int triArea = 1/2*base * height;
		System.out.println( "Area of triangle is:" +triArea);
	}
}
