package com.search;

//Exercise2

// expansion of binary search

public class BinaryRecursiveSearch {
	
	public static void main(String[] args) {
		int[] inputs= {-15,-11,-1,1,7,9,10};
		int value=7;
		
		int searchvalue=recursiveSearch(inputs,0,inputs.length-1,value);
		System.out.println("element "+value+ " is at position "+searchvalue);
		
	}
	
		private static int recursiveSearch(int[] inputs, int start,int end, int value)
		{
			//breaking condition->if value not found
			if(start>end)
			{
				return -1;
			}
			
			int midpoint=(start+end)/2;
			
			//mid value is search element
			if (inputs[midpoint]==value)
			{
				return midpoint;
			}
			
			//search in right half
			else if (inputs[midpoint]<value) {
				//start=midpoint+1; start value changed to midpoint+1 and calls recursive method again
				return recursiveSearch(inputs,midpoint+1,end,value);
				
			}
			//search in left half
			else
			{
				//end=midpoint-1;end value changed to midpoint-1 and calls recursive method again
				return recursiveSearch(inputs,start,midpoint-1,value);
			}	
			
			
		}

}
