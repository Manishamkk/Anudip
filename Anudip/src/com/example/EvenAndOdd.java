package com.example;

import java.util.Scanner;

public class EvenAndOdd {
	
		public static void main(String[] args) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter the number:");
			int num = sc.nextInt();
			
			if(num%2==0) {
				System.out.println("even number" + num);
			}else {
				System.out.println("odd number " + num);
			}
		}
		
		
	}


