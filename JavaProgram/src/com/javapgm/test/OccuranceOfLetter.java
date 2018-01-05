package com.javapgm.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OccuranceOfLetter {
	
	public static void main(String[] args) {
		String name="suryakanta";
		
		for(int i=0;i<name.length();i++){
			char c=name.charAt(i);
			String newWord=name.replaceAll(c+"","");
			//System.out.println(newWord);
			int totalno=name.length()-newWord.length();
			System.out.println(c+"="+totalno);
		}
		
		
//		boolean  flag=false;
//          for(int i=0;i<name.length();i++){
//        	  int count=1;
//        	  for(int j=i+1;j<name.length();j++){
//        		  if(name.charAt(i)==name.charAt(j)){
//        			 flag=true;
//        			 count++;
//        		  }
//        	  }
//        	  System.out.println(name.charAt(i)+"="+count);
////        	  System.out.println(flag);
////        	  if(flag=true){
////        		  System.out.println(name.charAt(i)+"="+count);
////        	  }else{
////        		  System.out.println(name.charAt(i)+"=1");
////        	  }
////        	 
//        	  
//       }
//         
//
	}

}
