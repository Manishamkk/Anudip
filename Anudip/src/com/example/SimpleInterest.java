package com.example;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new  Scanner(System.in);
		System.out.println("enter the amount:");
		int amount = sc.nextInt();
		
		System.out.println("enter the rate:");
		int rate = sc.nextInt();
		 System.out.println("enter the time:");
		 int time = sc.nextInt();
		 
		 int interest = amount*rate*time/100;
		 System.out.println("Simple interset:" + interest);
	}

}
