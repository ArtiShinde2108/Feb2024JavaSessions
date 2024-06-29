package inheritanceconcept;

public class Car extends Vehicle {

	public void start() {

		System.out.println(" Car class Start");

	}

	public void stop() {

		System.out.println(" Car class Stop");

	}

	public void refuel() {

		System.out.println(" Car class refulel");

	}

	
	@Override
	public void basics() {

		System.out.println("Car class basics");
	}

	
	@Override
	public void features() {

		System.out.println(" Car class features");

	}
}