
//In this example, we are using logical operators. There operators return either true or false value.
package Operators;

public class Logical_operators1 
   {
	public void Logicalopt()
	{

        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
System.out.println("!(a && b) = " + !(a && b));
    }
	
	public static void main(String[] args) 
	{
	Logical_operators1 obj = new Logical_operators1();
	obj.Logicalopt();
    }
}

/*
 This code defines a class called Logical_operators1 with a method named Logicalopt. The Logicalopt method demonstrates the use of logical operators in Java.

Here's a step-by-step breakdown of the code:

The class Logical_operators1 is defined as public, indicating that it can be accessed from other classes.
The Logicalopt method is declared as public and has a void return type, which means it does not return any value.
Inside the Logicalopt method, two boolean variables a and b are declared and initialized with the values true and false, respectively.
The first System.out.println statement prints the result of the logical AND operator (&&) applied to a and b. The expression (a&&b) evaluates to false since both a and b are not true.
The second System.out.println statement prints the result of the logical OR operator (||) applied to a and b. The expression (a||b) evaluates to true since at least one of a and b is true.
The third System.out.println statement prints the result of the logical NOT operator (!) applied to the logical AND operation of a and b. The expression !(a && b) evaluates to true since the logical AND operation of a and b is false, and the logical NOT operator negates the result.
The main method is declared as static, which means it can be executed without creating an instance of the class.
Inside the main method, an object of the Logical_operators1 class named obj is created.
The Logicalopt method is called on the obj object, executing the code within that method.
  
  */
