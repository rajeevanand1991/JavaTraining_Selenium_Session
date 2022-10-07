package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Amar");
		al.add('A');
		al.add(true);
		al.add(12);
		al.add(12.24);
		System.out.println(al.size() +" Values are ====> " +al);
		System.out.println(al.get(2));
		//System.out.println(al.get(5)); //will get IndexOutOfBoundsException
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(78);
		System.out.println("**********************************************");
		
		Employee emp1 = new Employee("Rajeev", 30, "Senior QA Engineer");
		Employee emp2 = new Employee("Anand", 33, "QA Lead");
		Employee emp3 = new Employee("Lalith", 2, "P.K.G");
		
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		ar2.add(emp1);
		ar2.add(emp2);
		ar2.add(emp3);
		System.out.println(ar2);
		
		/*for(int i=0;i<ar2.size();i++) {
			System.out.println(ar2.get(i));
		}*/
		
		Iterator<Employee> it = ar2.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.role);
		}


	}

}
