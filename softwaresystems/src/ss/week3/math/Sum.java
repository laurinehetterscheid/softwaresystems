package ss.week3.math;

public class Sum implements Integrable{
	private Integrable func1;
	private Integrable func2;

	public Sum(Function function1, Function function2) {
	}
	
	public static void main(String[] args) {
		Print.print(new Sum(new Constant(2.0), new Identity()));
	}
	
	@Override
	public double apply(double x) {
		return this.func1.apply(x) + this.func2.apply(x);
	}
	
	@Override
 	public Integrable derivative() {
 		return new Sum(this.func1.derivative(), this.func2.derivative());
 	}
 
 	@Override
 	public Integrable integral () {
 		return null;
 	}
	
	public String toString() {
		return this.func1.toString() + "+" + this.func2.toString();
	}
}


