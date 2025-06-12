package com.example;

public class PrimeNum {

    
	public static void main(String[] args) {
	int num = 22;
	int count = 0;
	if(num<=1) {
		System.out.println("not prime numbers:");
	}
	for(int i = 2;i<=num/2;i++) {
		if(num%i==0) {
			count++;
		}
	}
	if(count>1) {
		System.out.println(num+"prime num");
	}
	else {
		System.out.println("not prime umbers");
	}
		
}

  	  
    }
	



