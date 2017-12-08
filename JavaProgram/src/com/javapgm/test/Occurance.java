package com.javapgm.test;

public class Occurance {

	public static void main(String[] args) {
	CheckOccurance("suriyakishoore", 'o');
	}
	
	public static void CheckOccurance(String text,char letter){
		int count=0;
		for(int i=0;i<text.length();i++){
			if(letter==text.charAt(i)){
				count++;
			}
		}
		System.out.println("the letter "+letter+" is present in the string is "+count);
	}
}
