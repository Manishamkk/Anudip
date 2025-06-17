package com.exa.oopsPolymorphismOverriding;

public class Child  extends Parent{

	public void info() {
		System.out.println("Child Class");
	}
	
	
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.info();
	}
}
