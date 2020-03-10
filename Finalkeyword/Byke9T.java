package Finalkeyword;

public class Byke9T {

	final int speedlimit=250;  //Here we using final keyword in variables. 
	
	void run() {
		System.out.println("IN FOURTH GEAR:"+200); // With out System.out.println we cannot increase the speed limit. 
		//this variable are covered by final keyword.
		
	}
	
	public static void main(String[] args) {
		
		Byke9T obj=new Byke9T(); 
			
			obj.run();
		}
	}


