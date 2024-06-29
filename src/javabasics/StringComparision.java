package javabasics;

public class StringComparision {

	public boolean compareStrings(String str1, String str2) {

		if (str1.equals(str2)) {

			return true;

		} else {

			return false;
		}

	}

	public static void main(String[] args) {

		String S1 = "testing";
		String S2 = "testing";

		StringComparision S = new StringComparision();
		boolean result = S.compareStrings(S1, S2);

		System.out.println(" The result is " + result);

	}

}
