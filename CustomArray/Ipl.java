class Ipl
{
	Season season[] = new Season[5];
	
	public void getIplDetails()
	{
		
		for(Season s: season)
		s.getSeasonDetails();
	
	}
}