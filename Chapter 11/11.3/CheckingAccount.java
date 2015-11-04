/*
 * Davis Odom
 * 9/1/15
 * A checking account class
 */
public class CheckingAccount extends Account {

	private double overdraftLimit;
	
	public CheckingAccount(){
		super();
		overdraftLimit = -1000;
	}
	
	public CheckingAccount(double limit){
		super();
		//We invert the limit to make calculations easier
		overdraftLimit = -limit;
	}
	
	//removes an amount from the account as long as the limit is not reached
	@Override
	public void Withdraw(double amount){
		if((getBalance()-amount) >= overdraftLimit){
			super.Withdraw(amount);
		}else{
			double allowed = Math.abs(overdraftLimit-getBalance());
			System.out.println("You have reached your overdraft limit.  You can withdraw " + formatter.format(allowed) + " more");
		}
	}
	
	//describes the account to humans
	@Override
	public String toString(){
		String s = super.toString();
		s = s.concat("\nType: Checking  Limit = " + formatter.format(overdraftLimit));
		return s;
	}
}
