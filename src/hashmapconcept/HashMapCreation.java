package hashmapconcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapCreation {
	
	

	public static void main(String[] args) {
		
		
		Map<String, String> empData = new HashMap<String,String>();
	//	Map<String, String> empData = new LinkedHashMap<String,String>();
	//	Map<String, String> empData = new TreeMap<String,String>();
		
		empData.put("Arti", "HR");
		empData.put("Ravi", "Admin");
		empData.put("Sarthak", "CEO");
		empData.put("Sachin", "Manager");
		empData.put("aakash", "Fresher");
		
		System.out.println(empData);
		for (Map.Entry<String, String> entry : empData.entrySet()) {
			
			System.out.println(entry.getKey() + ":" + entry.getValue());
			System.out.println("----------------");
			
			//using lambda
			empData.forEach((k,v) -> System.out.println(k +":" + v));
		}
		

	}

}
