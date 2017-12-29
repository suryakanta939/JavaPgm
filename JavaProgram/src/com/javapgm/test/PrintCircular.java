package com.javapgm.test;

import java.util.Scanner;

public class PrintCircular {

	public static void main(String[] args) {

		System.out.println("eneter the name");
		Scanner scn=new Scanner(System.in);
		String text=scn.nextLine();
		System.out.println("enter the positionfrom where you want to rotate");
		int upto=scn.nextInt();
		String[] arr=text.split(" ");
		
		if(upto>=0 && upto<arr.length){
			for(int j=upto;j<arr.length;j++){
				System.out.print(arr[j]+" ");
			}

			for(int i=0;i<upto;i++){
				System.out.print(arr[i]+" ");
			}
		}else{
			System.out.println("the no is invalid");
		}


	}

}
