class BankAccount
{
	static double balance;
	static double getBalance()
	{
		return balance;
	}
	static void credit(double amount)
	{
		if(amount>0.0)
		{
			balance=balance+amount;
			System.out.println("Credited Amount Is: "+balance);
		}
		else
		{
			System.out.println("You Cannot Credited Amount");
		}
		
	}
	static void debit(double amount)
	{
		
		if(amount<=0.0)
		{
			System.out.println("You don't have sufficient amount in your bank account");
		}
		else
		{
			balance=balance-amount;
			System.out.println("Debited Amount Is: "+balance);
		}
	}
}