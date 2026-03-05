class MxPlayer
{
	static String kdramas[]={"Ghost Doctor","Love in Contract","Doom at your Service","Twinkling Watermelon","Lovely Runner",
		"Suspicious Partner","Dr. Romantic","Heirs","The Heavenly Idol","She was Pretty","My Lovely Liar","Two Worlds Apart",
		"Lve with Flaws","Extra Ordinary You","Pinocchio","I'm Not a Robot","Angel's Last Mission Love","Tempted","Shopaholic Louis",
		"Still 17","Clean with Passion for Now","Tale of Nokdu","Cheer Up","My id is gangnam Beauty","Wok Love","Doctor John Wedding Impossible",
		"The Secret Life of My Secretary","She was Pretty","Something in the Rain"};
	static String cdramas[]={"Goblin","Lighter and Princess","I'm not a Robot","Rich Man","Melting Me Softly","My Girl Friend is an ALien",
		"My Girl Friend is a Gumiho","At Eighteen","Extraordinary You","Cheer Up","Something in the Rain","Hide & Seek","Touch Your Heart",
		"Ms. Hammurabi","At Eighteen","Beauty Inside","Touch Your Heart","Gangnam Beauty","Sweet Sweet","Love 020",
		"Love Unexpected","Poisoned Love","My bear Brothers","Dance of the Sky Empire","The Untamed","Put You Head On My Shoulder",
		"When We were Young","Le Coup de Foudre","our Secret","Crush"};
	static String turkishTV[]={"Golden Boy","Miracle","Love is in The AIR","Brave and Beautiful","Endless Love","Lost in Love","The Promise",
		"Our Story","Hear Me 2","Alaca","Broken Lives","My Home My Destiny","Chrysalis","Forbidden Fruit","Cennet","Women","Dreams Realities",
		"new Bride","Dreaming of You","Love Puzzle","My First Love","Melody of Love","The Promise","Life Today","Cennet","Our Story"};
	static String webseries[]={"Kebahubali","Bhay","Amar Vishwas","You From The Future","Only For LOve","Doom at your Service","My Boss",
		"Aukaat Ke Bahar","When I Fly Towards You","Jujitsu Kaisen","Apharan","Present is Present","Co-Ed","Jamnapaar","Penance",
		"Bhaukaal","The Heavenly Idol","Raat Ka Raag","Raktanchal","Gen Z","Everyone Loves Me","Fights Break Sphere","Perfect And Casual",
		"Talaash","Demon Slayer","Begin Again"};
	static String hollywoodMovies[]={"faster","HellBoy","Underworld","A Nun Curse","Monster Hunter","Anacondas","Rundown","Ghost Rider",
		"Stuart Little2","The Pursuit of Happiness","the Boy","A.X.L","Season of the Witch","Mythica","Salt","Godzina","Ace Ventura",
		"Jurassic Shark","Security","Ace Ventura when Natiure Calls","The Smurfs","The Lake","Cloudy with a chance of Meat balls",
		"Cloudy with a chance of Meat balls 2","The Vatican Tapes","Divergent"};
	static String crimeMovies[]={"Section 375","Jailer","Pushpa","Pushpa2","Drishyam 2","Faster","Tiger","Mumbai Saga","Batla House",
		"Secret Agent","Double Ismart","Zid","Neeyat","The Dragon Pearl","Naa Saami Ranga","Security","Ace Ventura","Saindhav",
		"Bodguard","Businessman","Once upon A Time in Mumbai","Sarkar","Maari","Shootout at Wadala","Operation Mekong","Garadi",
		"Highway","Killing Veerapan","Janta Garage","The Tourist","Rathnam","Money","The Great Arms Robbery","Shootout"};
	public static void main(String args[])
	{
		getKdramas();
		getcdramas();
		getturkishTV();
		getwebseries();
		gethollywoodMovies();
		getcrimeMovies();
	}
	static void getKdramas(){
	System.out.println("K-Dramas are:\n");
	for(String k:kdramas)
		System.out.println(k);
	}
	static void getcdramas(){
	System.out.println("C-Dramas are:\n");
	for(String c:cdramas)
		System.out.println(c);
	}
	static void getturkishTV(){
	System.out.println("Turkish TV are:\n");
	for(String t:turkishTV)
		System.out.println(t);
	}
	static void getwebseries(){
	System.out.println("Webseries are :\n");
	for(String w:webseries)
		System.out.println(w);
	}
	static void gethollywoodMovies(){
	System.out.println("Hollywood Movies are:\n");
	for(String h:hollywoodMovies)
		System.out.println(h);
	}
	static void getcrimeMovies(){
	System.out.println("Crime Movies are:\n");
	for(String cr:crimeMovies)
		System.out.println(cr);
	}
}