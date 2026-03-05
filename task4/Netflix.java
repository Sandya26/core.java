class Netflix
{
	static String kannadaMovies[]={"Bagheera","Salaar part 1","Kantara","U-turn","Officer On Duty","Shivaji Surathkal",
		"Dia","Operational Gold Fish","Iraivan","Takkar","Garuda Gamana Vrishabha Vahana","KGF Chapter 1",
		"KGF Chapter 2","777Charlie","Aachar & Co","Mayabazar","Gantumotte","Birbal Triogy Case 1","Love Moktail",
		"Hondisi Bareyiri","Trikona","Mooranne Krishnappa","Gandeevadhari Arjuna","Guntur Kaaram","Japan","DSP",
		"Hi Nanna","Rajakumara","Mugaru Male","Vikranth Ronna"};
	static String hindiIndianMovies[]={"Dhurandhar","Saiyaara","hichki","Jolly LLB3","Haq","Sikandar","War 2",
		"Dangal","Sultan","Kathal-A Jackfruit Mystery","Mahavatr Narasimha","Dhadak 2","Deva",
		"Bhool Bhulaiyaa 3","Gangubai Kathiawadi","Laapataa Ladies","Fighter","Dhoom Dhaam",
		"Yeh Jawanni Hai Deewani","Chhaava","Jaat","Inspector Zende","Badmaash Company","Mission Manju",
		"Crew","Chennai Express","Mujhse Dosti Karoge!","The Diplomat","Tehran","Maa","Vadh",
		"Haseen Dillruba","Khufiya","Wild Wild Punjab","Sector 36","Raid 2"};
	static String teluguMovies[]={"Telusa Kada","They Call Him OG","Lucky Baskar","Hi Nanna","Guntur Kaaram",
		"Pushpa","Dasara","Devara","Saripodhaa Sanivaaram","RRR","Pushpa 2","Hit 3","Godfather","Waltair Veerayya",
		"Kushi","Bro","Bhola Shankar","Game Over","Mana Shankara Varaprasad Garu","Anaganaga Oka Raju",
		"Sampradayini Suppini Suddapoosani","Nari Nari Naduma Murari","Psych Siddhartha","The Raja Saab",
		"Nilakanta","Champion","Patang","Annagaru Vostaru","Cheekatilo","Shambhala"};
	static String malayalamMovies[]={"Eko","Kurup","Ullozhukku","Anweshippin Kandethum","Dear Friend","Odum Kuthira Chaadum Kuthira",
		"Kondal","Iratta","Detective Ujjwalan","Irul","Kaapa","Nanpakal Nerathu Mayakkam","Jana Gana Mana","RDX Robert Dony Xavier",
		"Kumari","Nayattu","Minnal Murali","The Teacher","Ayavaashi","Rekha","Vaashi","Attention Please","CBI 5","Padavettu",
		"Thottappan","Vikrithi","Rifle Club","Ariyippu","Pulimada","Maniyarayile Ashokan"};
	static String marathiMovies[]={"Aapla Manus","Baipan Bhari Deva","Ved","Pawankhind","Natsamrat","Katyar Kaljat Ghusali",
		"Thackeray","Anandi Gopal","Ti Saddhya Kay Karte","Chi Va Chi Sau Ka","Killa","Happy Journey","Premachi Gosht",
		"Savita Damodar Paranjpe","Bucketlist","Muramba","Ringan","Mulshi Pattern","Farzand","Naal","Shantala Court Chalo",
		"Fandry","Dr.Kashinath Ghanekar","Court","Deool","Harishchandra's Factory","Choked","Sillu Karupatti","Chola","Jiivi"};
	static String tamilMovies[]={"Stephan","Aaryan","Kaantha","Dude","Maareesan","Revolver Rita","Bison Kaalamaadan","Thug Life",
		"Good Bad Ugly","Retro","Perusu","Oho Enthan Baby","Psycho","Meiyazhagan","DeAr","Maharaja","Amaran","Dragon","Raangi",
		"The Greatest of All Time","Varalaru Mukkiyam","Vidaamuyarchi","Vaathi","Irugapatru","Beast","Visaranai",
		"Nitham Oru Vaanam","Leo","Hey! Sinamika","Doctor"};
	public static void main(String args[])
	{
		getkannadaMovies();
		gethindiIndianMovies();
		getteluguMovies();
		getmalayalamMovies();
		getmarathiMovies();
		gettamilMovies();
	}
	static void getkannadaMovies()
	{
		System.out.println("Kannada Movies are: ");
		for(String km:kannadaMovies)
		{
			System.out.println(km);
		}
	}
	static void gethindiIndianMovies()
	{
		System.out.println("Hindi Indian Movies are: ");
		for(String hm:hindiIndianMovies)
		{
			System.out.println(hm);
		}
	}
	static void getteluguMovies()
	{
		System.out.println("Telugu Movies are: ");
		for(String tm:teluguMovies)
		{
			System.out.println(tm);
		}
	}
	static void getmalayalamMovies()
	{
		System.out.println("Malayalam Movies are: ");
		for(String mm:malayalamMovies)
		{
			System.out.println(mm);
		}
	}
	static void getmarathiMovies()
	{
		System.out.println("Marathi Movies are: ");
		for(String mam:marathiMovies)
		{
			System.out.println(mam);
		}
	}
	static void gettamilMovies()
	{
		System.out.println("Tamil Movies are: ");
		for(String tam:tamilMovies)
		{
			System.out.println(tam);
		}
	}
}