class Fridge
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
			System.out.println("Fridge is Running");
			static void increaseTemp()
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
			static void decreaseTemp()
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