package javabasics;

public class Method {

	public void printHello() {

		System.out.println("Hello, World!");
	}

	public int add(int num1, int num2) {

		int p = num1 + num2;
		return p;
	}

	public boolean compareStrings(String str1, String str2) {

		if (str1.equals(str2)) {

			return true;
		} else {

			return false;
		}

	}

	public static void main(String[] args) {

		Method m1 = new Method();
		m1.printHello();

		System.out.println("-------------------------");

		int add = m1.add(900, 100);
		System.out.println("The addition is :" + add);

		System.out.println("-------------------------");

		boolean b = m1.compareStrings("Testing", "Selenium");
		System.out.println("The value	 is :" + b);

		System.out.println("-------------------------");

	}

}
