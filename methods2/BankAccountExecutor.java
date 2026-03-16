class BankAccountExecutor
{
	public static void main(String args[])
	{
		double ba=BankAccount.getBalance();
		System.out.println("Your Balance Amount is: "+ba);
		BankAccount.credit(1000.0);
		BankAccount.debit(700.0);
		ba=BankAccount.getBalance();
		System.out.println("Your Balance Amount is: "+ba);
	}
}