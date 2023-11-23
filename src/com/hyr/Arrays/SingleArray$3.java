package com.hyr.Arrays;
import java.util.Scanner;

public class SingleArray$3 {
	public static void main(String[] args) {
		int[] a = {2,3,5,7,9};
		Scanner userinput = new Scanner(System.in);
		int SearchElement = userinput.nextInt();
		boolean found = false;
		for(int i=0; i<a.length; i++) {
			if(a[i]== SearchElement) {
				 found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Element Found");
		}
		else {
			System.out.println("Element Not Found");
		}
	}
}
