/*Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. 
 * The digit in the units place can be left as it is. 
Note: Take the absolute value of the difference.
*/

package mylab.lab3;

import java.util.Scanner;
import java.lang.Math;

public class Exercise4 {
	
	public int modifyNumber(int num) {
		
		//convert integer to string to compare each digit
		
		String str = String.valueOf(num);
		int n= str.length();
		StringBuffer sb = new StringBuffer();
		for (int i=0;i<n-1;i++) {
			int digit1 = Character.getNumericValue(str.charAt(i+1));
			int digit2 = Character.getNumericValue(str.charAt(i));
			
			//compare current digit with next digit and also check the greater number to avoid negative value(results exception).
			
			int diff = digit1>digit2?digit1-digit2:digit2-digit1;
			sb.append(diff);
		}
		
		//print last digit as it is since it doesn't have next digit to compare with.
		
		sb.append(str.charAt(n-1));
		int result = Integer.parseInt(sb.toString());
		return result;
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		Exercise4 E4 = new Exercise4();
		System.out.println("The new number is: "+E4.modifyNumber(num));
}
}
