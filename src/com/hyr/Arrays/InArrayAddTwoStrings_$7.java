// Merge two arrays and print the Output in the Console ?
// ["santhosh", "G"] & ["QA" ,"Engineer"] --> [santhosh G QA Engineer]
package com.hyr.Arrays;

import java.util.Arrays;

public class InArrayAddTwoStrings_$7 {

	public static void main(String[] args) {
		String[] array1 = {"SANTHOSH", "G"};
		String[] array2 = {"QA", "ENGINEER"};
		System.out.println(Arrays.toString(array1));
	
		int totalLength = array1.length + array2.length;
	//	System.out.println(totalLength);
		String[] CombineArray = new String[totalLength];
		
		for(int i=0; i<array1.length ; i++) {
			CombineArray[i] = array1[i];
		}
		for(int j=0; j<array2.length; j++) {
			CombineArray[array1.length+j] = array2[j];
		}
		for(String Element : CombineArray) {
			System.out.print(Element+" ");
		}

	}

}
