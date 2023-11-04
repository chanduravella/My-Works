
/*Create a class with a method which can calculate the sum of first n natural numbers 
 * which are divisible by 3 or 5.
 */

package mylab.lab1;
import java.util.Scanner;
public class Exercise5 {
	
	public static int num,i,sum=0;
	
	// Calculate the sum
	
	static void CalculateSum(int n) {
		
		//expression
		for (i=1;i<=n;i++) {
			if (i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}		
		System.out.println("The sum of "+n+" natural numbers is: "+sum);
		
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth number: ");
		int num=sc.nextInt();
		Exercise5.CalculateSum(num);
	}

}
