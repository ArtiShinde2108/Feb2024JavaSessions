package aaraylistconcept;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
	

	public static void main(String[] args) {
		
		String str = "selenium";
		
		Set <Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			
			set.add(str.charAt(i));
		}
		
		for(Character ch : set) {
			
			System.out.println(ch);
		}

	}

}
