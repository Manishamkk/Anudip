package com.example;

import java.util.Scanner;

public class SumOfComplexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fierst real number:");
		int realnum1 = sc.nextInt();
		System.out.println("Enter first imagine number:");
		int imaNum1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int realnum2 = sc.nextInt();
		System.out.println("Enter  Second Imagine number");
		int imanum2 = sc.nextInt();
		
		int realnumSum = realnum1+realnum2;
		int imanumSum = imaNum1+imanum2;
		System.out.println("Sum of two complex number is "  + realnumSum + " + " + imanumSum + "i" );
	}

}
