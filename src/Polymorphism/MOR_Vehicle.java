//   Method overriding 

//  If multiple method of same name is defined in multiple classes then it is called as methods overriding.
//


package Polymorphism;

public class MOR_Vehicle {
	public void speed(int a)
	{
		System.out.println("It is a speed method");
	}
	
	public void speed (int b, char d) 
	{
		System.out.println("It is a speed method in multiple parameters");
	}
	public static void main(String[] args) {
		MOR_Vehicle obj = new MOR_Vehicle();
		obj.speed(786);
		obj.speed(22, 'K');
	}

}
