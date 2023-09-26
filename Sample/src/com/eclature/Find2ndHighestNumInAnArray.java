package com.eclature;

import java.util.Arrays;

public class Find2ndHighestNumInAnArray {

	public static void main(String[] args) {

		int[] arr = {5, 2, 9, 1, 7, 6};
		
		 int temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
