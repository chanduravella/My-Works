/*Create a method to check if a number is an increasing number
* A number is said to be an increasing number if no digit is exceeded by the digit to its left. 
*For Example : 134468 is an increasing number 
*/


package mylab.lab1;
import java.util.Scanner;
public class Exercise7 {
	
	private int num;
	
	//Setter
	
	public void setNum(int num) {
		this.num=num;
	}
	
	//getter
	
	public int getNum() {
		return num;
	}
	
	// Method to check increasing number
	
	public boolean checkNumber() {
		
		String str= Integer.toString(num);
		for (int i=0;i<str.length()-1;i++) {
			
		int currentnum = Character.getNumericValue(str.charAt(i));
		int nextnum = Character.getNumericValue(str.charAt(i+1));
		
		if (currentnum > nextnum) {
			
			return false;
		}
		
		} //for loop
		return true;
		
	} //method
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		Exercise7 E7 = new Exercise7();
		E7.setNum(num);
		System.out.println(E7.checkNumber());
	}//main

} //class
