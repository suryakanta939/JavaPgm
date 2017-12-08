package com.javapgm.test;

public class Pyramid {

	public static void main(String[] args) {
		
		checkPyramid();
		System.out.println("***********************");
		checkPyramidStar();
		System.out.println("***********************");
		checkPyramidNo();
		System.out.println("***********************");
		checkPyramidNoStar();
	}
	
	public static void checkPyramid(){
		for(int i=5;i>=0;i--){
			for(int j=0;j<i;j++){
				System.out.print(j+1);
			}
			System.out.println("");
		}
		
	}
	public static void checkPyramidStar(){
		for(int i=5;i>=0;i--){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}
	
	public static void checkPyramidNo(){
		for(int i=1;i<6;i++){
			for(int j=0;j<i;j++){
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
	public static void checkPyramidNoStar(){
		for(int i=1;i<6;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
