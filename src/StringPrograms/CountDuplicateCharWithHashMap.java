package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharWithHashMap {

	public static void main(String[] args) {
		
		String str = "america";
		Map<Character,Integer> map = new HashMap<Character ,Integer> ();
		char ch[] = str.toCharArray();
		
		for(Character c: ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				int val = map.get(c);
				map.put(c, val+1);
			}
		}
		System.out.println(map);
		

	}

}
