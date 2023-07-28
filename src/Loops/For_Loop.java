package Loops;

public class For_Loop {

	public void testmethod()
	{
		
	                              	 //  syntax-->    for (datatype_variable_Value; Condition; increment++ or decrement --  )
		
		for (int i=1; i<=10; i++)    // increment 
			
	 //   for (int i=10; i>=1; i--)	 // decrement	
		{
			System.out.println(i+" ");
			
		}
		}
	    public static void main(String[] args) 
	    {
	    	For_Loop obj = new For_Loop();
	    	obj.testmethod();
	    }

}
