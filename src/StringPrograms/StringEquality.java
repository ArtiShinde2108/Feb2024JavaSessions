package StringPrograms;

public class StringEquality {

	public boolean StringCompare(String s1, String s2) {

		if (s1 == null && s2 == null) {

			return true;
		} else if (s1 == null || s2 == null) {

			return false;
		}

		return s1.equalsIgnoreCase(s2);
	}

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "hello";

		StringEquality s = new StringEquality();

		s.StringCompare(str1, str2);
		boolean result = s.StringCompare(str1, str2);

		System.out.println("The final comparsion of string is " + result);

	}

}
