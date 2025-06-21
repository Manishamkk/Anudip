package com.exampleAbstractionUsingInterface;

public class Main {

	
	public static void main(String [] args) {
		
		Animal a  =  new Cat();
		Animal  a2 =  new Dog();
		a.sound();
		a.sleep();
		a.eat();
		a2.sound();
		a2.sleep();
		a2.eat();
	}
}
