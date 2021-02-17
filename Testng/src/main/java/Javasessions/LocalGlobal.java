package Javasessions;

public class LocalGlobal {
	
	
	int a=100;
	int b=200;
	
	
	

	public static void main(String[] args) {
		
		LocalGlobal lg=new LocalGlobal();
		lg.add();
		lg.sum();
		
		

	}

	public void add() {
		
		int x=12;
		int y=15;
		int z=x+y;
		System.out.println(z);
		
	}
	
	
public void sum() {
		int c=a+b;
		
		System.out.println(c);
	}
	
	
	
	
	
}
