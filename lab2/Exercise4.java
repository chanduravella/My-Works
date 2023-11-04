/*
 * Create a method which accepts an integer array and removes all the duplicates in the array. 
 * Return the resulting array in descending order
 */

package mylab.lab2;

import java.util.Arrays;

public class Exercise4 {
	
	public int[] modifyArray(int[] arr) {
		
		Arrays.sort(arr);
		int n=arr.length;
		int arr1[] = new int[n];
		int index = 0;
		
		// check every element in array with next element to identify duplicates
		
		for(int i=0;i<n-1;i++) {
			
			if (arr[i]!=arr[i+1]) {
				
				arr1[index]=arr[i];
				index++;
				
			}
		}
		
		/*assign last element since there no next element to compare
		 increase index by 1 to access nth element */
		
			arr1[index]=arr[n-1];
			index++;
			
			int result[]=new int[index];
			
			for(int i=0;i<index;i++) {
				
				result[i]=arr1[i];
			}
	
		return result;
		
	}
	public static void main(String args[]) {
		
		int arr[]= {1,1,2,3,4,5,4};
		Exercise4 E4 = new Exercise4();
	
		int modifiedarr[] = E4.modifyArray(arr);
		
		//create a temp array to store values of modified array in descending order
		
		int temp[]=new int[modifiedarr.length];
		for (int i=0;i<modifiedarr.length;i++) {
			
			temp[i]=modifiedarr[modifiedarr.length-1-i];
			
		}
		
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println("Array after removing duplicates:"+Arrays.toString(temp));
		
		
		
		
	}

}
