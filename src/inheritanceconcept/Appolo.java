package inheritanceconcept;

public class Appolo extends Hospital {

	@Override
	

	public void treatPatient() {

		System.out.println("Appolo Class-----treat Patient");

	}

	
	@Override
	public void dischargePatient() {

		System.out.println("Appolo Class-----dischange Patient");

	}

	public void performSurgery() {

		System.out.println("Appolo Class-----perform Patient");

	}

}
