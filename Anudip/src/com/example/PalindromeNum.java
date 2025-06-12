package com.example;

public class PalindromeNum {

	public static void main(String[] args) {
		
		int num = 1213;
		int rev =0;
		int temp,rem;
		temp= num;
		
		while(num>0) {
			rem = num%10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		if(temp==rev) {
			System.out.println("palindrome num" + rev);
		}else {
			System.out.println("not palindrome number:" + rev);
		}
	}
	
}
