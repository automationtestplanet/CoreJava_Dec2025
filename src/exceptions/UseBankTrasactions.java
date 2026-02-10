package exceptions;

public class UseBankTrasactions {

	public static void main(String[] args) {

		try {
			BankTransactions sbiBank = new BankTransactions();

			sbiBank.checkBalance();
			sbiBank.deposit("SAVINGS", 50000);
			sbiBank.checkBalance();

			BankTransactions iciciATM = new BankTransactions();
			iciciATM.withdrawl(60000);
			iciciATM.checkBalance();
		} catch (Exception e) {

		}
	}

}
