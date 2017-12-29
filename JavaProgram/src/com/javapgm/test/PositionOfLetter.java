package com.javapgm.test;

import java.util.Scanner;

public class PositionOfLetter {

	public static void main(String[] args) {
		PositionOfLetter pos=new PositionOfLetter();
		pos.getPosition("Sahoo");
	}
	
	public void getPosition(String name){
		for(int i=0;i<name.length();i++){
			 char letter=name.charAt(i);
		     char lowercaseLetter=Character.toLowerCase(letter);
			int ascivalue=(int)lowercaseLetter;
			
			int thePositionOftheLetter=ascivalue-96;
			
			System.out.println("The postion of "+letter+" in alphabet is "+thePositionOftheLetter);
			
		}
	}
	
}
