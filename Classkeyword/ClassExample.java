package Classkeyword;

class employ {
	
	int id;
	String name;
	long salary;
	
	public employ(int id, String name,long salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
}


public class ClassExample {

	public static void main(String[] args) {
		
		employ E= new employ(102, "Sathish", 25000);
		
		
		     System.out.println(" Employ id:"+E.id+" " +" Employ name:" +E.name+ " " +"Employ salary:" +E.salary);
		     
		     
		     
	}	
		
		
}
	       