package com.exampleAbstraction;

public class Main {

	public static void main(String[] args) {
		College  c1 = new Student();
		College c2 = new External();
		c1.ask();
		c2.sound();
		c1.sound();
		
		
		
	}
}
