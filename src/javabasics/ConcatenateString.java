package javabasics;

public class ConcatenateString {

	public String concatenateStrings(String[] myStr) {

		String finalStr = " ";

		for (String e : myStr) {

			finalStr = finalStr + e;
		}

		return finalStr;

	}

	public static void main(String[] args) {

		ConcatenateString c1 = new ConcatenateString();

		String Str[] = { "Selenium", "Java", "TESTNG", "Maven" };
		String finalStr = c1.concatenateStrings(Str);
		System.out.println("The concatenated String is " + finalStr);

	}

}
