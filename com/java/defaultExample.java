package com.java;


class A {
	
	String msg= "Try to access default variables outside the class within the package";
	
}

public class defaultExample {

	public static void main(String[] args) {
		
            A a=new A();		
       
            System.out.println(a.msg);
            
	}

}
