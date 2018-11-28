package ss.week3.math;

public interface Function {
		
	public double apply(double x);
		// applies the function to an argument of type double.
	
	public Function derivative();
		// returns the Function object that is the derivative of the current function.
		
	
	public String toString();
		// returns a readable string representation of the function.
}
