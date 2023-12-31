package mylab.lab5.Exercise3;

public class Employee {
	
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(int salary) throws EmployeeException{
		if (salary < 3000) {
			throw new EmployeeException("Salary should be above 3000");
		}
		this.salary = salary;
	}

}
