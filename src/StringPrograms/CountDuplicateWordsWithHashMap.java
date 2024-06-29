package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWordsWithHashMap {

	public static void main(String[] args) {
		
		String str = "java is java language java is the best";
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		String arr[] = str.split(" ");
		
		for(String e :arr) {
			
			if(!map.containsKey(e)) {
				map.put(e, 1);
			}
			else {
				int val = map.get(e);
				map.put(e, val+1);
			}
			
		}
		
        System.out.println(map);
	}

}
