package mylab.lab5.Exercise2;

public class Exercise2 {
	
	public static void main(String args[]) throws InvalidNameException {
		
		try {
		Employee employee = new Employee(null,null);
		
		
			System.out.println("Employee name:"+employee.getFname()+employee.getLname());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
