package mylab.lab5.Exercise1;

public class Person {
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, int age)throws InvalidAgeException{
		
		this.name = name;
		if (age <=15) {
			
			throw new InvalidAgeException("Age must be above 15");
		}
		this.age = age;
		
	}

}
