package Enumkeyword;

public class EnumExample {

	public enum Season {SUMMER,WINTER,AUTAMAN,RAINY}
	
	public static void main(String[] args) {
	
    for(Season s:Season.values()) {
		System.out.println(s);
	
	
	}

	System.out.println("The Value of WINTER is:"+ Season.valueOf("WINTER"));	
	System.out.println("Index of WINTER is:"+ Season.valueOf("WINTER").ordinal());
	System.out.println("Index of SUMMER IS:" + Season.valueOf("SUMMER").ordinal());
	}
}
