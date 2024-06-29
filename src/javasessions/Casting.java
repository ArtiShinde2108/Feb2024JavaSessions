package javasessions;

public class Casting {

	public static void main(String[] args) {

		byte a = 100;
		byte b = 110;

		byte d = (byte) (a + b);
		System.out.println(d);

		int c = a + b;
		System.out.println(c);

		short s1 = 100;
		short s2 = 200;

		short s = (short) (s1 + s2);
		System.out.println(s);

		int w = 200;
		int p = 300;

		int r = w + p;
		System.out.println(r);

		int r1 = 200;
		byte r2 = (byte) r1;
		System.out.println(r2);

		char c1 = 'a';
		byte b1 = (byte) c1;
		System.out.println(b1);

		double dr = 1233.33;
		short f = (short) dr;
		System.out.println(f);

		char c4 = 'c';
		char c5 = 'd';

		System.out.println(c4 + " " + c5);
		System.out.println(c4 + ' ' + c5);

		System.out.println(' ' + ' ');
		System.out.println(" " + ' ');
		System.out.println(' ' + ' ' + ' ' + " ");
		System.out.println(' ' + " ");

		double e = 97.33;
		int fj = (char) e;
		System.out.println(fj);

	}

}
