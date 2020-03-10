package Publickeyword;
      
        class Z {
	
	      public String NHJ= ("The variables of public modifier can access out side of the class");
	          
	      String info;
	       
	       public void display() {
	    	   
	    	   System.out.println("The method of public modifier can access out side of the class");
	    	   System.out.println(info);
	       }


             public Z (String info) {
            	 
            	 this.info=info;
         }
        }


public   class PublicExample {

	public static void main(String[] args) {
		
         Z h=new Z ("Try to create instance of public constructor out side the class"+ " "+"where is the info");
         System.out.println(h.NHJ+ " f" + h.info);
         h.display();
         
       
	}

}
