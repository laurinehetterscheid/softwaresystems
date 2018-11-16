package ss.week1;

public class Employee {
	private int hours;
	private double rate;
	private double overtimerate = 1.5 * rate;
	
	
	public Employee(int workHours, double hourRate) {
		hours = workHours;
		rate = hourRate;
	}
	
	public double pay () {
		double pay;
		double overtimepay = 0;
		double standardpay;
		
		if (hours > 40) {
			overtimepay = overtimerate * (hours - 40);	
		}
		if (hours > 40) {
			standardpay = 40 * rate;
		}
		else {
			standardpay = hours * rate;
		}
		
		pay = overtimepay + standardpay;
		return pay;
	}

}
