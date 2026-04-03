class Country
{
	String Countries[]=new String[29];
	int index;
	public boolean addCountry(String country)
	{
		boolean isCountryAdded=false;
		if(country!=null && !country.isEmpty())
		{
			Countries[index++]=country;
			isCountryAdded=true;
		}
		else
		{
			System.out.println(Countries + "is invalid");
		}
		return isCountryAdded;
	}	
	public void getCountry()
	{
		System.out.println("Get Method is Added");
		for(String country: Countries)
		{
			System.out.println(country);
		}
	}	
}