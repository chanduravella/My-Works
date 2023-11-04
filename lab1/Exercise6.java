
/*Create a class with a method to find the difference between the 
* sum of the squares and the square of the sum of the first n natural numbers*/

package mylab.lab1;
import java.util.Scanner;
public class Exercise6 {
	
	private int num;
	
	//Setter
	
	public void setNum(int num) {
		this.num=num;
	}
	
	//Getter
	
	public int getNum() {
		return num;
	}
	
	//Constructor
	
	public Exercise6(int num) {
		this.num=num;
	}
	
	// Method to calculate difference
	
	public void calculateDifference() {
		
		int sum=0; 
		int sqresum=0;
		
		for (int i=0;i<=num;i++) {
			
			sum=sum+i;
			sqresum=sqresum+(i*i);
		}
		
		int result = sqresum-sum;
		System.out.println("The sum of Squares is: "+sqresum);
		System.out.println("Square of the sum is: "+sum);
		System.out.println("The difference is: "+result);
		
	} //method
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int num=sc.nextInt();
		
		Exercise6 E6=new Exercise6(num);
		E6.calculateDifference();
		
	} //main

}//class
