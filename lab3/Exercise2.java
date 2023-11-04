/*
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol 
 */

package mylab.lab3;

import java.util.Scanner;

public class Exercise2 {
	
	private String str;
	
	public void setStr(String str) {
		this.str=str;
	}
	public String getStr() {
		return str;
	}
	public Exercise2(String str) {
		this.str=str;
	}
	public String getImage() {
		
		//Logic: reverse the string using string buffer class to get mirror image
		
		StringBuffer sb=new StringBuffer(str);
		
		String result = str+"|"+sb.reverse();
		return result;
		

	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to get image: ");
		String str=sc.next();
		Exercise2 E2=new Exercise2(str);
		System.out.println(E2.getImage());
		
	}

}
