package part2Q1;

public class Employee {
	private String title;
	// first name and last name can be combined to one variable String name

	/* previous code
	private String firstName;
	private String lastName;
	*/
	private String name;
	private double salesTarget;
	private double salesAchieved;
	private double baseSalary;

	public Employee (String title, String name, int quota) {
		this.title = title;
		/* previous code
		this.firstName = firstName;
		this.lastName = lastName;
		*/
		this.name = name;
		this.salesTarget = quota;
	}
	/* previous code
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	*/

	public String getName() {
		return this.name;
	}

	public double getSalesTarget() {
		return salesTarget;
	}

	public String getTitle() {
		return title;
	}

	public double getSalesAchieved() {
		return salesAchieved;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double calculateTax() {
		double tax = 0;
		double salary = baseSalary;
		if (salary > 50000) {
		    tax += 0.3*(salary - 50000);
		}
		if (salary > 30000) {
		    tax += 0.2*(salary - 30000);
		}
		return tax;
	}

	public double calculateParkingFringeBenefits() {
		return (baseSalary - 50000) / 10000;
	}

	public String getSalesSummary() {
		return getName() + "Sales Target: " + getSalesTarget() + "$\n" +
				"Sales to date: " + getSalesAchieved() + "$";
	}
}
