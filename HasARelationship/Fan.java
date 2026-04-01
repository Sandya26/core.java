class Fan
{
	String brand;
	String colour;
	String electricFanDesign;
	String powerSource;
	String style;
	int prize;
	Capacitor capacitor;
	public void getFanDetails()
	{
		System.out.println("Fan Brand is: "+brand);
		System.out.println("Fan Colour is: "+colour);;
		System.out.println("Electric Fan Design is: "+electricFanDesign);
		System.out.println("Fan Power Source is: "+powerSource);
		System.out.println("---------");
		capacitor.getCapacitor();
	}
}