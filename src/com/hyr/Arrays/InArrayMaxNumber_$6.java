// Find the Max Number from an array and print it along with it's Index value  
// input[2,5,1,9,6] O/p:- Value:- 9 index:- 3

package com.hyr.Arrays;

public class InArrayMaxNumber_$6 {
	static int index, index1;
	public static void main(String[] args) {
	int[] array = {2,5,1,9,6};
	int max = array[0];
	int min = array[0]; 	
	for(int i=1; i<array.length; i++) {
		if(array[i]> max) {
			max = array[i];
			index=i;
		}
		if(array[i]< min) {
			min = array[i];
			index1=i;
		}
	}
	System.out.println("Max_Value:- "+ max);
	System.out.println("Index_Value:- "+ index);
	System.out.println("Max_Value:- "+ min);
	System.out.println("Index_Value:- "+ index1);

	}
}
