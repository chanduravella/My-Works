package mylab.lab7;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {
	
	public int getSecondSmallest(int arr[]) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int n:arr) {
			list.add(n);
		}
		Collections.sort(list);
		
		return list.get(1);
	}
	public static void main(String args[]) {
		
		int arr[] = {4,2,9,33,45,21,7};
		
		Exercise5 E5 = new Exercise5();
		System.out.println("Second Smallest element in the given array is: ");
		System.out.println(E5.getSecondSmallest(arr));
	}

}
