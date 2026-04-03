class SuperMarket
{
	String superMarkets[]=new String[6];
	int index;
	public boolean addSuperMarket(String superMarket)
	{
		boolean isSuperMarketAdded=false;
		if(superMarket!=null && !superMarket.isEmpty())
		{
			superMarkets[index++]=superMarket;
			isSuperMarketAdded=true;
		}
		else 
		{
			System.out.println(superMarkets + "is invalid");
		}
		return isSuperMarketAdded;
	}
	public void getSuperMarket()
	{
		System.out.println("Get Method is Added");
		for(String superMarket : superMarkets)
		{
			System.out.println(superMarket);
		}
	}
}