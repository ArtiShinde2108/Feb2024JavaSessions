package javapracticeprogram;

public class SpecialCharReplacement {

	public static void main(String[] args) {

		String s = "#$@%^ TestingJavaSelenium*&^%$";

		// regular expression = [^a-zA-Z0-9]

		s = s.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(s);
		System.out.println("----------------------------");

		String str = "The rains have started here selenium suite";

		System.out.println(str.length());
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', str.indexOf('s') + 1));
		System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s' + 1) + 1)));
		System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s' + 1) + 1) + 1));

		System.out.println("----------------------------");

		String str1 = "  Hello World  ";
		System.out.println(str1.trim());
		System.out.println(str1.replace(" ", ""));

		String str2 = " 03/21/2024";
		System.out.println(str2.replace('/', '-'));

		System.out.println("----------------------------");

		String test = "Hello_World_Test_Selenium";
		String Arr[] = test.split("_");

		for (String element : Arr) {

			System.out.println(element);
		}

	}

}
