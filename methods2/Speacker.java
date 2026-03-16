class Speacker
{
	static boolean on;
	static boolean off;
	static boolean isConnect;
	static int maxVolume=9;
	static int minVolume;
	static int currentVolume=4;
	static boolean increaseVolume;
	static boolean decreaseVolume;
	static boolean geton()
	{
		on=TRUE;
		if(isConnect==on)
		{
			System.out.println("Your Device is Connected");
			static void increaseVolume()
			{
				if(increaseVolume==maxVolume)
				{
					System.out.println("You have reached maximum volume");
				}
				else
				{
					System.out.println("Current Volume is: "+currentVolume);
				}
			}
			static void decreaseVolume()
			{
				if(decreaseVolume==minVolume)
				{
					System.out.println("You have reached minimum volume");
				}
				else
				{
					System.out.println("Current Volume is: "+currentVolume);
				}
			}
		}
		else 
		{
			System.out.println("Your Device is not Connected");
		}
		
	}
}