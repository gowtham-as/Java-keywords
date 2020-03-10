package Protectedkeyword;

class A {
	protected void GHM () {
		
		System.out.println("Try it");
	}
}
 class ProtectedExample extends A {

	 public void GHM()  {
	 
	      System.out.println("The method was overrided");
	      
	 }
	      
	public static void main(String[] args) {
		
		ProtectedExample pe=new ProtectedExample();
		
		pe.GHM();

	}

}
