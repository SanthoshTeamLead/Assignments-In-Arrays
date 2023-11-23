package com.hyr.Arrays;

public class InArrayStringsSum_$8 {
	static String word1 = "", word2 = "";
	public static void main(String[] args) {
		String[] arrays = {"java","Selinium","CoreJava","AdvancedJava","Oos"};
		int totalLength =  arrays.length;
		String minWord = arrays[0];
		int minValue =minWord.length();
		
		for(int i =1; i<totalLength ; i++) {
			  
			String word = arrays[i];
			int Size = word.length();
			if(Size < minValue) {
				minValue = Size; 
				word1 = arrays[i];
			}
			if(Size > minValue) {
				minValue = Size;
				word2 = arrays[i];
			}
		}
		System.out.println("lowest Word:- "+word1);
		System.out.println("Highest Word:- "+word2);
	}

}
