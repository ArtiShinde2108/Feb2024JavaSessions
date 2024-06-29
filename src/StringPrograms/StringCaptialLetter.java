package StringPrograms;

public class StringCaptialLetter {

	public static void main(String[] args) {
		
		String s = "this is my java code" ;
		String str[] = s.split(" ");
		String st = "";
		
		for(String e : str) {
			
		st = st + e.replace(String.valueOf(e.charAt(0)), String.valueOf(e.charAt(0)).toUpperCase()) + " ";
			
		
		}
		           
		System.out.println(st);
		System.out.println("-----------------------------------");
		
		String rev = "";
	    String newstr []=st.split(" ");
	    
	    for(String e : newstr) {
	    	
	    rev = rev + StringReverse.reverse(e) + " ";
	    
	    }
	    System.out.println(rev);
	    

	}

}
