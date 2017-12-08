package com.javapgm.test;

public class LargestNoInArray {

	public static void main(String[] args) {
	largest();	
	}
	
	public static void largest(){
		int arr[]={1,2,2,4,5,8,10};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
			}else if(arr[i]<smallest){
				smallest=arr[i];
			}
		}
		System.out.println("largets no is "+largest);
		System.out.println("smallest no is "+smallest);
	}

}
