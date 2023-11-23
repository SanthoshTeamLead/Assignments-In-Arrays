//Write a Program To Store MulitiDimenstional Array Values?
package com.hyr.Arrays;

public class StoreMdArray {
	public static void main(String[] args) {
		int[][] array= new int[3][2];
		int sum = 0 ;
		array[0][0] = 1;
		array[0][1] = 2;
		
		array[1][0] = 3;
		array[1][1] = 4;
		
		array[2][0] = 5;
		array[2][1] = 6;
		
		  for(int i=0; i<array.length; i++) {
			  int[] singleRow = array[i];
			  for(int j=0; j<singleRow.length; j++) {
			  System.out.print(singleRow[j]+ " ");
			  }
			  System.out.println();
		  }
		  
		
		
	}
}
