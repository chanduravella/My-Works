/*Create a method that accepts a character array and count the number of times each character is present in the array*/

package mylab.lab6;

import java.util.HashMap;

public class Exercise2 {
	
	public void countChars(char[] arr) {
		
		HashMap<Character,Integer> hash = new HashMap<>();
		
		//if hash contains key count will be incremented
		
		for (char c:arr) {
			if (hash.containsKey(c)) {
				hash.put(c, hash.get(c)+1);
			}
			else {
				hash.put(c, 1);
			}
		}
		
		for (char c:hash.keySet()) {
			
			System.out.println("Character: "+c+" Count: "+hash.get(c));
			
		}
	}
	public static void main(String args[]) {
		
		char []arr = {'a','a','c','b','c','b','d','e'};
		
		Exercise2 E2 = new Exercise2();
		
		E2.countChars(arr);
	}

}
