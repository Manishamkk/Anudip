package com.example;

import java.util.Scanner;

public class AddBinaryNumbers {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input binary numbers as strings
	        System.out.print("Enter first binary number: ");
	        String b1 = sc.nextLine();

	        System.out.print("Enter second binary number: ");
	        String b2 = sc.nextLine();

	        // Convert binary strings to decimal
	        int num1 = Integer.parseInt(b1, 2);//1010
	        int num2 = Integer.parseInt(b2, 2);//110

	        // Add the decimal numbers
	        int sum = num1 + num2;  //10 +6 =16    10000

	        // Convert the sum back to binary
	        String binarySum = Integer.toBinaryString(sum);
	        System.out.println("sum of binary numbes:"+ binarySum);
	 }
}
