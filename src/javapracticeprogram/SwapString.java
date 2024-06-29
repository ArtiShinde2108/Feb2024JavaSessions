package javapracticeprogram;

public class SwapString {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World";
		
		//append a and b
		a = a + b; //HelloWorld
		
		//store initial value of a in b
		b = a.substring(0, a.length() - b.length()); //Hello
		
		//store initial value of b in a
		a = a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);

	}

}
