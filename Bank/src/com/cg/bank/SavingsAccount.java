package com.cg.bank;

public class SavingsAccount extends Account {
    
    
    public SavingsAccount() {
    }


    public SavingsAccount(String holder)
    {
    	super(holder,MIN_SAV_BAL);
    	txns = new Transaction[10];
    	//Adding transaction to
    	txns [idx++] = new Transaction("Cr", MIN_SAV_BAL, balance);
    }

    @Override
    public void withdraw(double amount) throws BankException {
    	 if(amount <= (balance - MIN_SAV_BAL)){
    	    	balance -= amount;
    	    	txns [idx++] = new Transaction("Dr", amount, balance);
    	 }
    	 else 
    		 throw new BankException("Insufficeint Bal");
    }
    
    
   
}
