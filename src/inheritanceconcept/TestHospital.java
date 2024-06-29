package inheritanceconcept;

public class TestHospital {

	public static void main(String[] args) {

		Appolo ap = new Appolo();
		ap.treatPatient();
		ap.dischargePatient();
		ap.admitPatient();
		ap.performSurgery();

		System.out.println("-----------------------------------");

		Hospital hp = new Hospital();
		hp.admitPatient();
		hp.treatPatient();
		hp.dischargePatient();

		System.out.println("-----------------------------------");

		Hospital h = new Appolo();

		h.admitPatient();
		h.treatPatient();
		h.dischargePatient();

		Hospital h1 = new Fortis();
		h1.admitPatient();
		h1.treatPatient();
		h1.dischargePatient();

		System.out.println("-----------------------------------");

		Hospital h2 = new Max();
		h2.admitPatient();
		h2.treatPatient();
		h2.dischargePatient();

	}

}
