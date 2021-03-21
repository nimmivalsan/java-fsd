package com.sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] inputs= {20,35,-11,7,65,1,-22};
		
		System.out.println("unsorted"+Arrays.toString(inputs));
		insertSort(inputs);
		System.out.println("sorted"+Arrays.toString(inputs));
	}

	public static void insertSort(int[] inputs)
			{
		for(int firstUnsortedIndex=1;firstUnsortedIndex<inputs.length;firstUnsortedIndex++)
		{
			int element=inputs[firstUnsortedIndex]; //35
			int i;
			for (i=firstUnsortedIndex; i>0 && inputs[i-1]>element;i--)
			{
				inputs[i]=inputs[i-1];
			}
			inputs[i]=element;
		}
			}
}
