package com.example;

public class Compoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int principal = 100;
int rate =10;
int time =2;

double amount = principal * Math.pow((1 + rate / 100), time);

double compoundInterest = amount-principal;
System.out.println("amount" + amount);
System.out.println("compound interest:" + compoundInterest);

	}
}
