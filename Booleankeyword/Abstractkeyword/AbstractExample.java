package Abstractkeyword;

abstract class Vehicle  
{  
    abstract void bike();  
      
}  
class Honda extends Vehicle  
{  
  
      
    void bike() {  
        System.out.println("Bike is running");  
      
    }  
      
}  
  
public class AbstractExample {  
  
    public static void main(String[] args) {  
  
    Honda obj=new Honda();  
    obj.bike();  
    }         
}  