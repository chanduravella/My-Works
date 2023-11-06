/*Create a method which accepts an array of integer elements 
 * and return the second smallest element in the array
*/

package mylab.lab6;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {
	
	public int getSecondSmallest(int arr[]) {
		
		//create an array list and store array elements in the list
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int n:arr) {
			list.add(n);
		}
		
		//sort using collections
		
		Collections.sort(list);
		
		//after sorting second smallest num will be at index 1
		
		return list.get(1);
	}
	public static void main(String args[]) {
		
		int arr[] = {4,2,9,33,45,21,7};
		
		Exercise5 E5 = new Exercise5();
		System.out.println("Second Smallest element in the given array is: ");
		System.out.println(E5.getSecondSmallest(arr));
	}

}
