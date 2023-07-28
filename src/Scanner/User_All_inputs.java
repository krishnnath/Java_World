package Scanner;

import java.util.Scanner;

public class User_All_inputs {

	//private static final String Ph = null;

	public static void main(String[] args) {
		 
		// print String value
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=s.next();
		System.out.println("Name :"+name);
		
		// print int value
		System.out.println("Enter your age:");
		int age=s.nextInt();
		System.out.println("age:"+age);
		
		// print char value
		System.out.println("Enter Your Gender:");
		char gender=s.next().charAt(0);
		System.out.println("gender:"+gender);
				
		// print mobile number 
		System.out.println("Enter Phone No:");
		long Phno=s.nextLong();
		System.out.println("Phone No:"+Phno);
	}

}
