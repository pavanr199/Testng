package Javasessions;

public class StringMethods {

	public static void main(String[] args) {
		
		
		
		String job="pavan get good job this month with good package";
		String job2="pavan get good Job this month with good package";
		
		int len=job.length();
		
		System.out.println(len);
		
		
		System.out.println(job.charAt(15));
		
		System.out.println(job.indexOf('o'));
		
		System.out.println(job.indexOf("month"));
		
		
		//string equals   or  compariosn
		System.out.println(job.equals(job2));
		//equals ignore case
		System.out.println(job.equalsIgnoreCase(job2));		
		//contains
		System.out.println(job.contains("this"));
		//sub string
		System.out.println(job.substring(3, 9));
		//trim method -will remove before and after spaces
		String str="  i love u ";
		System.out.println(str.trim());
		//replace method -will remove middle of the spces
		System.out.println(str.replace(" ", ""));
		
		//upper case
		System.out.println(str.toUpperCase());		
		
		
		
		
		
	}

}
