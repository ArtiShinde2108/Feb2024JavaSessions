package hashmapconcept;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsCount {

	public static void main(String[] args) {
		
		String input = "Java is Java best language is Java";
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		String words[] = input.split(" ");
		
		for(String e : words) {
			
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
