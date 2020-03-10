package com.java;

      class Animald {}
      
      class Dog2 extends Animald {
    	  
    	  static void method (Animald a) {
    		  if(a instanceof Dog2) {
    			  
    			  Dog2 d=(Dog2)a;
    			  
    			  System.out.println("Downcasting was performed");
    		  }
    		  
    		  
    		  
    	  }

                 public static void main(String[] args) {
		
                	Animald a=new Dog2(); 
                	 
                	Dog2.method(a);

	}

}
