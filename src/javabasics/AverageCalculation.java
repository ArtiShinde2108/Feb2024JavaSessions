package javabasics;

public class AverageCalculation {

	public static double calculateAverage(double[] numbers) {

		double sum = 0;

		for (double number : numbers) {

			sum = sum + number;

		}

		double avg = sum / numbers.length;
		return avg;

	}

	public static void main(String[] args) {

		// AverageCalculation c1 = new AverageCalculation();

		double[] numbers = { 10, 20, 30, 40, 50, 60 };

		double average = AverageCalculation.calculateAverage(numbers);

		System.out.println("The average of the Array elements is :" + average);

	}

}
