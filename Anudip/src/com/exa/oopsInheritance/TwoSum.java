package com.exa.oopsInheritance;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	
	
	    public static int[] twoSum(int[] nums, int target) {
	        // Map to store number and its index
	        Map<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];  // value to find
	            if (map.containsKey(complement)) {
	                return new int[] { map.get(complement), i };
	            }
	            map.put(nums[i], i);  // store number and index
	        }

	        return new int[] {}; // return empty if no solution
	    }

	    public static void main(String[] args) {
	        int[] nums = {2, 7, 11, 15};
	        int target = 9;
	        int[] result = twoSum(nums, target);

	        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
	    }
	}

