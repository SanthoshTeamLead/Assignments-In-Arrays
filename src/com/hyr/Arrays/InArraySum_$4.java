//Print the Sum of the integers in a integer array?
// input [2,5,6,1,9] output = 23
package com.hyr.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class InArraySum_$4 {

	public static void main(String[] args) {
     //   int[] ArrayList = {2,5,6,1,9};
//        int[] ArrayList = new int[6];
		ArrayList<Integer>numbers=new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int num =scanner.nextInt();
			if(num==-1) {
				break;
			}
		numbers.add(num);
		}
		int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of the entered numbers: " + sum);
        scanner.close();
	}
}
		
			
			
		
//		int[] ArrayList1 =userinput.nextInt();
//		for(int i=0; i<ArrayList.length ;i++) {
//			sum += ArrayList1[i];
//			}
//		System.out.println("Array Elements Total Sum= "+sum);
//		}
//	}


