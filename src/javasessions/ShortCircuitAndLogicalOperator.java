package javasessions;

public class ShortCircuitAndLogicalOperator {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;

		if (x > 0 && y > 0 && x < y && x * 2 < y) {
			System.out.println("Hi");
		}

		if (x > 0 & y > 0 & x < y & x * 2 < y) {
			System.out.println("Hello");
		}

	}

}
