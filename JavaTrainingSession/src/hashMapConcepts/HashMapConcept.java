package hashMapConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<String, Integer>(); //This is generics or wrapper class
		marks.put("Rajeev", 100); //hashcode in eclipse ===> -1854537221 and Index position shows 3
		marks.put("Lisa", 200); //hashcode in eclipse ===> 2368683 and Index position shows 4
		marks.put("Peter", 150); //hashcode in eclipse ===> 77005292 and Index position shows 1
		marks.put("Robby", 98);//hashcode in eclipse ===> 79132860 and Index position shows 2
		
		marks.put(null, 500);
		marks.put(null, 700); //Index position shows 0 in eclipse
		marks.put("Rajeev", 900); //last updated value will consider for that duplicate key
		System.out.println(marks);
		
		//First it will check the hashcode of Lisa -- 2368683
		//index position calculated for that hashcode -- 4
		//Then go to that 4th Index position, performs .equals to check the key name
		//Inside LinkedList table key name Lisa will found
		//Then finally return the value of 200
		
		System.out.println(marks.get("Lisa"));
		
		/* Output:
			 {null=700, Peter=150, Robby=98, Rajeev=900, Lisa=200}
			 200 */
		
		/*Refer the below images for more clear,
			- How HashMap works internally_Popular java interview question on collection HashMap.jpg
			- JAVA8Updation_How HashMap works internally_Popular java interview question on collection HashMap.jpg*/
	}
}