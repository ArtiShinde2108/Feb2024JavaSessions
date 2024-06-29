package javapracticeprogram;

public class SwapStrings {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";

		System.out.println("Before Swapping the value of s1 and s2");
		System.out.println(" the value of s1 is " + s1);
		System.out.println(" the value of s2 is " + s2);

		System.out.println("--------------------------------------");

		// Append S1 and S2
		s1 = s1 + s2;

		// Store initial value of s1 into s2
		s2 = s1.substring(0, s1.length() - s2.length());

		// Store initial value of s2 into s1
		s1 = s1.substring(s2.length());

		System.out.println("After Swapping the value of s1 and s2");
		System.out.println(" the value of s1 is " + s1);
		System.out.println(" the value of s2 is " + s2);

	}

}
