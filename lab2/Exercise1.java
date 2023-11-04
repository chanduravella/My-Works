/*Create a method which accepts an array of integer elements 
 * and return the second smallest element in the array
*/
package mylab.lab2;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise1 {
	
	static int i;
	public int getSecondSmallest(int[] arr) {
		
		//sort the elements and return the second smallest value 
		
		Arrays.sort(arr);
		return arr[1];
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Second Smallest Element in the given array is: ");
		
		int[] arr= {12,23,45,34,44};
		Exercise1 E1 = new Exercise1();
		
		System.out.println(E1.getSecondSmallest(arr));
		
	}

}
