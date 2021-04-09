package BankAccountPackage;

import BankAccountPackage.BankAccount;

public class BankAccountTest {
	
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Elon Musk");
		BankAccount b2 = new BankAccount("Jeff Bezos");
		BankAccount b3 = new BankAccount("Obama");
		
		System.out.println(b1.accountOwner);
		System.out.println(BankAccount.numAccounts);
		
		b1.displayAccountInfo();
		b2.displayAccountInfo();
		
	}

}
