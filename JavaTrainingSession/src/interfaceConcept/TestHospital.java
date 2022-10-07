package interfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		/*Object creation not allowed for the Interface
		USMedical um = new USMedical();*/
		
		/*Same as like Selenium WebDriver Interface
		WebDriver driver = new WebDriver();*/
		
		ApolloHospital ap = new ApolloHospital();
		ap.ambulanceServices(); //Apollo -- ambulance
		ap.emergencyServices(); // Apollo -- emergency
		ap.ENTServices(); //Apollo -- ENT
		ap.medicalInsurance(); //Apollo -- medical Insurance
		ap.neuroServices(); //Apollo -- neuro
		ap.getPatientHistory(); //GlobalPatientData -- getPatientHistory
		
		System.out.println(ap.min_fee); //Warning shows: The static field USMedical.min_fee should be accessed in a static way
		//USMedical.min_fee=20; // Error shows like, The final field USMedical.min_fee cannot be assigned
		System.out.println(USMedical.min_fee); // we can access it directly by class name/Interface name with that variable
		
		//Top Casting
		USMedical us = new ApolloHospital(); //child class object can be referred by parent interface reference variable
		us.physioServices(); //Apollo -- physio
		us.oncologyServices(); //Apollo -- oncology
		us.orthopedicServices(); //Apollo -- orthopedic
		
		//This below code is reference type check
		//us.ENTServices(); //shows The method ENTServices() is undefined for the type USMedical
		//us.medicalInsurance(); //shows The method medicalInsurance() is undefined for the type USMedical
		
		USMedical.services_911(); //US - 911 services...
		IndianMedical.dengueServices(); //IndianMedical - dengue services...
		
		//access default methods from interface by child class object reference
		ap.internship(); //US - internship...
		
		//also access it through Top Casting reference variable as well
		us.internship(); //US - internship...
		
		UKMedical uk = new ApolloHospital();
		uk.ENTServices(); //Apollo -- ENT
		uk.ambulanceServices(); //Apollo -- ambulance
		
		IndianMedical im = new ApolloHospital();
		
		//radiologyServices() declared in USMedical, UKMedical and IndianMedical interfaces
		//And defined in implemented child class ApolloHospital one time alone
		ap.radiologyServices(); //Apollo -- radiology Services
		us.radiologyServices(); //Apollo -- radiology Services
		uk.radiologyServices(); //Apollo -- radiology Services
		im.radiologyServices(); //Apollo -- radiology Services
		
		//This is parent interface reference for the child class object
		WHO who = new ApolloHospital();
		ap.polioServices(); //Apollo -- polio Services
		ap.covid_19Services(); //Apollo -- COVID-19 Services
		us.polioServices(); //Apollo -- polio Services
		us.covid_19Services(); //Apollo -- COVID-19 Services
		who.polioServices(); //Apollo -- polio Services
		who.covid_19Services(); //Apollo -- COVID-19 Services
		
		/*Down Casting strictly wont allowed, before that cannot create an object for the interface itself
		ApolloHospital ahs = new UKMedical(); */
		//only method declaration -- method prototype -- no method body
	}
}