package Statickeyword;

class Studentlf {
	
	int roll_no;
    String name;
	static String College ="JITS";
	static void change() {
		College="BBITS";
	}
  Studentlf (int r, String n)   {
	  
	  roll_no= r;
	  name= n;
  }

  void display() {
System.out.println(roll_no+""+name+""+College);}

}
public class StaticExample {

	public static void main(String[] args) {

		Studentlf.change();
		Studentlf s1= new Studentlf( 111," ganesh");
			Studentlf s2=new Studentlf (23435,"karan");
		s1.display();
		s2.display();
		
		

	}

}
