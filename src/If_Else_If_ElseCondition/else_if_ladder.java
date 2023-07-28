package If_Else_If_ElseCondition;

import java.util.Scanner;

public class else_if_ladder {

	public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = S.nextInt();

        if (age >= 36) {
            System.out.println("You are older.");
        } 
        
        else if (age >= 18 && age <= 35) {
            System.out.println("You are younger.");
        }
        
        else {
            System.out.println("You are a teenager.");
        }

       S.close();
	}

}
