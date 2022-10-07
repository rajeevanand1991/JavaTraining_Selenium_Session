package javaBasics;

public class CallByValueReference {
	int p,q;
	public static void main(String[] args) {
		int a=10, b=20;
		CallByValueReference obj = new CallByValueReference();
		int s=obj.sum(a, b);//call by value/pass by value
		System.out.println("call by value ==> "+s);
		obj.p=100;
		obj.q=200;
		System.out.println("Before swap: p" + " = "+obj.p +" and "+ "q = "+obj.q);
		obj.swap(obj); //s=obj //callbyreference
		System.out.println("after swap: q" + " = "+obj.p +" and "+ "q = "+obj.q);

	}
	
	public int sum(int e, int f) {
		int g=e+f;
		return g;
	}
	
	// call by reference
	public void swap(CallByValueReference s) {
		int temp;
		temp=s.p; //temp=100
		s.p=s.q; //p=200
		s.q=temp; //q=100
	}

}
