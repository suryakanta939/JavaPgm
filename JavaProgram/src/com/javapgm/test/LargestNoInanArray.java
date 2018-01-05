package com.javapgm.test;

public class LargestNoInanArray {

	public static void main(String[] args) {
		int a[]={99,12,16,98,19,34};
		int big=0;
		int small=0;
		for(int i:a){
			
			if(i>big){
				big=i;
			}
		}
		System.out.println("biggest no in array "+big);
	}
   }
