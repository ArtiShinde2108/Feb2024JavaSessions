package inheritanceconcept;

public class TestParentVehicle {

	public static void main(String[] args) {

		childTruck ct = new childTruck();
		ct.start();
		ct.accelerate();
		ct.stop();
		ct.loadCargo();

		System.out.println(ct.brand + " " + ct.model + " " + ct.year);
		ct.brand = "Honda";
		ct.model = "Civic";
		ct.year = 2022;
		ct.cargoCapacity = "1000kg";

		System.out.println(ct.brand + " " + ct.model + " " + ct.year + " " + ct.cargoCapacity);
		System.out.println("----------------------------------------");

		childMotorcycle cm = new childMotorcycle();
		cm.start();
		cm.accelerate();
		cm.stop();
		cm.wheelie();

		System.out.println("----------------------------------------");

		ChildCar cr = new ChildCar();
		cr.start();
		cr.accelerate();
		cr.stop();
		cr.playMusic();

		System.out.println("----------------------------------------");

		ParentVehicle pv = new ParentVehicle();
		pv.start();
		pv.stop();
		pv.accelerate();

		System.out.println("----------------------------------------");

		ParentVehicle p = new childTruck();
		p.start();
		p.accelerate();
		p.stop();

	}

}
