package com.example;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the numerator:");
		int numerator = sc.nextInt();
		System.out.println("enter the denominator:");
		int denominator= sc.nextInt();
		
		int quotient = numerator/denominator;
		int remaindar = numerator%denominator;
		
		System.out.println("quotient of gven numbert is : " + quotient);
		System.out.println("remaindar of given number is :" + remaindar);
	}

}
