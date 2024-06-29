package hashmapconcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class HashSetConcept {
	

	public static void main(String[] args) {
		
		Set <String> set = new HashSet<String>();
		
		set.add("Chrome");
		set.add("Firefox");
		set.add("IE");
		set.add("Opera");
		set.add("Safari");
		
		System.out.println(set);
		
		System.out.println("-------------------");
		
		for(String e : set) {
			
			System.out.println(e);
		}
		
		System.out.println("-------------------");
		
	    Iterator<String> it	= set.iterator();
	    while(it.hasNext()) {
	    	
	    	String br= it.next();
	    	System.out.println(br);
	    	
	    }
	    System.out.println("----------------------------");
	    
	    //convert set to list
	    
	    List <String> browserList = new ArrayList<String> (set);
	    String b1 = browserList.get(0);
	    System.out.println(b1);
	    System.out.println(browserList);
	    
	    System.out.println("----------------------------");
	    
	  Iterator<String> it1 = browserList.iterator();
	    while(it1.hasNext()) {
	    	
	    String br =it1.next();
	    System.out.println(br);
	    
	    }
	  

	}

}
