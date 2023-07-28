package static_variable;

// Static variable does not make by local variable, because the static only access to class variable . It is not to object memory.


public class Static_Variable 
{
 int id = 10;
 
 public void localvariable() {
	 int id = 20;
	 System.out.println(id);
	
 }
 public static void saticsvarible() {
	 System.out.println("it is a static method");
 }
 public static void main(String[] args) {
	 Static_Variable obj = new Static_Variable ();
	 
	 obj.localvariable();
	 obj.saticsvarible();
}
}
