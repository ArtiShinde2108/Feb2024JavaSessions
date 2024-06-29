package javabasics;

public class LogicalOperator {

	public static void main(String[] args) {

		/*
		 * for (int i=1; i<=9; i++) {
		 *
		 * System.out.println("I am a Batman " +i);
		 *
		 * }
		 */

		/*
		 * for (int p=10; p>0; p--) {
		 *
		 * System.out.println(p);
		 *
		 * }
		 */

		/*
		 * int i = 1; while(i<=10) {
		 *
		 * System.out.println("Hello World"); i++;
		 *
		 * }
		 */

		for (int i = 0; i <= 100; i++) {

			if (i % 2 == 0) {

				System.out.println(i + "is even");

			}

			else {
				System.out.println(i + "is odd");

			}

		}

	}

}
