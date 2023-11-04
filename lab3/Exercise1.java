/*Write a Java program that reads a line of integers 
 * and then displays each integer and the sum of all integers*/


package mylab.lab3;

import java.util.Scanner;

public class Exercise1 {
	
	public int getNum(String str) {
		
		int num=Integer.parseInt(str);
		
		int sum=0;
		while (num>0) {
			
			int i=num%10;
			sum=sum+i;
			num=num/10;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		
		Exercise1 E1= new Exercise1();
		System.out.println("The Sum is: "+E1.getNum(str));
		
	}
	

}
