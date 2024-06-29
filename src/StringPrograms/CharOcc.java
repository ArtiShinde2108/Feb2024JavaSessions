package StringPrograms;

public class CharOcc {

	public static void main(String args[]) {

		String str = "Welcome to Naveen Automation lab";

		System.out.println(str.indexOf('e')); // first occurrence of e
		System.out.println(str.indexOf('e', str.indexOf('e') + 1)); // second occurrence of e
		System.out.println(str.indexOf('e', str.indexOf('e', str.indexOf('e') + 1) + 1)); // third occurrence of e

		System.out.println("----------------------------------------");

		String str1 = "Welcome to the word of technology";
		String st = str1.replaceAll("\\s", "");

		System.out.println(st);

	}

}
