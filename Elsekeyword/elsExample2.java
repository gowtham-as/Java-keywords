package Elsekeyword;

public class elsExample2 {

public static void main(String[] args)  {
	
	int mark=69;
	
	if (mark<50) {
		
		System.out.println("Fail");
		
	}
	
	else if (mark>=50  && mark<60)  {

		System.out.println("grade E");
	}
	
	else if (mark>=60 && mark<65) {
		System.out.println("grade D");
		
	}
	
	else if (mark>=65 && mark <70) {
		
		System.out.println("grade C");
		
	}
	
	else if (mark>=70 && mark <75) {
		
		System.out.println("grade B");
	}
	
	else if(mark>=75 && mark<85) {
		
		System.out.println("grade B");
		
	}
	
	else if (mark>=85 && mark<95) {
		
		System.out.println("grade S");
	}
		
	else if (mark>=95 && mark<100) {
		
		System.out.println("grade O");
		
	}
	else   {
		
		System.out.println("invalid");
	}
}
}	