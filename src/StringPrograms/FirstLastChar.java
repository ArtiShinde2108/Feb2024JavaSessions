package StringPrograms;

public class FirstLastChar {

	public static void main(String[] args) {

		String str = "Selenium";
		char fisrtchar = str.charAt(0);
		char lastchar = str.charAt(str.length() - 1);

		System.out.println("The first character is " + fisrtchar);
		System.out.println("The last character is " + lastchar);

	}

}
