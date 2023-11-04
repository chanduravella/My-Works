
//Nth number of fibonacci series

package mylab.lab1;
import java.util.Scanner;
public class Exercise3 {
	
	public static int n;
	
	// Using Recursive Function
	
	public static int recursiveFunction(int n) {
		
		if (n<=1) {
			return n;
		}
		else {
			return recursiveFunction(n-1)+recursiveFunction(n-2);
		}
	}
	
	//using non-recursive function
	
	public static int nonRecursiveFunction(int n) {
		
		
		if (n<=1) {
			return n;
		}
		
		
		int num1=0;
		int num2=1;
		int result = 0;
		
		for (int i=2;i<=n;i++) {
			
			result= num1+num2;
			num1=num2;
			num2=result;
		}
		return result;
		
	}
	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		System.out.println("Nth number in the series using recursive function: ");
		System.out.println(Exercise3.recursiveFunction(n));
		System.out.println("Nth number in the series using non-recursive function: ");
		System.out.println(Exercise3.nonRecursiveFunction(n));
	}

}
