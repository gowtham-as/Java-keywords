package Instanceofkeyword;


interface Network {}

class C implements Network {
	
	public void c() {
		System.out.println("method of a");
	}}

	class D implements Network {
		
		public void  d() {
		
		System.out.println("method of b");
	}
}

	
	class call {
		
		void invoke(Network n) {
			
			
			if (n instanceof C) {
			C c=(C)n;
			c.c();
			
			}
		

            if (n instanceof D){
            	
            	D d=(D)n;
            	d.d();
            }
	


		}}







public class Instanceclasstest {

	public static void main(String[] args) {
		
		
		Network n=new C();
          call c =new call();
          c.invoke(n);
	}

}
