/*Create a method which accepts a hash map and return the values of the map in sorted order as a List.*/

package mylab.lab6;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise1 {
	
	public static List<Integer> getSortedValues(HashMap<String, Integer> hash){
		
		List<Integer> list = hash.values()
				.stream()
                .sorted()
                .collect(Collectors.toList());
		return list;
		
	}
	public static void main(String args[]) {
		
		HashMap<String, Integer> hash = new HashMap<>();
		hash.put("Chandu",1);
		hash.put("ravella", 5);
		hash.put("rahul", 2);
		hash.put("Venky", 12);
		hash.put("charan", 3);
		hash.put("shiva", 7);
		
		List<Integer> list = getSortedValues(hash);
		
		System.out.println("Original values: "+hash);
		System.out.println("Sorted Values: "+list);
		
	}

}
