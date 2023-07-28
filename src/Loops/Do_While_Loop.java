package Loops;

public class Do_While_Loop 
{
   public void testmethod() 
   {
	
		int n=1;
		do 
		{
			System.out.println(n+" ");
			++n;
		}
		
		while(n<=10);
   }
   public static void main(String[] args) 
   {
	   Do_While_Loop obj = new Do_While_Loop();
	   obj.testmethod();
   }
	
}
