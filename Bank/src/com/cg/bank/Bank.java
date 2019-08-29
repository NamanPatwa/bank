package com.cg.bank;

public interface Bank {
	void deposit(double amount);
	void withdraw(double amount) throws BankException;
	
	void summary();
	void statement();
	
	double MIN_SAV_BAL = 1000;
	double INIT_CURR_BAL = 5000;
	double MIN_CURR_BAL = 0;
	double OD_AMOUNT = 10000;
	int INIT_ACNT_NO = 1001;
}
