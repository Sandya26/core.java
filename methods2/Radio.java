class Radio
{
	static boolean on;
	static boolean off;
	static int currentTemp;
	static int maxValue=9;
	static int minValue=0;
	static boolean powerOn(boolean on)
	{
		powerOn=on;
		if(powerOn)
		{
			System.out.println("Radio Power on");
			static void increaseRadioWaves()
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
			static void decreaseRadioWaves()
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