package testMain;

public class B {

	public static void main(String[] args) {
		System.out.println("B--Main Method");
		//A.main(args); It will call A main() then again comes here B main()
						//And will produce stackoverflow error
	}
}