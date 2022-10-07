package hashMapConcepts;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConcept {

	public static void main(String[] args) {
		Map<String, Integer> map= new LinkedHashMap<String, Integer>(); //TopCasting
		map.put("Tom", 100); //Index is 0 and HashCode is 84274
		map.put("Rajeev", 200); //Index is 1 and HashCode is -1854537221
		map.put("Naveen", 300); //Index is 2 and HashCode is -1968696341
		map.put("Steve", 400); //Index is 3 and HashCode is 80208819
		map.put("Lisa", 500); //Index is 4 and HashCode is 2368683
		map.put(null, 600); //Index is 5 and NO HashCode
		map.put(null, 700); //The last updated value 700 only will consider for null key and Index is 5 and NO HashCode
		map.put("Sharma", null); //Index is 6 and HashCode is -1819698822
		map.put("Sharvesh", null); //Index is 7 and HashCode is -678602838
		map.put("Vicky", null); //Index is 8 and HashCode is 82649438
		System.out.println(map); //Now This LinkedHashMap will behave as like DoublyLinkedList like Before node + Key + Value + After node with last value node only null, until that it will be linked
		/*Output:
			{Tom=100, Rajeev=200, Naveen=300, Steve=400, Lisa=500, null=700, Sharma=null, Sharvesh=null, Vicky=null}*/
		
		System.out.println(map.get("Tom")); //Output: 100
	}
}