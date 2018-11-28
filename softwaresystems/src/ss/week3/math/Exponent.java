package ss.week3.math;

public class Exponent implements Integrable {
	private int power;
	
	/* @ensure n <= 0;
	 * 
	 */
	public Exponent(int n) {
		this.power = n;
	}
	
	public static void main(String[] args) {
		Print.print(new Exponent(4));
		
	}
	
	public double apply(double x) {
		return Math.pow(x, this.power);
		
	}
	
	public Integrable derivative() {
		return new LinearProduct(new Constant(power),new Exponent(power - 1));

	}
	
	public Integrable integral() {
		return new Product(new Constant(1/(power+1)), new Exponent(power+1));
	}
	
	public String toString() {
		return "x^" + this.power;
	}
}


