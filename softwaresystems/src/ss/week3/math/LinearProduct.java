package ss.week3.math;

public class LinearProduct extends Product {
	Constant func1;
	
	
	public LinearProduct(Constant constant, Function function) {
		super(constant, function);
		this.func1 = constant;
	}
	
	@Override
	public Integrable derivative() {
		return new LinearProduct(func1, func2.derivative());

	}
	
	@Override
	public Integrable integral() {
		return null;
	}
}