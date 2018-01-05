package com.javapgm.test;

import java.util.HashMap;
import java.util.Set;

public class OccuranceByUsingMap {

	public static void main(String[] args) {
		String name="suryakantasahho";
		char c[]=name.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character ch:c){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}else{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
    Set<Character> keys=map.keySet();
    
    for(Character checkey:keys){
    	if(map.get(checkey)>1){
    		System.out.println(checkey+":"+ map.get(checkey));
    	}
    }
    
	}

}
