package com.example;

import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the character");
char ch = sc.next().toLowerCase().charAt(0);
if(ch>='a' && ch<='z') {
	
	if(ch=='a' || ch =='i' || ch=='o' || ch == 'e' || ch =='u') {
		System.out.println("they are the vowels");
	}else {
		System.out.println("Consonat others are: " + ch);
	}
	
}else {
	System.out.println("please enter the valid input");
}
		
	}

}
