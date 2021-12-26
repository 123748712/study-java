package studyJava.chapter07.Example;

public class BankAccount extends Bank {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public boolean withdraw(int amount) {
		if (balance >= amount) {
			this.balance = balance - amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (balance >= amount) {
			this.balance = balance - amount;
			otherAccount.balance = otherAccount.balance + amount;
			return true;
		} else {
			return false;
		}
	}
}
