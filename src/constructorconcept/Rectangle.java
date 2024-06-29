package constructorconcept;

public class Rectangle {

	double length;
	double width;

	public Rectangle() {

	}

	public Rectangle(double length, double width) {

		this.length = length;
		this.width = width;
	}

	public double calculateArea(double length, double width) {

		double area = length * width;

		return area;
	}

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.length = 0.0;
		r1.width = 0.0;

		System.out.println("The length of rectangle is " + r1.length);
		System.out.println("The length of rectangle is " + r1.width);

		Rectangle r2 = new Rectangle(10.99, 5.90);
		System.out.println("----------------------------------------- ");

		System.out.println("The length of rectangle is " + r2.length);
		System.out.println("The length of rectangle is " + r2.width);
		System.out.println("----------------------------------------- ");

		double area = r1.calculateArea(12.33, 15.90);

		System.out.println("The area of rectangle is " + area);

	}

}
