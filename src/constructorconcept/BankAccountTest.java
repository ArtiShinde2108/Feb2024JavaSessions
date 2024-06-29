package constructorconcept;

public class BankAccountTest {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount("123456", 20000.00);
		System.out.println(b1.accountNumber + " " + b1.balance);

		double afterDeposit = b1.deposit(10000.00);
		System.out.println("the updated balance after deposit is " + afterDeposit);

		double afterWithdrawal = b1.withdraw(500.50);
		System.out.println("the updated balance after withdrawal is " + afterWithdrawal);

		double afterDeposit1 = b1.deposit(5000.00);
		System.out.println("the updated balance after deposit is " + afterDeposit1);

		double afterWithdrawal1 = b1.withdraw(5000.50);
		System.out.println("the updated balance after withdrawal is " + afterWithdrawal1);

	}

}
