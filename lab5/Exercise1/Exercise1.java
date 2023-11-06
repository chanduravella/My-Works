package mylab.lab5.Exercise1;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		try {
		Person person = new Person(name,age);
		System.out.println("Name: "+person.getName()+"\n"+"Age: "+person.getAge());
		}
		catch(Exception e){
			
			System.out.println("Error: "+e.getMessage());
		}
	}

}
