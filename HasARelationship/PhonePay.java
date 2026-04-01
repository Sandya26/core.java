class PhonePay
{
    int userId;
    String userName;
    String phoneNumber;
    String email;
    double walletBalance;
    History history;

    public void getPhonepeDetails()
	{
        System.out.println("the phonepe userId is " + userId);
        System.out.println("the phonepe userName is " + userName);
        System.out.println("the phonepe phoneNumber is " + phoneNumber);
        System.out.println("the phonepe email is " + email);
        System.out.println("the phonepe walletBalance is " + walletBalance);
		System.out.println("-------");
        history.getHistoryDetails();
    }
}