package interfaceconcept;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical {

	int MIN_FEE = 200;

	// US
	
	@Override
	public void physioServices() {
		System.out.println("FH------ physioServices");

	}

	
	@Override
	public void oncologyServices() {
		System.out.println("FH------ physioServices");

	}

	
	@Override
	public void dentalServices() {
		System.out.println("FH------ dentalServices");
	}

	// UK

	
	@Override
	public void gynecServices() {
		System.out.println("FH------ gynecServices");

	}

	
	@Override
	public void gastroServices() {
		System.out.println("FH------ gastroServices");

	}

	// India

	
	@Override
	public void pediaServices() {
		System.out.println("FH------ pediaServices");

	}

	
	@Override
	public void neuroServices() {
		System.out.println("FH------ neuroServices");

	}

	// common


	@Override
	public void emergencyServices() {
		System.out.println("FH------ emergencyServices");

	}

	// individual method

	public void MedicalTraining() {

		System.out.println("FH------ MedicalTraining");
	}

	
	@Override
	public void ENTServices() {

	}

	public static void billing() {

		System.out.println("FortisHospital-------Billing");
	}

	
	@Override
	public void CovidVaccination() {

		System.out.println("FortisHospital-------CovidVaccination");

	}

	
	@Override
	public void MedicalNews() {

		System.out.println("FH-------MedicalNews");

	}

}
