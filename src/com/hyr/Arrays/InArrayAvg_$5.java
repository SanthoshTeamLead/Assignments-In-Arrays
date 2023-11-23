// Print the Average of the integers is an integer array ? 
// input[2,5,9,3,6] o/p : 5

package com.hyr.Arrays;

public class InArrayAvg_$5 {

	public static void main(String[] args) {
		int[] values = {2,5,3,9,6};
		int  sum =0 ;
		float avgs ;
		int avg = values.length;
		for(int i=0; i<values.length; i++) {
			sum += values[i];	
		}
		avgs = sum / avg ;
		System.out.println(avgs);

	}

}
