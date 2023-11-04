/*
 * Create a method which accepts an integer array, 
 * reverse the numbers in the array and returns the resulting array in sorted order
 */

package mylab.lab2;
import java.util.Arrays;

public class Exercise3 {
	
	public int[] getSorted(int[] arr) {
		
		int n=arr.length;
		int[] rev = new int[n];
		
		if (arr==null || n==0) {
			return new int[0];
		}
		else {
	
			//reverse array using length-1 which is last index and i values
			
		for (int i=0;i<n;i++) {
			
			rev[i] = arr[n-1-i];
			
		}
		return rev;
		}
	}
	public static void main(String args[]) {
		
		int arr[]= {13,11,98,34,45};
		
		Exercise3 E3 = new Exercise3();
		int[] resultarray = E3.getSorted(arr);
		Arrays.sort(resultarray);
		
		for(int a:resultarray) {
		System.out.println(a);
		}
		
	}
	}
