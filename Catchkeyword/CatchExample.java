package Catchkeyword;

public class CatchExample {

	public static void main(String[] args) {
		
		try
		{
			int num= 50/0;
		}
		
        catch (ArithmeticException e)
        
        {
             System.out.println(e);	
        }
             System.out.println("rest of the code");
}
}