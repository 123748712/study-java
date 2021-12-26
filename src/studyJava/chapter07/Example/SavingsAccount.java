package studyJava.chapter07.Example;

public class SavingsAccount extends BankAccount {

	private double interestRate;

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	public void updateBalance(int period) {
		this.balance = (int) ((balance * interestRate * period) + balance);
	}
}
