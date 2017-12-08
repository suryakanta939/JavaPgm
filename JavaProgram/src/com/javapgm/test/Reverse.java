package com.javapgm.test;

import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Reverse {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value to reverse the string");
		String value=scn.nextLine();
		reverseString(value);
		Scanner scn1=new Scanner(System.in);
		System.out.println("enter the value to reverse the integer");
		int value1=scn1.nextInt();
		reverseNo(value1);
		sumOfNo(value1);
		reverseUsingbuffer("suryakanta sahoo");
	}
	
	public static void reverseString(String input){
		int lenght=input.length();
		String text="";
		for(int i=lenght-1;i>=0;i--){
			char charc=input.charAt(i);
			text=text+charc;
		}
		System.out.println(text);
	}
	public static void reverseUsingbuffer(String input){
		StringBuffer sb=new StringBuffer(input);
		System.out.println(sb.reverse());
	}
	public static void reverseNo(int input){
		int reverse=0;
		while(input!=0){
			int reminder=input%10;
			input=input/10;
			reverse=reverse*10+reminder;
		}
		System.out.println(reverse);
	}
  public static void sumOfNo(int input){
	  int sum=0;
	  while(input!=0){
		  int reminder=input%10;
		  input=input/10;
		  sum=sum+reminder;
	  }
	  System.out.println(sum);
  }
  
}
