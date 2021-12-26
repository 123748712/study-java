package studyJava.chapter07.Example;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectBy) {
		super(balance);
		this.protectBy = protectBy;
	}

	@Override
	public boolean withdraw(int amount) {
		if (this.balance < amount) {
			protectBy.balance = protectBy.balance + (balance - amount);
			this.balance = 0;
			return true;
		} else {
			this.balance = balance - amount;
			return true;
		}

	}
}
