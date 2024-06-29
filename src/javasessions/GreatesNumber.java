package javasessions;

public class GreatesNumber {

	public static void main(String[] args) {

		int a = 600;
		int b = 500;
		int c = 400;
		int d = 300;

		if (a > b && a > c && a > d) {

			System.out.println("a is the greatest number");

		} else if (b > c && b > d) {

			System.out.println("b is greatest number");
		}

		else if (c > d) {

			System.out.println("c is greatest number");
		}

		else {

			System.out.println("d is greatest number");
		}

	}

}
