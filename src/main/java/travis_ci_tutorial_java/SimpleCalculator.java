package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mult(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
	    try {
	        return a/b;
	    } catch(ArithmeticException e) {
	        System.out.println("Error: Attempted division by zero.");
	        return 0; 
	    }
	}
}
