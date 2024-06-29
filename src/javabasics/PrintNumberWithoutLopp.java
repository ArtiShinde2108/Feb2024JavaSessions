package javabasics;

import java.util.stream.IntStream;

public class PrintNumberWithoutLopp {

	public static void PrintNumber(int num) {
		if (num <= 100) {

			System.out.println(num);
			num++;
			PrintNumber(num);

		}

	}

	public static void PrintNumber(int Stnum, int Endnum) {
		if (Stnum <= Endnum) {

			System.out.println(Stnum);
			Stnum++;
			PrintNumber(Stnum);

		}

	}

	public static void main(String[] args) {

		PrintNumber(1);
		PrintNumber(1, 101);

		IntStream.range(1, 101).forEach(e -> System.out.println(e));

	}

}
