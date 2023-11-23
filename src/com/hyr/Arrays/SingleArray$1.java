//1. Define a single dimenstional array and store some values and read them 
//   using for loop?
package com.hyr.Arrays;

public class SingleArray$1 {

	public static void main(String[] args) {
		int[] Values = new int[5];
		Values[0] = 5;
		Values[1] = 6;
		Values[2] = 8;
		Values[3] = 9;
		Values[4] = 7;
		for (int i=0; i<Values.length; i++) {
			System.out.println("values["+i+"]= " + Values[i]);
		}
	}
}
