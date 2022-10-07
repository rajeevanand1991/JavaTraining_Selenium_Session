package hashMapConcepts;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(11000, "Rajeev");
		map.put(1400, "Naveen");
		map.put(100, "Robby");
		System.out.println(map);
		/*Output:
			{100=Robby, 1000=Tom, 1400=Naveen, 2000=Peter, 3000=Steve, 11000=Rajeev}*/
		map.forEach((k,v) -> System.out.println("key = " +k + " value = " +v));
		/*Output:
			key = 100 value = Robby
			key = 1000 value = Tom
			key = 1400 value = Naveen
			key = 2000 value = Peter
			key = 3000 value = Steve
			key = 11000 value = Rajeev*/
		System.out.println(map.lastKey()); //11000
		System.out.println(map.firstKey()); //100
		
		//To print below 2000 salary values
		Set<Integer> keyLessThan3k = map.headMap(3000).keySet();
		System.out.println("Print less than 3K salary: "+keyLessThan3k);
		/*Output:
			Print less than 3K salary: [100, 1000, 1400, 2000]*/
		
		//To print greater than 2000 salary values
		Set<Integer> keyGreaterThan3k = map.tailMap(3000).keySet();
		System.out.println("Print greater than 3K salary: "+keyGreaterThan3k);
		/*Output:
			Print greater than 3K salary: [3000, 11000]*/
		
		TreeMap<String, Integer> userMap = new TreeMap<String, Integer>();
		userMap.put("James", 100);
		userMap.put("Brad", 200);
		userMap.put("Albert", 400);
		userMap.put("George", 50);
		userMap.put("Larry", 900);
		userMap.put("Ted", 120);
		userMap.put("Paul", 300);
		userMap.forEach((k,v) -> System.out.println("key = " +k + " value = " +v));
		/*Output:
			key = Albert value = 400
			key = Brad value = 200
			key = George value = 50
			key = James value = 100
			key = Larry value = 900
			key = Paul value = 300
			key = Ted value = 120*/
		
		//To print map values in descending order
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>(Comparator.reverseOrder());
		map1.put(1000, "Tom");
		map1.put(2000, "Peter");
		map1.put(3000, "Steve");
		map1.put(11000, "Rajeev");
		map1.put(1400, "Naveen");
		map1.put(100, "Robby");
		System.out.println(map1);
		/*Output:
			{11000=Rajeev, 3000=Steve, 2000=Peter, 1400=Naveen, 1000=Tom, 100=Robby}*/
	}
}