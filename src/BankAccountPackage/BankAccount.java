package BankAccountPackage;

public class BankAccount {
//	The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
	public String accountNum;
	public double checkingBalance=0;
	
	
	
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double savingsBalance=0;
	public String accountOwner;
	public static Integer numAccounts=0;
	
			//this is our constructor
	public BankAccount(String nameOfOwner) {
		this.accountOwner= nameOfOwner;
		numAccounts++;
		this.accountNum = String.valueOf(generateAccountNum());
		
	}
	
	private int generateAccountNum() {
		int x = 1 + (int) (Math.random() * 10000000);
		return x;
	}
	
	public void displayAccountInfo() {
		System.out.println(String.format("Account Owner: %s. Checking Balance: %f. Account Number: %s ", this.accountOwner, this.checkingBalance, this.accountNum));
	}
	
//
//	● Create a class member (static) that tracks the total amount of money stored in every account created.
//
//
//	● In the constructor, call the private method from above so that each user has a random ten digit account.
//
//	● In the constructor, be sure to increment the account count.
//
//	● Create a getter method for the user's checking account balance.

}
