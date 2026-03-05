class JioHotstar
{
	static String liveBusinessNews[]={"CNBC TV18","CNBC-TV18Prime","CNBC Awaaz","CNBC Bajar","News 18 India","News18 MP Chattisgarh",
		"News18 Rajasthan","News18 Tamil Nadu","News18 Marathi","News18 UP Uttarakhand","CNN News18","CNBC-TV18 prime","News18 Kerala",
		"News18 Bangla","News18 Gujurati","News18 Odia","News18 Assam NE","News18 Punjab Haryana","News18 Assam NE","News18 JKLH",
		"CNBC Bajar"};
	static 	String crimeMovies[]={"Police Police","Robinhood","Mrs.Deshpande","Joe Pickett","Cricket Justice","Murderbaad","Bloody Daddy",
		"Search","Siren","Ronth","Thudarum","Kannur Squad","Sholay","Aakhri Sach","Apurva","Vikranth Rona","Heaven","Quiet Plachikkavu",
		"Kerala Crime Files","Vikram Vedha","Monster","Khiladi","Commander Karan Saxena","Goodluck Jerry","Under Salt Marsh","Sanak",
		"Sembi","Fast & Furious9","Aarya"};
	static String  thrillMovies[]={"Mermaid Down","Raid","Kaabil","The Grey","Airlift","Villain","KEE","Maatr","Maayavan","Laal Rang",
		"AAkhiri Chaal","I Spit on your Grave","Welcome Home","Ugly","The Thieves","I See You","D-16","8 Thottakkal","Monsoon Shootout",
		"Security","Dongri Ka Raja","Omerta","COPY","Jaal Ek Tantra","Khatron Se Khelenge","Bad Samaritan","Mirchi Malin","Between Words",
		"Hate Story 2","Belzebuth"};
	static String devilsMovie[]={"Shootout At Lokhandwala","The descent","Karz","Jeepers 2","Garv","Krishna Cottage","lajja","The Descent part2",
		"Aan","Bhoot","Deewangee","The Stoneman","Shutter","Dawn of the Dead","13 B","Inside Man","Ring","Bourne Identity","Chandramukhi",
		"Live Free or Die hard","1920 Gayatri","Changeling","State of Play","Hannibai","Red Dragon","Untraceble","darna mana","Shikari",
		"Sikandar","Kucch To Hai","88 Minutes"};
	static String mcuTimeline[]={"Eyes of Wakanda","Captain America","Captain Marvel","Iron Man","Iron Man 2","Thor","Avengers","Thor",
		"Iron Man 3","Captain America","Guardians of the Galaxy","Guardians of the Galaxy 2","I am Groot","Daredevil","Jessica Jones",
		"Ant-Man","Iron Fist","Defenders","Civil WAr","Black Widow","Black Panther","Punisher","Doctor Strange","Thor Rahnarok","Echo",
		"Thor Love and Thander","Agatha all Along","The Guardians of the Galaxy 2","Deadpool & Wolverine","Thunder Bolts"};
	static String fairyTales[]={"Tangled","Maleficient","Frozen2","Narnia","THe Princess Diaries","Moana","Frozen","Mulan","Alice in Wonderland",
		"Enchanted","Cinderella","Tinker Bell Neverbeast","The Little MErmaid","Alice","Alladdin","Tinker Bell","Beauty and the Beast",
		"Princess Rrog","Tinker Bell Lost Treasure","Sleeping Beauty","Elena of Avalor","Tangled the Series","Ariel","Hocus Pocus 2","Snow White",
		"The Castle Quest","Pocahontas","Tinker Bell Great fairy Resue","Maleficient Mistress of Evil"};
	public static void main(String args[])
	{
		getliveBussinessNews();
		getcrimeMovies();
		getthrillMovies();
		getdevilsMovies();
		getmcuTimeline();
		getfairyTales();
	}
	static void getliveBussinessNews()
	{
		System.out.println("Live Bussiness are: ");
		for(String lb:liveBusinessNews)
		{
			System.out.println(lb);
		}
	}
	static void getcrimeMovies()
	{
		System.out.println("Crime Movies are: ");
		for(String cm:crimeMovies)
		{
			System.out.println(cm);
		}
	}
	static void getthrillMovies()
	{
		System.out.println("Thrill Movies are: ");
		for(String tm:thrillMovies)
		{
			System.out.println(tm);
		}
	}
	static void getdevilsMovies()
	{
		System.out.println("Devils Movies are: ");
		for(String dm:devilsMovie)
		{
			System.out.println(dm);
		}
	}
	static void getmcuTimeline()
	{
		System.out.println("Mcu Timeline are: ");
		for(String mt:mcuTimeline)
		{
			System.out.println(mt);
		}
	}
	static void getfairyTales()
	{
		System.out.println("Fairy Tales are: ");
		for(String ft:fairyTales)
		{
			System.out.println(ft);
		}
	}
}