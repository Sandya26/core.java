class Olympic
{
	String olympics[]=new String();
	int index;
	public boolean addOlymipcs(String olympic)
	{
		boolean isOlympicAdded=false;
		if(olympic!=null && !olympic.isEmpty())
		{
			olympics[index++]=olympic;
			isOlympicAdded=true;
		}
		else 
		{
			System.out.println(olympics + "is invalid");
		}
		return isOlympicAdded;
	}
	public void getOlympics()
	{
		System.out.println("Get Method is Added");
		for(String olympic : olympics)
		{
			System.out.println(olympic);
		}
	}
}