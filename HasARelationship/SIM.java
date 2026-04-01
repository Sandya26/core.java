class SIM 
{
    String simNumber;
    String operator;
    String planType;
    double balance;
    String validity;

    public void getSIMDetails() 
	{
        System.out.println("the sim simNumber is " + simNumber);
        System.out.println("the sim operator is " + operator);
        System.out.println("the sim planType is " + planType);
        System.out.println("the sim balance is " + balance);
        System.out.println("the sim validity is " + validity);
    }
}