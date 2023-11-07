/*Create a method that can accept an array of String objects 
 * and sort in alphabetical order. The elements in the left half should be completely in uppercase 
 * and the elements in the right half should be completely in lower case. Return the resulting array.
 */

package mylab.lab2;
import java.util.Arrays;
public class Exercise2 {
	
	public String[] sortStrings(String[] arr) {
		
		// sort array and find length
		
		Arrays.sort(arr);
		int n=arr.length;
		
		int half = (n+1)/2;
		
		if (arr== null || n==0 ) {
			return new String[0];
		}else
		{
			for (int i=0;i<n;i++) {
				if (i<half) {
					arr[i]=arr[i].toUpperCase();
				}
				else {
					arr[i]=arr[i].toLowerCase();
				}
			}
			
		}
		return arr;
	}
	public static void main(String args[]) {
		
		String[] arr = {"chandu","venky","charan","shiva","rahul","paramesh"};
		
		Exercise2 E2 = new Exercise2();
		String[] res = E2.sortStrings(arr);
		
		System.out.println(Arrays.toString(res));
	}

}
