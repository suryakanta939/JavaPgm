package com.javapgm.test;

import java.util.Arrays;

public class MissingNo {

	public static void main(String[] args) {
		int[] no={1,3,4,2,7,8,9,10,13,15};
		missing(no);
	}
	
	public static void missing(int[] arr){
	
		/*
		 * shorting the array
		 * */
		Arrays.sort(arr);
		/*get the largest and give it as limit*/
		int largeno=findTheLargsetNo(arr);
		int j=0;
		for(int i=1;i<largeno;i++){
			if(arr[j]==i){
				j++;
			}else{
				System.out.println(i);
			}
		}
	}
	
	
public static int findTheLargsetNo(int[] arr){
	int largest=arr[0];
	int smallest=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>largest){
			largest=arr[i];
		}else if(arr[i]<smallest){
			smallest=arr[i];
			
		}
	}
	System.out.println("largset "+largest);
	System.out.println("smallest "+smallest);
	return largest;
}
}
