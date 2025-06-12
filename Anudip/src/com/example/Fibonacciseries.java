package com.example;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 =1;
		int len = 100;
		
		for(int i =0;i<=len;i++) {
			System.out.println(num1 + " ");
			int num3 = num1 + num2;
			num1=num2;
			num2=num3;
		}
		
	}

}
