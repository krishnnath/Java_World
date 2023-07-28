package constructor;

public class testconstructor {
	public testconstructor()  // Not Having any return type 
	{
		System.out.println("It's constructor");
	}
	public testconstructor(int a) //  Not Having any return type but a parameter
	{
		System.out.println("its parametrize constructor");
	}
	
	public void testconstructor()  // Having retun types 
	{
		System.out.println("its main method");
	}
	
	public static void main(String[] args) 
	{
		testconstructor obj1 = new testconstructor();
		testconstructor obj2 = new testconstructor(5);
		
		obj1.testconstructor();
	}

}
