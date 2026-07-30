package main;
import java.util.Scanner;
import tellexception.InsufficientFundException;
import bean.AccountClass;

public class MainClass 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		AccountClass dc = new AccountClass(1209,"Kashika",10000);
		
		System.out.println("Enter Amount to be Deposited");
		int amount = new Scanner(System.in).nextInt();

		
		int result = dc.doDeposit(amount);
		
		System.out.println("Total Balance"+ " "+result);
		
		try
		{
			System.out.println("Enter Amount To be Withdrawal");
			int amount2 = sc.nextInt();
			int result2 = dc.doWithdrawal(amount2);
			
			System.out.println("Total Balance" + " "+result2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
