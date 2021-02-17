package inheritence;

public class MethodOverloading {

	public static void main(String[] args) {
		
		
		MethodOverloading mo =new MethodOverloading();
		
		mo.start(10);
		mo.start(10, "pavan");

	}

	
	
	public void start() {
		
		System.out.println("start method---0 input parameters");
	}
	
	public void start(int x) {
		
		System.out.println("start method---1 input parameters");
		System.out.println(x);
	}
	
	
	
	public void start(int x, String name) {
		System.out.println("start method---2 input parameters");
		System.out.println(x);
	}
	
	
	
	
	
	
}
