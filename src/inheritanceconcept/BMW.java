package inheritanceconcept;

public class BMW extends Car {

	
	@Override
	public void start() {

		System.out.println(" BMW class Start");

	}

	
	@Override
	public void stop() {

		System.out.println(" BMW class Stop");

	}

	public void safety() {

		System.out.println(" BMW class Safety");

	}

}
