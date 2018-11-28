package ss.week3.math;

public class Constant implements Integrable{
	private double value;
	
	public static void main(String[] args) {
		Print.print(new Constant(2.0));
	}
	
	public Constant(double x) {
		this.value = x;
	}
	
	@Override
	public double apply(double x) {
		return value;
		
	}
	
	@Override
	public Constant derivative() {
		return	new Constant(0);
	}
	
	@Override
	public Integrable integral() {
 		return new Product(new Constant(this.value), new Identity());
 	}
	
	public String toString() {
		return Double.toString(value);
	}


}
