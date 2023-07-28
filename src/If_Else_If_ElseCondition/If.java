package If_Else_If_ElseCondition;

import java.util.Scanner;

public class If {
	public void testmethod() {
	int age; 
	System.out.println("Enter your age");
	Scanner sc = new Scanner(System.in);
	age = sc.nextInt();
	if(age>=18)
	{
	System.out.println("Eligible for vote...!");
	}
	// System.out.println("Thank You...!");
	}
	public static void main(String[] args) {
		If obj = new If();
		obj.testmethod();
	}
 
}
