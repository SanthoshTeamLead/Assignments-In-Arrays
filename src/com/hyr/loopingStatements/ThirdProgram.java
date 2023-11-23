//3. Write a Program print the Numbers Which are Divisibe by 7 for the 
// range of 150 to 200?
package com.hyr.loopingStatements;

public class ThirdProgram {

	public static void main(String[] args) {
		int i = 150;
		while (i<=200) {
			if(i%7 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}