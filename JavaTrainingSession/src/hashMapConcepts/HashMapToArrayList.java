package hashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 15000);
		
		System.out.println("Company Map size ===> "+compMap.size()); //5
		
		//Perform Iteration
		Iterator it  = compMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey() + " = " +pairs.getValue());
		}
		
		/*Output:
			Google = 10000
			Walmart = 20000
			Cisco = 15000
			Amazon = 30000
			Facebook = 5000*/
			
		System.out.println("-----------------------");
		
		//Using Lambda Java 8 features:
		compMap.forEach((k,v) -> System.out.println("key = " + k + " and value = " +v));
		/*Output:
			key = Google and value = 10000
			key = Walmart and value = 20000
			key = Cisco and value = 15000
			key = Amazon and value = 30000
			key = Facebook and value = 5000*/
		
		//convert HashMap keys into ArrayList
		List<String> compNamesList = new ArrayList<String>(compMap.keySet());
		System.out.println("Total company count = " +compNamesList.size()); //5
		for(String t : compNamesList) {
			System.out.println(t);
		}
		/*Output:
			Google
			Walmart
			Cisco
			Amazon
			Facebook*/
		
		System.out.println("-----------------------");
		
		//convert HashMap values into ArrayList
		List<Integer> empValuesList = new ArrayList<Integer>(compMap.values());
		System.out.println("Total emp values count = "+empValuesList.size()); //5
		for(Integer e : empValuesList) {
			System.out.println(e);
		}
		/*Output:
			10000
			20000
			15000
			30000
			5000*/
	}
}