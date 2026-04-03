class DigitalZone
{
	String digitalZones[]=new String[6];
	int index;
	public boolean addDigitalZone(String digitalZone)
	{
		boolean isDigitalZoneAdded=false;
		if(digitalZone!=null && !digitalZone.isEmpty())
		{
			digitalZones[index++]=digitalZone;
			isDigitalZoneAdded=true;
		}
		else 
		{
			System.out.println(digitalZones + "is invalid");
		}
		return isDigitalZoneAdded;
	}
	public void getDigitalZone()
	{
		System.out.println("Get Method is Added");
		for(String digitalZone : digitalZones)
		{
			System.out.println(digitalZone);
		}
	}
}