/*Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap*/

package mylab.lab6;

import java.util.HashMap;

public class Exercise3 {
	
	public HashMap<Integer,Integer> getSquares(int[] arr){
		
		HashMap<Integer,Integer> hash = new HashMap<>();
		
		for (int n:arr) {
			int square = n*n;
			hash.put(n,square);
		}
		return hash;
		
	} 
	public static void main(String args[]) {
		
		int arr[] = {1,4,5,6,7,8,2,3};
		Exercise3 E3 = new Exercise3();
		
		System.out.println(E3.getSquares(arr));
	}

}
