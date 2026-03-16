class HeadsetExection
{
	public static void main(String args[])
	{
		System.out.println("main started");
		String brand=Headset.getBrand();
		System.out.println("Headset brand is:"+brand);
		double price =Headset.getPrice();
		System.out.println("Headset price is "+price);
		System.out.println("main ended");
	}
}