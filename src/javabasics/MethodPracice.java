package javabasics;

public class MethodPracice {

	public void MinNumber(int a, int b, int c) {

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

	public void MaxNumber() {

	}

	public void AreaOfCircle(int r) {

		double area = 3.14 * r * r;
		System.out.println("The area of circle is " + area);

	}

	public void CircumferenceOfCircle(int r) {

		double circumference = 2 * 3.14 * r;
		System.out.println("The circumference of circle is " + circumference);

	}

	public void Addition(int a, int b) {

		System.out.println("The addition of a and b is  " + (a + b));

	}

	public void Subtraction(int a, int b) {

		System.out.println("The subtraction of a and b is  " + (a - b));

	}

	public int Multiplication(int a, int b) {

		System.out.println("The multiplication of a and b is  " + (a * b));

		return (a * b);
	}

	public void Division(int a, int b) {

		System.out.println("The division of a and b is  " + (a / b));

	}

	public static void main(String[] args) {

		MethodPracice m1 = new MethodPracice();

		m1.Addition(200, 100);
		m1.Subtraction(200, 100);
		int product = m1.Multiplication(200, 1000);
		m1.Division(200, 100);

		System.out.println("The returned product is  " + product);

		System.out.println("---------------------------");
		m1.AreaOfCircle(10);
		m1.CircumferenceOfCircle(20);

		System.out.println("The returned product is  " + product);

		m1.MinNumber(100, 500, 700);
	}

}
