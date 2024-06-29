package constructorconcept;

public class BankAccount {

	String accountNumber;
	double balance;

	public BankAccount(String accountNumber, double balance) {

		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public double deposit(double credit) {

		balance = balance + credit;
		return balance;
	}

	public double withdraw(double debit) {

		balance = balance - debit;
		return balance;
	}

}
