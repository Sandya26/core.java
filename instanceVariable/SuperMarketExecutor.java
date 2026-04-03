class SuperMarketExecutor
{
	public static void main(String args[])
	{
		SuperMarkets ref=new SuperMarkets();
		boolean added=ref.addSuperMarket("Chocolate cake");
		System.out.println(added);
		
		added=ref.addSuperMarket("Apples");
		System.out.println(added);
		
		added=ref.addSuperMarket("Banana");
		System.out.println(added);
		
		added=ref.addSuperMarket("Pasta");
		System.out.println(added);
		
		added=ref.addSuperMarket("Soft Drinks");
		System.out.println(added);
		
		added=ref.addSuperMarket("Hand Sanitizer");
		System.out.println(added);
		
		added=ref.addSuperMarket("Vegetables");
		System.out.println(added);
		
		added=ref.addSuperMarket("Rice");
		System.out.println(added);
		
		ref.getSuperMarket();
	}
}