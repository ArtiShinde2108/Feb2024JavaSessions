package interfaceconcept;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.pediaServices();
		fh.oncologyServices();
		fh.dentalServices();
		fh.gynecServices();
		fh.gastroServices();
		fh.pediaServices();
		fh.neuroServices();

		fh.emergencyServices();
		fh.MedicalTraining();

		// top casting

		USMedical us = new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.dentalServices();

		us.emergencyServices();
		System.out.println(fh.MIN_FEE);
		System.out.println(USMedical.MIN_FEE);

		USMedical.billing();
		FortisHospital.billing();

		fh.MedicalNews();
		fh.MedicalRND();

	}

}
