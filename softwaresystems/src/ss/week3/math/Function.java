package ss.week3.math;

interface Function {
	
	public double function();
	
	public double apply();
		// applies the function to an argument of type double.
	
	public double derivative();
		// returns the Function object that is the derivative of the current function.
		
	
	public String toString();
		
		// returns a readable string representation of the function.
}
