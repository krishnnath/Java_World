package Abstraction;

public class Car extends Vehicle 
{
	public void speed() 
	{
		System.out.println("Speed Method");
		
	}
	public static void main(String[] args) 
	{
		Vehicle obj =  new Car();
		obj.speed();
	}

		
}


