
public class CheckingAccount extends BankAccount{
	//static constant FEE
	static double FEE = 0.15; 
	
	/**
	 * 
	 * @param name
	 * @param amount
	 */
	public CheckingAccount(String name, double amount) {
		super(name, amount); 
		//Mutator method since accountNumber is private
		super.setAccountNumber(getAccountNumber() + "-10");  
	}
	
	//Overrides withdraw method from superclass
	@Override
	public boolean withdraw(double amount) {
		boolean a = true; 
		if(amount <= getBalance())				//superclass
			super.withdraw(FEE + amount); 		//Amount plus the FEE and calls the withdraw method from the superclass
		else
			a = false; 							//If the method was not able to complete the withdrawal
		return a; 
	}
}
