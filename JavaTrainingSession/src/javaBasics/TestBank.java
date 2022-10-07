package javaBasics;

public class TestBank extends Shape {
	
	@Override
	public void drawing() {
		System.out.println("Test --> Shape");
		
	}

	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		System.out.println(USBank.min_bal);
		hb.credit();
		hb.debit();
		hb.transferMoney();
		hb.personalLoan();
		USBank ub1 = new HDFCBank();
		ub1.credit();
		UKBank uk1 = new HDFCBank();
		uk1.mutualFund();
		
		/*Shape s= new Shape() {
			
			@Override
			public void drawing() {
				//Shape.color=10;
				System.out.println("Abstract class drawing()...." );
				
			}
		};
		s.drawing();
		s.color=10;
		System.out.println(s.color);*/
		
		Shape s = new TestBank();
		s.drawing();
		s.fill();
		System.out.println(s.color);
		
		try {
			
		} finally{
			
		}
		
	}

	

}
