interface Employee {
	
	double calculateSalary();
	}

class FixedSalaryEmployee implements Employee {

	private double salary;

	public FixedSalaryEmployee(double salary) {
		this.salary = salary;
	}

	public double calculateSalary() {
		return this.salary;
	}
}

class HourlySalaryEmployee implements Employee {

	private double hours;
	private double hourlyPay;

	public HourlySalaryEmployee(double hours, double hourlyPay) {
		this.hours = hours;
		this.hourlyPay = hourlyPay;
	}

	public double calculateSalary() {
		return this.hourlyPay * this.hours;
	}
}

class FiveForTheProduct implements Employee {

	private double howManyProducts;

	public FiveForTheProduct(double howManyProducts) {
		this.howManyProducts = howManyProducts;
	}

	public double calculateSalary() {
		return this.howManyProducts * 5;
	}
}

class SalaryEmployeeWithBonus implements Employee {
	private double salary;

	public SalaryEmployeeWithBonus(double salary) {
		this.salary = salary + (salary * 0.2);
	}

	public double calculateSalary() {
		return this.salary;
	}
}
// Payout
abstract class SalaryPayout {

	private Employee employee;

	public SalaryPayout(Employee employee) {
		this.employee = employee;
	}

	protected abstract void payout();

	public void processPayout() {
		System.out.println("Creating payout for: " + this.employee.calculateSalary() +
		" PLN");
	this.payout();
		System.out.println("Payout has been completed!");
	}
}

class SalaryPayoutProcessor extends SalaryPayout {

	public SalaryPayoutProcessor(Employee employee) {
		super(employee);
	}

	protected void payout() {
		System.out.println("Sending money to employee");
	}
}
class Application {

	public static void main(String args[]) {

		FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
		HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);
		FiveForTheProduct employee2 = new FiveForTheProduct(1000);
		SalaryEmployeeWithBonus employee3 = new SalaryEmployeeWithBonus(2000);

		SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee3);
		processor.processPayout();
	}
}