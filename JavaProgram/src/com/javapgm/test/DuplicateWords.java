package com.javapgm.test;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		 String name="java j2ee java hello java you j2ee";
		 String[] words=name.split(" ");
		 HashMap<String,Integer> map=new HashMap<>();
		 for(String find:words){
			 if(map.containsKey(find)){
				 map.put(find, map.get(find)+1);
			 }else{
				 map.put(find,1);
			 }
		 }
   System.out.println(map);
          Set<String> duplicate=map.keySet();
          for(String findDup:duplicate){
        	  System.out.println(findDup);
        	  if(map.get(findDup)>1){
        		
        		  System.out.println(findDup+":"+map.get(findDup));
        	  }
          }
	}
	

}
