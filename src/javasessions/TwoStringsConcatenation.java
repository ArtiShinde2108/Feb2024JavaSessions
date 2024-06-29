package javasessions;

import java.util.Arrays;

public class TwoStringsConcatenation {

	public static void main(String[] args) {

		String k = "Hello Selenuium";
		String p = "t";

		System.out.println(k + p);

		int r[] = { 1, 3, 4, 5, 22, 56, 89, 90 };

		System.out.println(Arrays.toString(r));
		System.out.println("-------------------------");

		for (int e : r) {

			System.out.println(e);
		}

		for (int element : r) {
			System.out.println(element);

		}

		System.out.println("-------------------------");
		int s = r.length;
		int x = 0;

		while (x < s) {
			System.out.println(r[x]);
			x++;

		}

	}

}
