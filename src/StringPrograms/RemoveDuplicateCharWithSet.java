package StringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharWithSet {

	public static void main(String[] args) {
		
		String str = "testing";
		
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0 ; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		 for(Character ch:set) {
			 System.out.println(ch);
		 }

	}

}
