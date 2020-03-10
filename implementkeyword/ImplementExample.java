package implementkeyword;

interface car1 {
	
	 void run();
}

 class FIAT implements car1 {
	
	
	    public void run() {
	    	
	    	System.out.println("new car created from honda");
	    }
}




public class ImplementExample {

	public static void main(String[] args) {
		FIAT OBJ= new FIAT();  
		
		OBJ.run();
		

	}

}
