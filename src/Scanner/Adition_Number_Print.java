package Scanner;

import java.util.Scanner;

public class Adition_Number_Print {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter addition value");
		
		int num1 = S.nextInt();
		System.out.println("Add first Vlue");
		
		int num2 = S.nextInt();
		System.out.println(num1 + num2);
	}

}
