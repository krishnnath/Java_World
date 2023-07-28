package Operators;

public class Relational_Operators {
public void relationalopt() 
{

        int a, b;
        a=40;
        b=30;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );    
  
}
    
public static void main(String[] args) {
	Relational_Operators obj = new Relational_Operators ();
	obj.relationalopt();
	
}
	
}

/*
 This code demonstrates the use of relational operators in Java. Relational operators are used to compare values and determine the relationship between them. Here's a breakdown of the code:

The code defines a package called "Operators" to organize related classes.

Inside the package, there is a class called "Relational_Operators."

The class has a method named "relationalopt()" which performs the following operations:

a. Declares two integer variables, "a" and "b."

b. Assigns the values 40 and 30 to variables "a" and "b," respectively.

c. Prints the result of the comparison "a == b," which checks if "a" is equal to "b."

d. Prints the result of the comparison "a != b," which checks if "a" is not equal to "b."

e. Prints the result of the comparison "a > b," which checks if "a" is greater than "b."

f. Prints the result of the comparison "a < b," which checks if "a" is less than "b."

g. Prints the result of the comparison "b >= a," which checks if "b" is greater than or equal to "a."

h. Prints the result of the comparison "b <= a," which checks if "b" is less than or equal to "a."

The class also has a "main" method, which serves as the entry point of the program.

Inside the "main" method, an object of the "Relational_Operators" class is created.

The "relationalopt()" method is called on the created object to execute the code within it.

When you run this code, it will print the results of the relational operations performed on the variables "a" and "b." These results will be displayed on the console.
 */
