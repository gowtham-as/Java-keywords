package Elsekeyword;

public class elsExample1 {

	public static void main(String[] args) {
		
		int year=2020;
		
		if (((year%4==0)&&(year%100 !=0)||(year%400==0)))   {
			
			System.out.println("its a leapyear");
			
		}
		
		else {
			
			System.out.println("its not a leapyear");
			
			
		}

	}

}
