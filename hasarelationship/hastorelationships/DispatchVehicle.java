class DispatchVehicle
{
	public static void outOfDelivery()
	{
		System.out.println("Out Of Delivery Method is Started");
		SignaturePortal.collectESign();
		System.out.println("Out Of Delivery Method is Ended");
	}
}