package interfaceConcept;

public interface IndianMedical {
	
	//These are method declarations
	public void emergencyServices();
	
	public void neuroServices();
	
	public void pediatricServices();
	
	public void radiologyServices(); // present in USMedical, UKMedical and IndianMedical interfaces
	
	public static void dengueServices() {
		System.out.println("IndianMedical - dengue services...");	
	}
}