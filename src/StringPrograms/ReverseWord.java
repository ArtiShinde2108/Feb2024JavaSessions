package StringPrograms;

public class ReverseWord {
	
	public static void main(String args[]) {
	
	String s = "This is my Java Code";
	String Rev = "";
	
	String str[]  = s.split(" ");
	for(String e : str) {
		
		Rev= Rev+ StringReverse.reverse(e)+ " ";
	}
	
    System.out.println(Rev);
    
    
   
}
}