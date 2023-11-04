
//Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with radio buttons. 
//On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .
//Initially there is no message shown.

package mylab.lab1;
import java.util.Scanner;
public class Exercise2 {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Choose a Colour: ");
		System.out.println("1. RED");
		System.out.println("2. YELLOW");
		System.out.println("3. GREEN");
		
		int a=sc.nextInt();
		
		switch (a) 
		{
		case 1:
			System.out.println("STOP - Red Signal please wait..");
			break;
		case 2:
			System.out.println("READY - Yellow Signal start your engine");
			break;
		case 3:
			System.out.println("GO - Green Signal you can go");
			break;
		default:
			System.out.println("Invalid colour, Please choose a valid colour");
			
			
		}
	}
	

}
