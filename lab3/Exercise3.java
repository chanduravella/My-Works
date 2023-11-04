/*Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. */

package mylab.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	
	public String alterString(String str) {
		
		char[] ch = str.toCharArray();
		
		
		String vowels = "aeiouAEIOU";
		
		for (int i=0;i<ch.length;i++) {
			
			char c = ch[i];
			
			// if the char is not in the vowels then the String return -1
			
			if (vowels.indexOf(c) ==-1 ) {
				
				ch[i]= (char) (c+1);
				
			}
			
			
		}
		return new String(ch);
		
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		Exercise3 E3 = new Exercise3();
		System.out.println("Result String: "+E3.alterString(str));
	}

}
