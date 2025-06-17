package com.exa.oopsPolymorphism;

public class ArithmaticaOperations {

	public int add(int a , int b) {
		return a+b;
	}
	
	public float add(float a , float b) {
		return a+b;
	}
	
	public String add(String a ,String b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		 ArithmaticaOperations  arith =  new  ArithmaticaOperations ();
		 System.out.println(arith.add(12, 12));
		 System.out.println(arith.add(25.0f, 50.0f));
		 System.out.println(arith.add("Manisha", "Kadam"));

}
}