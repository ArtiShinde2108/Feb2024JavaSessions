package javabasics;

public class OddEvenNum {

	public boolean isEligible(int a) {

		if (a >= 18) {

			System.out.println("The person is eligible for voting as age is " + a);

			return true;
		}

		else {

			System.out.println("The person is not eligible for voting as age is " + a);
			return false;

		}

	}

	public boolean num(int a) {

		if (a % 2 == 0) {

			System.out.println(a + " is an even number");

			return true;

		} else {

			System.out.println(a + " is an odd number");

			return false;

		}

	}

	public static void main(String[] args) {

		OddEvenNum obj = new OddEvenNum();

		boolean b = obj.num(90);
		System.out.println(b);

		System.out.println("----------------------");

		boolean a = obj.isEligible(11);

		System.out.println(a);

	}

}
