package com.hyr.ifelseConditons;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Interview First Round:-");
		String OnlineText = sc.nextLine();
		String Pass = "Pass";
		String Fail = "Fail";
		if(OnlineText.equals(Pass)) {
			System.out.println("Selected Round One");
			System.out.print("Interview Second Round:- ");
			String OnlineRound1 = sc.nextLine();
			if(OnlineRound1.equals(Pass)){
				System.out.println("Selected Round Two");
				System.out.print("Interview HR Round:- ");
			}
			else if(OnlineRound1.equals(Fail)) {
				System.out.println("Not Selected Round Two");
			}
				
			String OnlineHRRound = sc.nextLine();
			if(OnlineHRRound.equals(Pass)) {
				System.out.println("Selected HR Round");
				System.out.print("Interview Results:- ");
			}
			else if(OnlineHRRound.equals(Fail)) {
				System.out.println("Not Selected HR Round");
			}
//					
			String placed = sc.nextLine();
			if(placed.equals(Pass)) {
				System.out.println("Congratulations Your placed");
			}
			else if(placed.equals(Fail))  {
				System.out.println("Not placed");
			}
					
		}
		else if(OnlineText.equals(Fail)){
			System.out.println("Your Not Selected Round One");

		}
		sc.close();

	}

}
