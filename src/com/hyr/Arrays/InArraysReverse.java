// Reverse the array and print in the console 
// i/p: -[true, false, false, true, false, true]
// o/p :- [true,false, true, false, false, true]

package com.hyr.Arrays;

public class InArraysReverse {

	public static void main(String[] args) {
		boolean[] arrayList = {true,false,false, true, false,true};
		int count = arrayList.length;
		System.out.println(count);
		for(int i=count-1; i>=0 ; i-- ) {
			System.out.print(arrayList[i]+" ");
		}
	}
	

}
