
public class SavingsAccount extends BankAccount{
	//yearly interest rate
	double rate = 0.025; 
	static int savingsNumber = 0; 
	String accountNumber;
	
	//constructor
	public SavingsAccount(String name, double amount) {
		super(name, amount); 
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	public void postInterest() {
		deposit(getBalance() * (rate/(12))); 
	}
	@Override
	public String getAccountNumber() {
		return accountNumber;
		
	}
	/**
	 * 
	 * @param oldAccount
	 * @param amount
	 */
	//copy constructor
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount); 		 
		accountNumber = super.getAccountNumber()+ "-" + ++savingsNumber;
	}
	
}
