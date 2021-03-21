package com.search;

import java.util.Arrays;

//eXercise3

public class ExponentialSearch {

	public static void main(String[] args) {
		int[] inputs= {-15,-11,-1,1,7,9,10};
		int value=7;
		
		int searchvalue=exponentialSearch(inputs,value);
		System.out.println("element "+value+ " is at position "+searchvalue);
		
	}

	private static int exponentialSearch(int[] inputs, int value) {
		
		//1. start with index=0
		if(inputs[0]==value) {
			return 0;
		}
		
		//2. double method
		int i=1;
		while (i<inputs.length && inputs[i]<=value) {
			i=i*2;
			
		}
		
		//3. bInary sEarch
	//BinarySearchWithRecursivecall.recursiveSearch(inputs,start,end,value)
		return Arrays.binarySearch(inputs,i/2,Math.min(i, inputs.length),value);
	}
	
}
