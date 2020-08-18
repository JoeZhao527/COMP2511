package part2Q1;

public class SalesPerson extends Employee {

	private float commission;
	/*
	public SalesPerson(String title, String firstName, String lastName, int quota) {
		super(title, firstName, lastName, quota);
	}
	*/
	public SalesPerson(String title, String name, int quota) {
		super(title, name, quota);
	}

	public double calculateSalary() {
		// duplicate code. inline the temporary variable
		/* previous code 
		double totalSal;
		totalSal = super.getBaseSalary() + commission * super.getSalesAchieved()
		         + super.calculateParkingFringeBenefits()
		         - super.calculateTax();
		return totalSal;
		*/
		return super.getBaseSalary() + commission * super.getSalesAchieved()
			+ super.calculateParkingFringeBenefits()
			- super.calculateTax();
	}

}
