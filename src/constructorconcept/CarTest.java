package constructorconcept;

public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.make + " " + c1.model + " " + c1.year);

		Car c2 = new Car("Honda", "Civic", 2022);
		System.out.println(c2.make + " " + c2.model + " " + c2.year);

	}

}
