package inheritanceconcept;

public class Vehicle extends Mechanical {

	public void engine() {

		System.out.println("Vehicle class engine");
	}

	public void basics() {

		System.out.println("Vehicle class basics");
	}

	
	@Override
	public void design() {

		System.out.println(" Vehicle class design");

	}

}
