package com.hyr.Arrays;
import java.util.Scanner;

public class InArrayDynamic_$9 {
	static int sum =0 ;
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter Memory allocation Size:- ");
		int[] a = new int[userinput.nextInt()];
		System.out.print("Enter array Values:-");
		Scanner userinput1 = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			a[i] = userinput1.nextInt();
		}
		for(int i = 0; i<a.length; i++) {
			
			sum += a[i];
		}
		System.out.print("Total Sum is :- " +sum);
		userinput.close();
		userinput1.close();
	}

}
