package StringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateNumFromArray {

	public static void main(String[] args) {
		
		//using linkedHashSet
		ArrayList<Integer> numlist = new ArrayList<Integer>(Arrays.asList(10,12,27,12,30,30,60,65,65,80,80));
		
		
		Set<Integer> set = new LinkedHashSet<Integer>(numlist);
		ArrayList<Integer> uniqueList = new ArrayList<Integer>(set);
		System.out.println(uniqueList);
		
		//using streams
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(10,10,20,30,30,40,50,60,60,70,80,80));
        List<Integer> List = marksList.stream().distinct().collect(Collectors.toList());
        System.out.println(List);
	}

}
