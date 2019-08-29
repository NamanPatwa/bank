package com.cg.bank;

public class CurrentAccount extends Account {
	
	private double overdraft;
	
	public CurrentAccount() {
	}
	
	public CurrentAccount(String holderName){
		super(holderName, INIT_CURR_BAL);
		overdraft = OD_AMOUNT;
		txns = new CurrentTranscations[10];
		txns [idx++] = new CurrentTranscations("Cr", MIN_CURR_BAL, balance, OD_AMOUNT);
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Over Draft: "+overdraft);
	}

	@Override
	public void deposit(double amount) {
		if(overdraft + amount > OD_AMOUNT){
			balance += (amount - (OD_AMOUNT - overdraft));
			overdraft = OD_AMOUNT;
			txns [idx++] = new CurrentTranscations("Cr", amount, balance, overdraft);
		}
		else{
			overdraft += amount;
			txns [idx++] = new CurrentTranscations("Cr", amount, balance, overdraft);
		}
	}

	@Override
	public void withdraw(double amount) throws BankException {
		if((balance - amount) < MIN_CURR_BAL ){
			if(overdraft - (amount - balance) > 0){
				overdraft -= ( amount - balance );
				balance = MIN_CURR_BAL;
				txns [idx++] = new CurrentTranscations("Cr", amount, balance, overdraft);
			}else
				System.out.println("Insufficient Funds...");
		}
		else{
			balance -= amount;
			txns [idx++] = new CurrentTranscations("Cr", amount, balance, overdraft);
		}
	}
	
}