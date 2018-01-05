package com.javapgm.test;

import java.util.HashMap;

public class DuplicatecharacterInString {

	public static void main(String[] args) {
		String name="suryakantasahy";
		char[] c=name.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					//System.out.println(c[i]);
					map.put(c[i],1);
				}
			}
		}
  System.out.println(map);
	}

}
