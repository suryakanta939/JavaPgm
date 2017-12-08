package com.javapgm.test;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		duplicateInarray();
	}
	public static void duplicateInarray(){

		 int[] arr = {1,3,7,8,8,9,14,16,16,17,17};
		 for(int i=0;i<arr.length;i++){
			 for(int j=i+1;j<arr.length;j++){
				 if(arr[i]==arr[j]){
					 System.out.println(arr[j]);	 
				 }
			 }
		 }
	}
public static void duplicateInList(){
	 List<Integer> list = new ArrayList<Integer>();
	 
}
}
