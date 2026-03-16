class ElectricGuitar
{
	static boolean powerOn;
	static boolean powerOff;
	static int currentTemp;
	static int maxValue=9;
	static int minValue=0;
	static void powerOn(boolean on)
	{
		powerOn=on;
		if(powerOn)
		{
			System.out.println("ElectricGuitar is Running");
			static void increaseStrings()
			{
				if(currentTemp<maxValue)
				{
					currentTemp++;
					System.out.println("Current Temperature Is: "+currentTemp);
				}
				else
				{
					System.out.println("Your Current Temperature is Reached Maximum Value");
				}
			}
			static void decreaseStrings()
			{
				if(currentTemp>minValue)
				{
					currentTemp--;
					System.out.println("Current Temperature Is: "+currentTemp);
				}
				else
				{
					System.out.println("Your Current Temperature is Reached Minimum Value");
				}
			}
		}
	}
	else
	{
		System.out.println("Turn on the Switch");
	}
}