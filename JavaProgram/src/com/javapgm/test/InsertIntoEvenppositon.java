package com.javapgm.test;

public class InsertIntoEvenppositon {

	public static void main(String[] args) {
		insert("abcdefthrt");
		pyramid();
		System.out.println("******************");
		int powerOfTen = 1;
		for (int i = 0; i < 5; i++)
		{
		    powerOfTen = powerOfTen*10;
		    int digit = (powerOfTen-1)/9;
		    System.out.println(digit*digit);
		}

	}
	public static void insert(String text){	
		StringBuffer sb=new StringBuffer(text);
		for(int i=0;i<text.length()*2-1;i++){
			if((i+1)%2==0){
				sb.insert(i,"o");
			}
			
		}
		System.out.println(sb);
	}
	
	public static void pyramid(){
		for(int i=1;i<6;i++){
			for(int j=0;j<i;j++){
				System.out.print(j+1);
			}
			System.out.println("");
		}
		
		for(int k=5;k>0;k--){
			for(int l=0;l<k;l++){
				System.out.print(l+1);
			}
			System.out.println("");
		}
	}
	

}
