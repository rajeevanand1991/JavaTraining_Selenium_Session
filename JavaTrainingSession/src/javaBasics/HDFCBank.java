package javaBasics;

public class HDFCBank implements USBank,UKBank {

	@Override
	public void credit() {
		System.out.println("HDFC_UK - Credit");
		
	}

	@Override
	public void debit() {
		System.out.println("HDFC_UK - Debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("HDFC_UK - Tranfer Money");
		
	}
	
	public void personalLoan() {
		System.out.println("HDFC_UK - Personal Loan");

	}

	@Override
	public void mutualFund() {
		System.out.println("HDFC_US - Personal Loan");
		
	}

}
