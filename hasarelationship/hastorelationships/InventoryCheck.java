class InventoryCheck
{
	public static void validate()
	{
		System.out.println("Validate Method is Started");
		WareHouse.fetchFromAisle();
		System.out.println("Validate Method is Ended");
	}
}