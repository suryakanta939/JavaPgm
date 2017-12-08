package com.javapgm.test;

import java.util.Scanner;

public class CheckingNoOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("give ur input to check weather it's a no or not");
		String input=scn.next();
		Boolean status=noOrNot(input);
		System.err.println("is the "+input+"is a no:status "+status);
		Scanner mob=new Scanner(System.in);
		System.out.println("give ur input to check weather it's a mobile no or not");
		String mobile=mob.next();
		mobileNo(mobile);
	}
	
	public static Boolean noOrNot(String no){
		try{
			Integer.parseInt(no);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	
	public static void mobileNo(String input){
		if(noOrNot(input)==true && input.length()==10){
			System.out.println("its a mobile no");
		}else{
			System.out.println("its not a mobile no");
		}
	}

}
