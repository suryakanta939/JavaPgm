package com.javapgm.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		Object arr[]={11,23,43,11,55,23,55,"suriya","hari","suriya"};
		ArrayList<Object> lst=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					lst.add(arr[i]);
				}
			}
		}
		
      System.out.println(lst);
	}

}
