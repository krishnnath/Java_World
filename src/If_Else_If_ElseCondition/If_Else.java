package If_Else_If_ElseCondition;

import java.util.Scanner;

public class If_Else 
{
  
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter Any Numbers");
		Scanner sc = new Scanner(System.in); 
		n=sc.nextInt();
		if(n>0)
		{
		System.out.println("Positive Number" );
	    }
	else
	{
		System.out.println("Negative Number" );	
	}

}
}