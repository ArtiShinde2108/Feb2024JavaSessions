package StringPrograms;

public class SecondHalfOfString {

	public static void main(String[] args) {

		String str = "HelloWorld";
		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length() / 2; i++) {
			System.out.print(ch[i]);
		}

		System.out.print("\n");

		for (int j = str.length() / 2; j < str.length(); j++) {

			System.out.print(ch[j]);
		}

	}

}
