package interfaceconcept;

public interface USMedical extends WHO {

	// be default variable in interface are static and final in nature

	int MIN_FEE = 100;

	public void physioServices();

	public void oncologyServices();

	public void dentalServices();

	public void emergencyServices();

	public void ENTServices();

	public static void billing() {

		System.out.println("US Medical-------Billing");
	}

}
