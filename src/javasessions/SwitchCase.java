package javasessions;

public class SwitchCase {

	public static void main(String[] args) {

		/*
		 * char ch = 'u';
		 *
		 * switch (ch) { case 'a': case 'e': case 'i': case 'o': case 'u':
		 *
		 * System.out.println(ch + " is vowel"); break;
		 *
		 * default:
		 *
		 * System.out.println(ch + " is consonent"); }
		 *
		 */

		/*
		 * String Env = "PreProd";
		 *
		 * switch (Env) {
		 *
		 * case "QA" :
		 *
		 * System.out.println("Start running QA Env test cases"); break;
		 *
		 * case "UAT" :
		 *
		 * System.out.println("Start running UAT Env test cases"); break;
		 *
		 * case "Dev" :
		 *
		 * System.out.println("Start running Dev Env test cases"); break;
		 *
		 * case "Stage" :
		 *
		 * System.out.println("Start running Stage Env test cases"); break;
		 *
		 * case "Prod" :
		 *
		 * System.out.println("Start running Prod Env test cases"); break;
		 *
		 *
		 * default:
		 *
		 * System.out.println("Please pass the right Env"); break; }
		 *
		 */

		int x = 0;
		int y = 10;
		if (x > 0 && y > 0 && x < y && x * 2 < y) {
			System.out.println("Hi");
		}

		if (x > 0 & y > 0 & x < y & x * 2 < y) {
			System.out.println("Hello");
		}

	}

}
