package interfaceConcept;

//This child class deriving GlobalPatientData parent class and also with 3 interfaces are  USMedical, UKMedical and IndianMedical as well.
public class ApolloHospital extends GlobalPatientData implements USMedical, UKMedical, IndianMedical {

	@Override
	public void physioServices() {
		System.out.println("Apollo -- physio");
	}

	@Override
	public void oncologyServices() {
		System.out.println("Apollo -- oncology");
	}

	@Override
	public void orthopedicServices() {
		System.out.println("Apollo -- orthopedic");
	}

	@Override
	public void ENTServices() {
		System.out.println("Apollo -- ENT");
	}

	@Override
	public void ambulanceServices() {
		System.out.println("Apollo -- ambulance");
	}

	@Override
	public void emergencyServices() {
		System.out.println("Apollo -- emergency");
	}

	@Override
	public void neuroServices() {
		System.out.println("Apollo -- neuro");
	}

	@Override
	public void pediatricServices() {
		System.out.println("Apollo --  pediatric");
	}
	
	//This below methods comes from common 3 interfaces (USMedical, UKMedical and IndianMedical)
	@Override
	public void radiologyServices() {
		System.out.println("Apollo -- radiology Services");
	}
	
	//comes from WHO interfaces
	@Override
	public void polioServices() {
		System.out.println("Apollo -- polio Services ");	
	}

	//comes from WHO interfaces
	@Override
	public void covid_19Services() {
		System.out.println("Apollo -- COVID-19 Services ");
	}
	
	//non-overridden methods:
	public void OPTServices() {
		System.out.println("Apollo -- Outpatient services");
	}
	
	public void medicalInsurance() {
		System.out.println("Apollo -- medical Insurance");
	}
	
	public void pathologyServices() {
		System.out.println("Apollo -- pathology services");
	}	
}