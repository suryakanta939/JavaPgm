package com.javapgm.test;

public class HarshadNo {

	public static void main(String[] args) {
   checkingHarsHadNo(1453);
	}
	public static void checkingHarsHadNo(int input){
		int sum=0;
		int inputno=input;
		while(input>0){
			int reminder=input%10;
			input=input/10;
			sum=sum+reminder;
		}
		System.out.println("the total sum of the no is "+ sum);
		
		int harshHard=inputno/sum;
		System.out.println("the harshhard no is "+harshHard);
	}
}
