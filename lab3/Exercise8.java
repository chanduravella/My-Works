/*Create a method that accepts a String and checks if it is a positive string. 
 * A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. 
 * For Example: ANT is a positive String (Since T comes after N and N comes after A). The method should return true if the entered string is positive.
 * */

package mylab.lab3;
import java.util.Scanner;

public class Exercise8 {
	
	//method to check whether the given string is positive or not.
	public boolean check(String str) {
		
		str.toLowerCase();
		int n = str.length();
		
		for (int i=0;i<n;i++) {
			
			// logic: check the current character with the next character.
			
			if (str.charAt(i)>str.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check: ");
		String str = sc.next();
		Exercise8 E8 = new Exercise8();
		System.out.println(E8.check(str));
	}

}
