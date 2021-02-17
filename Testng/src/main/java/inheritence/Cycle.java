package inheritence;

public class Cycle extends Bike {

	public static void main(String[] args) {

		//inheritence concept

/*
		// child class refernce and child class object	--it is allow both child and parent class methods/features	
		Cycle c1=new Cycle();
		c1.lowcost();
		
		c1.noengnie();
		c1.fuel();
		c1.speed();
		System.out.println("---------------------");

*/
		Cycle c1=new Cycle();
		
		//base class refernce and base class object  --it is allow only parent class methods/features

	//	Bike b1=new Bike();
	//		b1.fuel();
	//		b1.speed();

		//	System.out.println("====================================");


		//base class refernce and child class object   --it is allow only parent class methods/features

	//	Bike b1=new Cycle();
	//	b1.speed();
	//	b1.fuel();



	}


	public void lowcost() {

		System.out.println("cost is 5000");
	}

	public void noengnie() {

		System.out.println("cycle has no engine");
	}



	public void speed() {
		super.speed();
		
		System.out.println("too much spped");
	}


}
