package com.cg.bank;

public final class AccountFactory {
	private AccountFactory() {
	}

	public static Bank openAccount(String type, String holder) {
		Bank b = null;

		if (type.equalsIgnoreCase("savings"))
			b = new SavingsAccount(holder);
		else
			b = new CurrentAccount(holder);

		return b;
	}

}
