package Javasessions;

public class Constructorconcept {



	public Constructorconcept() {

		System.out.println("default constructor");

	}


	public Constructorconcept(int i) {

		System.out.println("one argument constructor" +i);

	}

	public Constructorconcept(int i, int j) {

		System.out.println("two argument constructor" +i);
		System.out.println(j);
	}




    //how to call constructor --the moment when u create the  object of that particular class.it will be called.  **the  moment when u create the object it will automaticalley called
	//here we are not using refernce variable*******

	public static void main(String[] args) {


		Constructorconcept obj1=new Constructorconcept();
		Constructorconcept obj=new Constructorconcept(200);
		Constructorconcept obj2=new Constructorconcept(300 , 500);
	}

}
