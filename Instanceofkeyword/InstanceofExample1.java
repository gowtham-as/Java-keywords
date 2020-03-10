package Instanceofkeyword;
  

// To creating an object for sub class to getting instance from parent class.
class Animal{}

class Dog extends Animal {



public static class InstanceofExample1 {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		
		
		System.out.println( d instanceof Animal);   
	}
		

	}

}
