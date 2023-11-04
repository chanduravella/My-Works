// prime Number up to the given number

package mylab.lab1;
import java.util.Scanner;
public class Exercise4 {
	
	public static int n,i;
	
	public static void prime(int n) {
		
		if (n==0 || n==1) {
			System.out.println("No Prime numbers in the given range");
		}
		else {
			
			for (i=2;i<=n;i++) {
				
				int j;
				for(j=2;j<i;j++) {
					
					if (i%j==0) {
						break;
					}
				}
				if (i==j) {
					
					System.out.println(i);
				}
				
			}

		}
	}
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int n = sc.nextInt();
		Exercise4.prime(n);
	}

}
