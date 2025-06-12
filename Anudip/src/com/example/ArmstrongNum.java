package com.example;

public class ArmstrongNum {

	public static void main(String[]args) {
		
		
			int num =153 ;
			int res ,temp;
			int sum=0;
			temp =num;
			
			while(num>0) {
				res = num%10;
				sum = sum+(res*res*res);
				num = num/10;
			}
			if(temp==sum) {
				System.out.println("armstrong number"+ sum);
			}else {
				System.out.println("not armstrong number:" +sum);
			}
			
			
			
			
		}	
		}

		

