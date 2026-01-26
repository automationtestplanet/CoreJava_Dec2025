package fundamentals;

public class UseBankTrasactions {

	public static void main(String[] args) {
		BankTransactions sbiBank = new BankTransactions();
		sbiBank.checkBalance();
		sbiBank.deposit("SAVINGS",50000);
		sbiBank.checkBalance();
		
		BankTransactions iciciATM = new BankTransactions();
		iciciATM.withdrawl(5000);
		iciciATM.checkBalance();
		
	}


}
