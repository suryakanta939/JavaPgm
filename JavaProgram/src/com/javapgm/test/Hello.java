package com.javapgm.test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public abstract class Hello {
      int i=10;
       abstract void test1();
      public static void check(){
    	  System.out.println("checking");
      }
      
      class Hi extends Hello{
    	  public void hicheck(){
    		  System.out.println("checking");
    	  }
    	  
    	  void test1(){
    		  System.out.println("test one in hi class");
    		  
    	  }
      }
}
