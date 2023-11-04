/*Create a method to check if a number is a power of two or not*/


package mylab.lab1;
import java.util.Scanner;
public class Exercise8 {
	
	private int num;
	
	//setter
	
	public void setNum(int num) {
		this.num=num;
	}
	
	//getter
	
	public int getNum() {
		return num;
	}
	
	//method to check the number is power of 2 or not
	
	public boolean checkNumber() {
		
		for(int i=0;i<=getNum();i++) {
			
			if (num == (int)Math.pow(2, i)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		Exercise8 E8 = new Exercise8();
		E8.setNum(num);
		System.out.println(E8.checkNumber());
		
	}

}
