package java_world;

public class If_Esle_If_Statement {

	public static void main(String[] args) {
		// If else if Statement
		
		int marks = 65;
		
		if(marks<50) {
		System.out.println("fail");
		}
		else if(marks>50 && marks<60) {
			System.out.println("D grade");
		}
		else if(marks>75 && marks<75) {
			System.out.println("C grade");
		}
		else if(marks>=75 && marks<90) {
			System.out.println("B grade");
		}
		else if(marks>=90 && marks<100) {
			System.out.println("A+");
		}
		else {
			System.out.println("Invalid!");
		}

	}

}
