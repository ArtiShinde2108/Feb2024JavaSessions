package inheritanceconcept;

public class CarTest {

	public static void main(String[] args) {

		BMW b1 = new BMW();
		b1.engine();
		b1.start();
		b1.stop();
		b1.basics();
		b1.design();
		b1.carlogic();

		System.out.println("-----------------------");

		Car c1 = new Car();
		c1.engine();
		c1.basics();
		c1.refuel();
		c1.features();
		c1.features();
		c1.carlogic();

		System.out.println("-----------------------");

		Science s1 = new Science();
		s1.carlogic();

	}

}
