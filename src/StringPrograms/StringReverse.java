package StringPrograms;

public class StringReverse {
	
	
	public static String reverse(String S){
		
		if(S == null) {
			
			return S;
		}
		
		if(S.isBlank() || S.isEmpty()) {
			
			return S;
		}
		 
	    if (S.length() == 1){
	    	 return S;
	    }
		
	    String Rev = "";
	    
	    for(int i =S.length()-1 ; i>=0 ;i-- ) {
	    	
	    	Rev= Rev + S.charAt(i);
	    }
	    
		return Rev;
	}
	

	public static void main(String[] args) {
		
	System.out.println(reverse("t"));
	System.out.println(reverse("testing"));
	System.out.println(reverse(null));
	System.out.println(reverse(" t"));
	System.out.println(reverse(" "));
	System.out.println(reverse("testing atumation"));
	
	

	}

}
