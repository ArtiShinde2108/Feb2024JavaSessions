package StringPrograms;

public class ReverseNamePr {

	public static String ReverseName(String str) {

		char ch[] = str.toCharArray();
		String rev = "";

		for (int i = ch.length - 1; i >= 0; i--) {

			rev = rev + ch[i];
		}
		return rev;
	}

	public static void main(String[] args) {

		String Rev = ReverseName("Arti");

		System.out.println("The rev string is " + Rev);

		StringBuffer sf = new StringBuffer("JAVA");
		System.out.println(sf.reverse());

	}

}
