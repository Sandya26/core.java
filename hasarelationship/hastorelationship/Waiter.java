class Waiter
{
	public static void takeOrder()
	{
		System.out.println("Take Order Method is Started");
		OrderSystem.sendToKitchen();
		System.out.println("Take Order Method is Ended");
	}
}