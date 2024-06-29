package StringPrograms;

public class removeDuplicateCharacters {

	public static void main(String[] args) {
		
		String str = "testing";
		
		removeDuplicateChar(str);
		System.out.println("The original string :" + str);
		System.out.println("The new string :" + removeDuplicateChar(str));
		

	}
	
	public static String removeDuplicateChar(String str) {
		
		String newStr = "";
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(newStr.indexOf(c)==-1) {
				newStr = newStr + c;
				
			}
			
		}
		
		return newStr;
		
	}

}
