package enums;

public interface BankTrasactions {

	/**
	 * Description: This method performs deposit operation
	 * 
	 * @param accountType
	 * @param depositMoney
	 */
	void deposit(AccountType accountType, int depositMoney);

	/**
	 * Description: This method performs deposit operation
	 * 
	 * @param withdrwalMoney
	 */
	void withdrawl(int withdrwalMoney);

	/**
	 * Description: This method prints Balance Amount
	 */
	void checkBalance();

}
