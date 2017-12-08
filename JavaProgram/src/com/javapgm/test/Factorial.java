package com.javapgm.test;

public class Factorial {

	public static void main(String[] args) {
		cheeckFactorial(4);
	}
	
	public static  void cheeckFactorial(int input){
	  int fact=1;
	  for(int i=input;i>=1;i--){
		  fact=fact*i;
	  }
	  System.out.println("the factorial of the no "+ input+" is ="+fact);
	}
}
