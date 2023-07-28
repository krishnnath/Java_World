package Loops;

public class While 
{
   	public void testmethod() 
	  {
		int n=1; 
		System.out.println("Enter value for the condition \n");  // \n use for new line
		
			while(n<=8)
		  {
			System.out.println("Learn Coding ");
			++n;
		  }
	    }
public static void main(String[] args) 
	{
		While obj = new While();
		obj.testmethod();
	}

	

}
