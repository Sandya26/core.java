class OrderSystem
{
	public static void takeOrder()
	{
		System.out.println("Take Order Method is Started");
		InventoryCheck.validate();
		System.out.println("Take Order Method is Ended");
	}
}