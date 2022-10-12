package HashTableConcept;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Rajeev", 100); //hashcode = -1854537221 and index = 3
		marks.put("Naveen", 200); //hashcode = -1968696341 and index = 2
		marks.put("Tom", 300); //hashcode = 84274 and index = 4
		marks.put("Lisa", 400); //hashcode = 2368683 and index = 1
		marks.put("Peter", 600); //hashcode = 77005292 and index = 5
		marks.put("Arobby", 50); //hashcode = 1969580347 and index = 0
		//marks.put(null, null); //will face NullPointerException
		//marks.put(null, 900); //will face NullPointerException
		//marks.put("Boss", null); //will face NullPointerException
		System.out.println(marks);
//		Output:
//			{Arobby=50, Lisa=400, Naveen=200, Rajeev=100, Tom=300, Peter=600}
		
		System.out.println(marks.get("Rajeev")); //100
		System.out.println(marks.get("Peter")); //600
		//System.out.println(marks.get(null)); //will face NullPointerException
	}
}