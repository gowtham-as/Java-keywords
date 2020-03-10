package Floatkeyword;

class Employe {
	float salaryamount = 6000000;
}



           class Programmer extends Employe{

        	   float bonus=10000;
        	   
	public static void main(String[] args) {
		
		Programmer p= new Programmer();
		
		
System.out.println("salaryamount:"+ p.salaryamount );
System.out.println("bonus:"+ p.bonus);
		
		
	}

}
