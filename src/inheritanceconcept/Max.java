package inheritanceconcept;

public class Max extends Hospital {

	
	@Override
	public void treatPatient() {

		System.out.println("Max Class-----treat Patient");

	}


	@Override
	public void dischargePatient() {

		System.out.println("Max Class-----discharge Patient");

	}

	public void conductTests() {

		System.out.println("Max Class-----conduct tests");

	}

}
