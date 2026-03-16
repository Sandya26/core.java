class CarrierService
{
	public static void pickUpPackage()
	{
		System.out.println("Pick Up Package Method is Started");
		HubRouter.sortToZipCode();
		System.out.println("Pick Up Package Method is Ended");
	}
}