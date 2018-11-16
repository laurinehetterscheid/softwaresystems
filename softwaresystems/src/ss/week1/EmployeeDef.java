package ss.week1;

public class EmployeeDef {

	public static void main(String[] args) {
		Employee colleague = new Employee(30, 20);
		Employee colleague2 = new Employee(3, 2);
		Employee colleague3 = new Employee(60, 10.8);
		
		System.out.println("Salary colleague: " + colleague.pay());
		System.out.println("Salary colleague2: " + colleague2.pay());
		System.out.println("Salary colleague3: " + colleague3.pay());
	}

}
