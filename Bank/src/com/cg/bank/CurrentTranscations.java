package com.cg.bank;


public class CurrentTranscations extends Transaction {
	private double overdraft;
	
	public CurrentTranscations() {
	}

	public CurrentTranscations(String type, double amount, double balance, double overdraft) {
		super(type, amount, balance);
		this.overdraft = overdraft;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Overdraft: "+overdraft);
	}
	
	
	
}
