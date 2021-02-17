package Javasessions;

public class ConstructorwithThiskeyword {

	//class variables or global variables
	String name;
	int age;
	
	
	
	public static void main(String[] args) {

		ConstructorwithThiskeyword obj=new ConstructorwithThiskeyword("pavan", 25);
		
		
		
		
		
		
		

	}

	public ConstructorwithThiskeyword(String name, int age) {
		
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
