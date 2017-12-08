package com.javapgm.test;

public class PalliDrom {

	public static void main(String[] args) {
		int[] arr={121,34,341,343,42};
      checkPallindrom(343);
      pallinDromArray();
	}
	
	public static void checkPallindrom(int input){
		
		int no=input;
		int reverse=0;
		 while(input!=0){
			 int reminder=input%10;
			 input=input/10;
			 reverse=reverse*10+reminder;
		 }
		 if(no==reverse){
			 System.out.println("the no "+no+" is a palliondrom");
		 }else{
			 System.out.println("its not a palliondrom");
		 }
	}
	
	public static void pallinDromArray(){
		int[] arr={121,34,341,343,42};
		for(int i=0;i<arr.length;i++){
			int reminder=0;
			int rev=0;
			int no=arr[i];
			while(no>0){
				reminder=no%10;
				rev=rev*10+reminder;
				no=no/10; 
			}
			if(arr[i]==rev){
				System.out.println(arr[i]+" is palliondroom");
			}else{
				System.out.println(arr[i]+" is not a palliondroom");
			}
		}
	}

}
