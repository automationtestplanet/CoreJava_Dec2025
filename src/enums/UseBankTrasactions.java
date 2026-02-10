package enums;

public class UseBankTrasactions {

	public static void main(String[] args) {

		try {
			BankTrasactions sbiBank = new ImplementsBankTransactions();

			sbiBank.checkBalance();
			sbiBank.deposit(AccountType.SAVINGS, 50000);
			sbiBank.checkBalance();

			BankTrasactions iciciATM = new ImplementsBankTransactions();
			iciciATM.withdrawl(60000);
			iciciATM.checkBalance();
		} catch (Exception e) {

		}
	}

}
