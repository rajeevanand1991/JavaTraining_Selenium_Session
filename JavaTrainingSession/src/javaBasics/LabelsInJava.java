package javaBasics;

public class LabelsInJava {

	public static void main(String[] args) {
		task1: //This is java label
			for(int i=0;i<10;i++) {
				System.out.println(i);
				if(i==5) {
					break task1;
				}
			}
		System.out.println("Hello again Rajeev..:)");
		//task2: //This is java label
	}

}
