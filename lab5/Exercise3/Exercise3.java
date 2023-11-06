package mylab.lab5.Exercise3;
import java.util.Scanner;
public class Exercise3 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary: ");
		int salary = sc.nextInt();
		try {
		Employee employee = new Employee(salary);
		System.out.println("Employee salary is: "+employee.getSalary());
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
