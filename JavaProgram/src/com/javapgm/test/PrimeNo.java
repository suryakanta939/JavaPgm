package com.javapgm.test;

import java.util.ArrayList;

public class PrimeNo {

	public static void main(String[] args) {
		checkPrimeNo(11);
		for(int i=1;i<100;i++){
			findPrimeNo(i);
		}
	}
	
	public static void checkPrimeNo(int no){

		int flag=0;
		for(int i=2;i<no;i++){
			if(no%i==0){
				System.out.println(no+" is not a prime no");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println(no+" is a prime no");
		}
	
	}
	
	public static void findPrimeNo(int no){
		int flag=0;
		for(int i=2;i<no;i++){
			if(no%i==0){
				System.out.println(no+" is not a prime no");
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println(no+" is a prime no");
		}
		
	}
	
	
}
