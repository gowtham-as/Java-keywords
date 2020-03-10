package Interfacekeyword;

interface mountain {
	
	void view();
}

class A7 implements mountain {
	
	   public void view() {
		   
		   System.out.println("yercad");
	   }
	
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		
            A7  a= new A7();		
		         
              a.view();

	}

}
