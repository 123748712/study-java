package studyJava.chapter07.Example;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	public void setAccount(BankAccount account) {
		this.accounts = accounts;
	}

	public String toString() {
		return "ÀÌ¸§ : " + firstName + " " + lastName + ", °èÁÂÀÇ °¹¼ö : " + numberOfAccounts;
	}

	public void addAccount(BankAccount account) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				break;
			}
		}
		numberOfAccounts++;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
}