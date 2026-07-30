package bean;

import tellexception.InsufficientFundException;

public class AccountClass 
{
	private int accountnumber;
	private String accountHoldername;
	private int balance;
	public AccountClass(int accountnumber, String accountHoldername, int balance) {
		super();
		this.accountnumber = accountnumber;
		this.accountHoldername = accountHoldername;
		this.balance = balance;
	}
	
	
	public int doDeposit(int amount)
	{
		 balance += amount;
		 return balance;
	}
	
	public int doWithdrawal(int amount) throws  InsufficientFundException
	{
		if(balance-amount<5000)
		{
			throw new InsufficientFundException("Insufficient Balance");
		}
		else
		{
			balance -= amount;
			return balance;
		}
	}
	
	
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	

}
