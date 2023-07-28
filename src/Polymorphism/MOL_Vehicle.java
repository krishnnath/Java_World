        // Methods Overloading.
        
// If multiple methods of same name are defined in a same class (in any one class only) then it’s called as methods overloading.
 //  there are 2 methods of same name speed(), but have different parameters.              
package Polymorphism;

public class MOL_Vehicle {

	public void speed(int a) 
	{
		System.out.println("It's speed method");
	}
	public void speed(int b, char d) {
		System.out.println("It's multiple parameteres");
	}
	public static void main(String[] args) {
		MOL_Vehicle obj = new MOL_Vehicle();
		obj.speed(123);
		obj.speed(111, 'K');
	}
}
