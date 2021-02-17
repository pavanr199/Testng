package inheritence;

public class AdvancedCalc implements Calc {

	public static void main(String[] args) {
		
		
		
		AdvancedCalc ac=new AdvancedCalc();
		ac.sub();
		ac.add();
		
		Calc c=new AdvancedCalc();
		c.add();
		c.sub();
		

	}
	
	public void cosvalue() {
		
		System.out.println("cosvalue is -11");
	}
	
	
  public void sinvalue() {
		
	  System.out.println("sinvalue is -1");
	}
	
	
	
	
	

	public void add() {
		System.out.println("addition is 100");
		
	}

	public void sub() {
		System.out.println("substraction  is 10");
		
	}

	public void mul() {
		
		System.out.println("multiplication  is 10000");
	}

}
