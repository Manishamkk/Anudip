package com.example;

import java.util.ArrayList;
import java.util.List;

public class CommonElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array1 = {2,3,45,5,};
		Integer[] array2 = {2,4,6,8,9,3,45};
		List<Integer> commonElement = new ArrayList();
		for(int i = 0;i<array1.length;i++) {
		for(int j = 0; j<array2.length;j++) {
		if(array1[i] ==array2[j]) {
			commonElement.add(array1[i]);
			
		}}}
		System.out.println(commonElement);
	}
}
