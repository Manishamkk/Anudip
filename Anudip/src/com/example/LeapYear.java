package com.example;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the leap year:");
		int year = sc.nextInt();
		if(year%4==0 && year%100!=0 && year%4==0) {
			System.out.println("leap year" + year);
		}else {
			System.out.println("not leap year");
		}
		
	}

}
