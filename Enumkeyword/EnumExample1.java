package Enumkeyword;

    class EnumExample1 {

	
	enum Season{
		WINTER(0), SPRING(3), SUMMER(5), RAINY(8);
		
		private int values;
	    private Season(int values) {	
		this. values=values;
		
	}
	
	}
	public static void main(String[] args) {
		
		for(Season s:Season.values()) {
			
			System.out.println(s+": "+s.values);
		}

	}

}
