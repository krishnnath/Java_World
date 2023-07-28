package Operators;

public class Arithmetic_operators1 {

    int m = 6, n = 4;

    public void operators() {
        int r1 = m + n;
        int r2 = m - n;
        int r3 = m * n;
        double r4 = (double) m / n; // for point value

        int r5 = m % n; // for remainder

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        n = 10;
        ++n; // pre increment
        n++; // post increment

        System.out.println(n);
    }

    public static void main(String[] args) {
        Arithmetic_operators1 obj = new Arithmetic_operators1();
        obj.operators();
    }
}




/*
 Explanation:

The code begins with the declaration of the Arithmetic_operators1 class within the Operators package.

Inside the class, two integer variables m and n are declared and initialized to 6 and 4, respectively.

The operators() method is defined. This method performs various arithmetic operations using the values of m and n variables.

a. r1 stores the result of adding m and n.

b. r2 stores the result of subtracting n from m.

c. r3 stores the result of multiplying m and n.

d. r4 stores the result of dividing m by n, and (double) is used to cast the result to a double value for decimal precision.

e. r5 stores the remainder when m is divided by n using the modulo operator %.

f. The results are then printed using System.out.println().

Another integer variable n is declared and initialized to 10 inside the operators() method. This declaration shadows the class-level n variable.

The value of n is incremented twice: once using pre-increment (++n), which increments the value before using it, and once using post-increment (n++), which increments the value after using it.

The final value of n is printed.

In the main() method, an instance of the Arithmetic_operators1 class is created, and the operators() method is called on that instance.

When you run this code, it will perform the arithmetic operations defined in the operators() method and display the results on the console.
 */
