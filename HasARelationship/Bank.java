class Bank
{
	String accountHolderName;
	int age;
	String emailId;
	AccountHolder accountHolder;
	public void getBankDetails()
	{
		System.out.println("Bank Account Details is Started");
		System.out.println("Bank Account Holder Name is:"+accountHolderName);
		System.out.println("Bank Account Holder Age is:"+age);
		System.out.println("Bank Account Holder Email ID is:"+emailId);
		System.out.println("-------");
		accountHolder.getAccountHolder();
	}
}