package javabasics;

public class MaxMinNumberMethod {

	public void MaxNumber(int a, int b, int c) {

		if (a > b && a >= c) {

			System.out.println("a is the greatest number");
		}

		else if (b > c) {

			System.out.println("b is the greatest number");

		}

		else {

			System.out.println("c is the greatest number");

		}

	}

	public void MinNumber(int a, int b, int c) {

		if (a <= b && a <= c) {

			System.out.println("a is the smallest number");
		}

		else if (b <= c) {

			System.out.println("b is the smallest number");

		}

		else {

			System.out.println("c is the smallest number");

		}

	}

	public static void main(String[] args) {

		MaxMinNumberMethod m1 = new MaxMinNumberMethod();

		m1.MaxNumber(400, 800, 1000);
		m1.MinNumber(600, 100, 900);

	}

}
