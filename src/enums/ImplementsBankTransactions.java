package enums;

public class ImplementsBankTransactions implements BankTrasactions{

	static int balance = 10000;

	@Override
	public void deposit(AccountType accountType, int depositMoney) {

		switch (accountType) {
		case SAVINGS:
			if (depositMoney <= 200000) {
				balance = balance + depositMoney;
				System.out.println("Deposit Successful");
			} else {
				throw new BankTrasactionException("Savinsg account limit for deposit is: 200000");
			}
			break;
		case CURRENT:
			if (depositMoney <= 500000) {
				balance = balance + depositMoney;
				System.out.println("Deposit Successful");
			} else {
				throw new BankTrasactionException("Savinsg account limit for deposit is: 500000");
			}
			break;

		case RETAIL:
			if (depositMoney <= 1000000) {
				balance = balance + depositMoney;
				System.out.println("Deposit Successful");
			} else {
				throw new BankTrasactionException("Savinsg account limit for deposit is: 1000000");
			}
			break;
		default:
			throw new BankTrasactionException("Invalid account type");
		}
	}

	@Override
	public void withdrawl(int withdrwalMoney) {
		if (withdrwalMoney <= balance) {
			if (withdrwalMoney <= 50000) {
				balance = balance - withdrwalMoney;
				System.out.println("Withdrawl Successful");
			} else {
				throw new BankTrasactionException("Withdrawl limit for savings acount is: 50000");
			}
		} else {
			throw new BankTrasactionException(
					"In-Sufficient Balance, please enter less amount than your balance: " + ImplementsBankTransactions.balance);
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Balance Amount: " + balance);
	}

}
