class Cakes
{
	String cakes[]=new String[5];
	int index;
	public boolean addCakes(String cake)
	{
		boolean isCakesAdded=false;
		if(cake!=null && !cake.isEmpty())
		{
			cakes[index++]=cake;
			isCakesAdded=true;
		}
		else 
		{
			System.out.println(cakes + "is invalid");
		}
		return isCakesAdded;
	}
	public void getCakes()
	{
		System.out.println("Get Method is Added");
		for(String cake : cakes)
		{
			System.out.println(cake);
		}
	}
}