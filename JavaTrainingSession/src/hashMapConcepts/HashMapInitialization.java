package hashMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;

public class HashMapInitialization {
	
	//Mutable - Should allowed after declared values
	//Immutable - Not allowed after declared values
	
	public static Map<String, Integer> marksMap;
	static {
		marksMap = new HashMap<>(); //Initialization of object is important, otherwise will face NullPointerException
		marksMap.put("A", 100);
		marksMap.put("B", 200);
		
	}

	public static void main(String[] args) {
		//1. Using HashMap class
		
		HashMap<String, String> map1 = new HashMap<String, String>(); //Generics used for Key, Value are String, String 
		Map<String, String> map2 = new HashMap<String, String>(); //Top casting allowed
		
		//2. Static way: Static HashMap:
		System.out.println(HashMapInitialization.marksMap.get("A")); //100
		
		//3. ImmutableMap with only one single entry allowed, the value wont change:
		//Returns an immutable map, mapping only the specified key to the specified value. The returned map is serializable
		Map<String, Integer> map3 = Collections.singletonMap("test", 101);
		System.out.println(map3.get("test")); //101
		//map3.put("abc", 201); //facing UnsupportedOperationException due to trying to add more than one entry to the map
		
		//4. In JDK 8 introduced:
		//creating one 2D array of Strings using Stream and collecting in the form Map
		Map<String, String> map4 = Stream.of(new String [][] {
			{"Tom","A Grade"},
			{"Rajeev","A+ Grade"}
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map4.get("Tom")); //A Grade
		System.out.println(map4.get("Rajeev")); //A+ Grade
		map4.put("Lisa", "A++ Grade");
		System.out.println(map4.get("Lisa")); //A++ Grade
		
		//Using SimpleEntry: This is mutable map:
		Map<String, String> map5 = Stream.of(
				new AbstractMap.SimpleEntry<>("Rajeev", "Java"),
				new AbstractMap.SimpleEntry<>("Tom", "Python"),
				new AbstractMap.SimpleEntry<>("Sharma", "JavaScript")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map5.get("Rajeev")); //Java
		map5.put("Lisa", "C#");
		System.out.println(map5.get("Lisa")); //C#
		
		//Using SimpleEntry: This is Immutable map:
		Map<String, String> map6 = Stream.of(
				new AbstractMap.SimpleImmutableEntry<>("Rajeev", "Java"),
				new AbstractMap.SimpleImmutableEntry<>("Tom", "Python"),
				new AbstractMap.SimpleImmutableEntry<>("Sharma", "JavaScript")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map6.get("Tom")); //Python
		map5.put("Steve", "Ruby");
		System.out.println(map6.get("Steve")); //null
		
		//5. JDK 1.9:
		//Just create empty map
		Map<String, String> emptyMap = Map.of();
		//emptyMap.put("Tom", "Python"); //if we try to add itself will face UnsupportedOperationException
		//System.out.println(emptyMap.get("Tom")); //facing UnsupportedOperationException
		
		//singleton map
		Map<String, String> singletonMap = Map.of("k1", "v1");
		System.out.println(singletonMap.get("k1")); //v1
		//singletonMap.put("k2", "v2"); //if we try to add itself will face UnsupportedOperationException
		//System.out.println(singletonMap.get("k2")); // facing UnsupportedOperationException
		
		//multi Values map, This method supports to store only maximum 10 Key-Value pairs alone
		Map<String, String> multiMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3");
		System.out.println(multiMap.get("k3")); //v3
		
		//This is better than Streams
		//ofEntries method: no Limitations on pairs (key-value)
		//Immutable - Not allowed after declared values
		Map<String, Integer> map7 = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A", 100),
				new AbstractMap.SimpleEntry<>("B", 200),
				new AbstractMap.SimpleEntry<>("C", 300)
				);
		System.out.println(map7.get("C")); //300
		//map7.put("D", 400); //if we try to add itself will face UnsupportedOperationException
		//System.out.println(emptyMap.get("D")); //facing UnsupportedOperationException
		
		//maps using Guava:
		Map<String, String> titleMaps = ImmutableMap.of("Google", "Google India", "Amazon", "Amazon Shopping");
		System.out.println(titleMaps.get("Amazon")); //Amazon Shopping
		//titleMaps.put("Rediff", "Rediff India"); //if we try to add itself will face UnsupportedOperationException
	}
}