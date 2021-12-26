package studyJava.chapter07.Example;

public class Customer extends Bank {
	private String firstName;
	private String lastName;
	private BankAccount account;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public String toString() {
		return "ÀÌ¸§ : " + firstName + " " + lastName + ", ÀÜ°í : " + account.getBalance() + "¿ø";
	}
}