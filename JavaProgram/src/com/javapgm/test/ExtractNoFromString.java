package com.javapgm.test;

import java.util.Scanner;

public class ExtractNoFromString {

	public static void main(String[] args) {
		System.out.println("eneter the name");
		Scanner scn=new Scanner(System.in);
		String text=scn.next();
		int sum=0;
		for(int i=0;i<text.length();i++){
			char letter=text.charAt(i);
			try{
				int no=Integer.parseInt(letter+"");
				System.out.println(no);
				sum=sum+no;
			}catch(Throwable t){
				System.out.println(t.getMessage());
			}
			
		}
System.out.println("total sum of the no is "+sum);
	}

}
