package Interfacekeyword;

interface Drawable {
	
	void draw();
}

class rectangle implements Drawable {
	
	public void draw() {
		
		System.out.println("rectangle was drawn");
		
	         } 
	}
	
class triangle implements Drawable {
	
	public void draw()  {
		
		System.out.println("triangle was drawn");
	}
}





public class InterfaceExample1 {

	public static void main(String[] args) {
	
		Drawable d =new triangle(); {
			  
			d.draw();
		Drawable s=new rectangle(); {
			
			s.draw();
			
		}
		}	
	}
}