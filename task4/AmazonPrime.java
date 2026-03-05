class AmazonPrime
{
	static String tvShows[]={"Farzi"," The Family Man","Mirzzapur","Panchayat","Paatal Lok","From","F.R.I.E.N.D.S","Suzhal- The Vortex",
		"Aspirants","The Boys","Reacher","Mumbai Diaries","Flames","Fallout","The Big Bang Theory","Made In Heaven","Hostel Daze",
		"Bandish Bandits","Young Sheldon","The Forgotten Army-Azaadi Ke Liye","The Night Manager","Immature",
		"Vadhandhi:The Fable of Velonie","Inside Edge","Supernatural","Happy Family Conditions Apply","The Originals","Marry My Husband",
		"The Mentalist","The Good Doctor"};
	static String mysteryAndThrillerTVShow[]={"Daldal","Stea","Cross","InspectorRishi","Dahaad","Dhootha","The Night Manager","Khauf",
		"Breathe","The Girlfriend","Spine VS Everyone","Breathe: Into The Shadows","Celebrity Hunted: italy","Cruel Intentions",
		"Tom Clancy's Jack Ryan","The Walking Dead: The Ones Who Live","The Walking Dead: Dead City","Newtopia","Pretty Little Liars",
		"Poacher","The Man In The High Castle","Arabia Kadali","The 100","Mouse","Under The Dome","Malice","The Alibi","Arrow","Hush Hush","Inland"};
	static String filmFareAwardWinners[]={"Paatal Lok","Khauf","Call Me Bae","Anagry Young Men","Gram Chikitsalay","Dupahiya","Bandish Bandits","Panchayat",
		"Mirzzapur","The Family Man","Mumbai Diaries","Paatal Lok","Pushpavalli","Dahaad","Jubilee","Cinema Marte Dum Tak","The Forgotten Army",
		"Breathe: Into The Shadows","Beast Games","Cross","Steal","Fallout","Four More Shots Please!","The Darwin Incident","Sandeep Bhaiya","NCIS",
		"Fallout","Bandwalle","MrBeast:Extreme Survival","The Mighty Nein"};
	static String animax[]={"Y School Heroes","Grand Blue","Remake Our Life!","The Foolish Angle Dances With The Devil","Suicide Squad Isekai",
		"Mashile: Magic And Muscles","The Vexations of a Shut-in Vampire Princess","Konosuba -God's Blessing On World","Oshi No Ko","Haikyu",
		"Wind Breaker","Kubo Won't Let Me BE Invisible","Fruits Basket","Fena: Priate Princess","My Deer Friend Nokotan","My Love Story With Yamada-Kun At Lv999",
		"Why Raeliana Ended Up At The Duke's Mansion","D.Gray-Man","Witch Watch","Demon Slayer: Kimetsu No Yaiba","Parallel World Pharmacy","Teasing Master Takagi-San",
		"How a Realist Hero Rebuilt The Kingdom","Campfire Cooking In Another World With My Absurd Skill","Black Clover","Fate/Zero","Fullmetal Alchemist-BrotherHood",
		"The Faraway Paladin","Tsukimichi -Moonlit Fantasy","Crimson Ragna"};
	static String foreignLanguage[]={"El Juego De Las Llaves","S.O.Z:Soliders or Zombies","LOL:LastOne Laughing","Betty La Fea: The Story Continues","Peep Time",
		"Subete a mi Moto","Diablo Guardian","Every Minute Counts","The Legend of El Cid","DOM","El Candidato","Wild And Free","You Are Wanted","Como Sobrevivir Soltero",
		"Ferro","Tokyo Vampire Hotel","Hitoshi Matsumoto Presents Documental","Pan y Circo","Extrano Enemigo","Beat","The Challenge: ETA","September Mornings",
		"The Rings Of Fire","The Wheel Of Time","Legacies","Newtoppia","Mayfair Witches","Carnival Row","The Mighty Nein","Tales of the Walking Dead"};
	static String documentaryMovies[]={"Warfare","Tukaram","Farzand","Flight/Risk","WOMB-Women of My Billion","The Blue Angles","Simple Plan: The Kids in the Crowd",
		"Los TIgers Del Norte: Stories to Tell","Lee Soo Man:King of K-Pop","Finding Harmony: A King's Vision","Chirsty","Laura Pausini=Pleasure to Meet you",
		"Zero Se Restart","Mind Games - The Experiment","OPeration Hope-The Children Lost in the Amazon","Girl You Know It's True","Federer: Twelve Final Days",
		"Zara Larsson-Up Close","My Name is Pauli Murray","Unsrapped: The Story of Lil baby","Generation Wealth","Kids Are Growing Up: a Story About A Kid Named Laroi",
		"Frida","The Boy From Medellin","City of Ghosts","I Am: Celine Dion"};
	public static void main(String args[])
	{
		gettvShows();
		getmysteryAndThrillerTVShow();
		getfilmFareAwardWinners();
		getanimax();
		getforeignLanguage();
		getdocumentaryMovies();
	}
	static void gettvShows()
	{
		System.out.println("TV Shows are: ");
		for(String tv:tvShows)
		{
			System.out.println(tv);
		}
	}
	static void getmysteryAndThrillerTVShow()
	{
		System.out.println("Mystery And Thriller TV Show are: ");
		for(String mt:mysteryAndThrillerTVShow)
		{
			System.out.println(mt);
		}
	}
	static void getfilmFareAwardWinners()
	{
		System.out.println("Film Fare Award Winners are: ");
		for(String fa:filmFareAwardWinners)
		{
			System.out.println(fa);
		}
	}
	static void getanimax()
	{
		System.out.println("Animax are: ");
		for(String a:animax)
		{
			System.out.println(a);
		}
	}
	static void getforeignLanguage()
	{
		System.out.println("Foreign Language are: ");
		for(String fl:foreignLanguage)
		{
			System.out.println(fl);
		}
	}
	static void getdocumentaryMovies()
	{
		System.out.println("Documentary Movies are: ");
		for(String dm:documentaryMovies)
		{
			System.out.println(dm);
		}
	}
}