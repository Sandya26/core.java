class OrderSystem
{
	public static void sendToKitchen()
	{
		System.out.println("Send To Kitchen Method is Started");
		Kitchen.recieveOrder();
		System.out.println("Send To Kitchen Method is Ended");
	}
}