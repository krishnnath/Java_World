package Variables;

public class Instance_Variable {
	 int id = 10;
	 
	 public void testmethod() 
	 {
		 System.out.println(id);
	 }
	 public static void main(String[] args) 
	 {
		 Instance_Variable obj = new Instance_Variable ();
		 obj.testmethod();
	 }
	 
}
