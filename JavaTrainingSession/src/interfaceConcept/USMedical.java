package interfaceConcept;

public interface USMedical extends WHO {
	
	int min_fee = 10; //Interface variables are static and final by default
	
	//These are method declarations
	public void physioServices(); 
	
	public void oncologyServices();
	
	public void orthopedicServices();
	
	public void radiologyServices(); // present in USMedical, UKMedical and IndianMedical interfaces
	
	//cannot create the object of Interface 
	
	/*cannot create static prototype method in interface ===> if use static, Method overriding concept getting failure now
	public static void increasephysioServices(); // shows This method requires a body instead of a semicolon 
	But Interface variables are static and final by default */
	
	/*from JDK 1.8, you can have static methods in interface but with method body
	static method with method body will be allowed 
	For this method, Method overriding will not be allowed in their child classes now */
	public static void services_911() {
		System.out.println("US - 911 services...");
	}
	
	//By using default access modifier in Interface, method overriding will not be allowed in their child classes now
	default void internship() {
		System.out.println("US - internship...");
	}
}