// use to extends keyword

package Polymorphism;

public class MOR_Car  extends MOR_Vehicle
{
 public void speed(int a) 
 {
	 System.out.println("It's Override method");
 }
 
 public static void main(String[] args) 
 {
	 MOR_Car obj = new MOR_Car();
	 obj.speed(11);
}
}
