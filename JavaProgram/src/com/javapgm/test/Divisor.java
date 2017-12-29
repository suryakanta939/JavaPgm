package com.javapgm.test;

public class Divisor {

	public static void main(String[] args) {
		returnDivisor();
		

	}
	
	public static void returnDivisor(){
		int no=10;
		int rem=0;
		for(int i=1;i<=10;i++){
			rem=no%i;
			if(rem==0){
				System.out.println(i);
			}
		}	
	}

}
