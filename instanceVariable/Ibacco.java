class Ibacco{
String icecreams[]=new String[10];
int index;
	public boolean addIceCream(String icecream)
	{
		boolean isIcreamAdded=false;
		if(icecream!=null && !icecream.isEmpty())
		{
		icecreams[index++]=icecream;
			isIcreamAdded=true;
		}
		else
		{
			System.out.println(icecream + "is not valid");
		}
		return isIcreamAdded;
	}
	public void getIceCreams()
	{
		System.out.println("The Available ice Cream are: ");
		for(String icecream:icecreams)
			System.out.println(icecream);
	}
}