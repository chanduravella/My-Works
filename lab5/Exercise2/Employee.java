package mylab.lab5.Exercise2;

public class Employee {
	
	private String fname;
	private String lname;

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Employee(String fname, String lname) throws InvalidNameException {
		if (fname == null && lname == null) {
			throw new InvalidNameException("Enter a valid name");
		}
		this.fname = fname;
		this.lname = lname;
	}
	

}
