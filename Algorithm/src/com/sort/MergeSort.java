package com.sort;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] inputs= {20,35,-11,7,65,1,-22};
		
		System.out.println("unsorted"+Arrays.toString(inputs));
		mergeSort(inputs,0,inputs.length);
		System.out.println("sorted"+Arrays.toString(inputs));
	}
	
	public static void mergeSort(int[] inputs, int start, int end) {
		
		// break logic fir breaking recursion
		
		if(end-start<2)
		{
			return;
		}
		
		//1.divide array element
		int mid=(start+end)/2;
		
		//2. call mergesort for first half
		mergeSort(inputs, start, mid);
		
		//call mergesort for 2nd half
		mergeSort(inputs, mid, end);
		
		//call merge
		merge(inputs,start,mid,end);
		
	}

	private static void merge(int[] inputs, int start, int mid, int end) {
		// 
		
		if(inputs[mid-1]<=inputs[mid])
		{
			return;
		}
		
		int i=start;
		int j=mid;
		int tempIndex=0;
		
		int[] temp=new int[end-start];
		while(i<mid && j<end)
		{
			temp[tempIndex++]=(inputs[i]<=inputs[j]) ? inputs[i++]: inputs[j++];
			
		}
		
		//copy element from temp array to actual inputs array
		
		System.arraycopy(inputs, i, inputs, start+tempIndex, mid-i);
		System.arraycopy(temp, 0, inputs, start, tempIndex);
		
		
		
	}

}
