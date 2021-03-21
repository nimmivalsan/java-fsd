package com.search;

//Exercise1
public class BinarySearch {
	
	public static void main(String[] args) {
		int[] inputs= {-15,-11,-1,1,7,9,10};
		int value=7;
		
		int searchvalue=iterativeSearch(inputs,value);
		System.out.println("element "+value+ " is at position "+searchvalue);
		
	}
	
	private static int iterativeSearch(int[] inputs, int value)
	{
		int start=0;
		int end=inputs.length-1;
		
		while (start<=end)
		{
			int midpoint=(start+end)/2;
			
			//mid value is search element
			if (inputs[midpoint]==value)
			{
				return midpoint;
			}
			
			//search in right half
			else if (inputs[midpoint]<value) {
				start=midpoint+1;
				
			}
			//search in left half
			else
			{
				end=midpoint-1;
			}	
			
		
		}
		return -1;
	}

}
