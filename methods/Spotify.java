class Spotify
{
	static String songNames[]={"Saiyaara","Naguva Nayana","Abhi Na Javo CHodokar"};
	public static void getSpotify()
	{
		System.out.println("Song Names are Initialized");
		for(String songName:songNames)
		{
			System.out.println(songName);
			System.out.println("Song Names are Closed");
		}
	}
}