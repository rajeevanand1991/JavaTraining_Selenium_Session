package javaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		int a[] = new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//a[5]=60; //ArrayIndexOutOfBoundsException
		System.out.println(a[4]);
		System.out.println(a.length);
		System.out.println("****** FOR LOOP IMPLEMENTED *********");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//object array can store any datatype values
		Object obj[] = new Object[3];
		obj[0]="RAJA";
		obj[1]=true;
		obj[2]='A';
		System.out.println("Object Array Concept.......");
		System.out.println(obj[1]);

	}

}
