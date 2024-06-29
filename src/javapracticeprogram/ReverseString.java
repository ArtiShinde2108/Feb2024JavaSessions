package javapracticeprogram;

public class ReverseString {

	public static void main(String[] args) {

		String s = "selenium";
		int len = s.length();

		String Rev = " ";

		for (int i = len - 1; i >= 0; i--) {

			Rev = Rev + s.charAt(i);

		}
		System.out.println(Rev);

		String str = "testing";

		StringBuffer sf = new StringBuffer(str);

		System.out.println(sf.reverse());
	}

}
