package com.sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] intArr= {20,35,-15,5,55,2,-22};
		
		System.out.println("before sorting: "+Arrays.toString(intArr));
		
		bubbleSort(intArr);
		
		System.out.println("after sort: "+Arrays.toString(intArr));
		
		
	}
	//worst time complexity : o(n^2)
	private static void bubbleSort(int[] intArr) {
		
		//outer for loop for iterating over unsorted partition
		
		for (int lastUnsortedIndex = intArr.length-1; lastUnsortedIndex >0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if(intArr[i]>intArr[i+1])
				{
					swap(intArr,i,i+1);
				}
			}
			
		}
		
	}

	private static void swap(int[] intArr, int i, int j) {
		
		if(i==j)
		{
			return;
		}
		
		int tmp= intArr[i];
		intArr[i]=intArr[j];
		intArr[j]=tmp;
		
	}

}
