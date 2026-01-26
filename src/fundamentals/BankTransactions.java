package fundamentals;

public class BankTransactions {

	static int balance = 10000;

	public void deposit(String accountType, int depositMoney) {

		switch (accountType) {
		case "SAVINGS":
			if (depositMoney <= 200000) {
				balance = balance + depositMoney;
				System.out.println("Deposit Successful");
			} else {
				System.out.println("Savinsg account limit for deposit is: 200000");
			}
			break;
		case "CURRENT":
			if (depositMoney <= 500000) {
				balance = balance + depositMoney;
				System.out.println("Deposit Successful");
			} else {
				System.out.println("Savinsg account limit for deposit is: 500000");
			}
			break;

		case "RETAIL":
			if (depositMoney <= 1000000) {
				balance = balance + depositMoney;
				System.out.println("Deposit Successful");
			} else {
				System.out.println("Savinsg account limit for deposit is: 1000000");
			}
			break;
		default:
			System.out.println("Invalid account type");
		}
	}

	public void withdrawl(int withdrwalMoney) {
		if (withdrwalMoney <= balance) {
			if (withdrwalMoney <= 50000) {
				balance = balance - withdrwalMoney;
				System.out.println("Withdrawl Successful");
			} else {
				System.out.println("Withdrawl limit for savings acount is: 50000");
			}
		} else {
			System.out.println(
					"In-Sufficient Balance, please enter less amount than your balance: " + BankTransactions.balance);
		}
	}

	public void checkBalance() {
		System.out.println("Balance Amount: " + balance);
	}

	public static void main(String[] args) {
		BankTransactions sbiBank = new BankTransactions();
		sbiBank.checkBalance();
		sbiBank.deposit("SAVINGS",50000);
		sbiBank.checkBalance();

		BankTransactions iciciATM = new BankTransactions();
		iciciATM.withdrawl(55000);
		iciciATM.checkBalance();
		
		sbiBank.deposit("SAVINGS", 300000);
		sbiBank.deposit("CURRENT", 300000);
		sbiBank.checkBalance();

	}

}
