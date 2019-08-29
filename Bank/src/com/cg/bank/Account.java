package com.cg.bank;

/**
 * This class represents the generalised bank account
 * @author Naman
 *
 */
public class Account implements Bank{
	private int acntNo;
	private String holder;
	protected double balance;

	//Fields for transaction statements
	protected Transaction[] txns;
	protected int idx;
	
	private static int autogenAcc = INIT_ACNT_NO;

	public Account() {
	}

	public Account(String holder, double balance) {
		this.acntNo = autogenAcc++;
		this.holder = holder;
		this.balance = balance;
	}

	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	// BL Methods
	public void deposit(double amount) {
		balance += amount;
		txns [idx++] = new Transaction("Cr", amount, balance);
	}

	public void withdraw(double amount) throws BankException {
		if (amount <= balance)
			balance -= amount;
		else
			System.out.println("Insuffucient Balance!!");
	}

	@Override
	public void statement() {
		for (int i = 0; i < idx; i++) {
			txns[i].print();
		}
	}
	
	
}
