package mylab.lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Exercise4 {
	
	public static Map<String, String> getStudents(Map<String, Integer> hash){
		
		Map<String, String> obj = new HashMap<>();
		
		for (Map.Entry<String, Integer> n:hash.entrySet()) {
			
			String regNo = n.getKey();
			int marks = n.getValue();
			
			if (marks >= 90) {
                obj.put(regNo, "Gold");
            } if (marks >= 80 && marks < 90) {
                obj.put(regNo, "Silver");
            } if (marks >= 70 && marks < 80) {
                obj.put(regNo, "Bronze");
            }
        }

        return obj;
			
		}
	
	public static void main(String args[]) {
		
		Map<String, Integer> hash = new HashMap<>();
		hash.put("1234",90);
		hash.put("1345",70);
		hash.put("1344",70);
		
		Map<String, String> result = getStudents(hash);
		
		for (Map.Entry<String, String> n : result.entrySet()) {
			
			System.out.println((n.getKey()+" "+n.getValue()));
		}
		}
	}


