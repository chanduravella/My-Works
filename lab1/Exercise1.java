
//Create a method to find the sum of the cubes of the digits of an n digit number

package mylab.lab1;
import java.util.Scanner;
public class Exercise1 {
	
	public int n;
	
	
	public Exercise1(int n) {

		this.n = n;
	}
	public void calculateSum() {
		
		int sum=0;
		while (n>0) {
			
			int i=n%10;
			sum=sum+(i*i*i);
			n=n/10;
		}
		System.out.println(sum);
	}
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		Exercise1 E1=new Exercise1(n);
		E1.calculateSum();
	}

}
