class State
{
	public static void run()
	{
		System.out.println("Run Method in State is Started");
		District.run();
		District.taxing();
		District.measure();
		District.collect();
		District.revenue();
		District.budget();
		System.out.println("Run Method in State is Ended");
	}
}