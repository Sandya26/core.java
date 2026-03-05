class ZeeFive
{
	static String kannadaSerials[]={"Karna","Amruthadare","Aadhi Lakshmi Purana","Shri Ragavendra MAhatme","Bhrhmagant","Lakshmi Nivasa",
		"Aanayya","Gouri","Annapurna","Rajakumari","Shreerastu Shubamastu","Sita Rama","Jodi Hakki","Krishna Rukku","Naa Ninna Bidalare",
		"Shravani Subramanya","Sandhyaraaga","Annapoorna","Punar Vivaha","Shreeman Shreemathi","Jote Joteyalli","Satya","Paru","Kanaka",
		"Gattimela","Kamali","Radha Kalyana","Nagini","Puttakana Makkallu","Sumangali"};
	static String teluguSerials[]={"Jagadhatri","Trinayani","Radhamma Kuthuru","Nindu Noorella Saavasam","Meghasandesam","Intiguttu","Sandyaraga",
		"Mukkupudaka","Kalyana Vaibhogam","Kukuma Bhagayam","Kodallu Meeku","Ammai Garu","Kalyanam Kamaneeyam","Krishna Tulasi","Gundamma Katha",
		"Muthyamantha Muddu","Muddh Mandaram","Prema Entha Madhuram","Agnipariksha","Naga Bhairavi","Suryakatham","Mithai Kottu Chittemma",
		"Oohalu Gusagulade","Padi Padi Leche Manasu","No. 1 Kodallu","Svarna Palace","Jayom","Lakshmi Raave Maalntiki","AutoVijayaShanthi"};
	static String marathiSerial[]={"Sanai Chaughade","Kamali","Tarini","Tula Japanar Ahe","Lakshmi Niwas","Veena Doghantali Hi Tutena","Savlyachi Janu Savali",
		"Adhuri Ek Kahani","Asambhav","Lagira Zala Ji","Vadalvaat","Punha Kartavya Aahae","Dil Dosti Dobara","Jadubai Jorat","Mrs. Mukhyamantri",
		"Majha Hoshile Na","Nanda Saukhya Bhare","Tuja Maza Jamena","Gaav Gata Gajali","Lakhat Ek Aamcha Dada","Navri Mile Hitlerla","Ratris Khel Chale",
		"Abhalmaya","Ajunahi Chand Raat Aahe","Ladachi Me Lek Ga","Vahinisaheb","Yeh Kashi Tashi Me Nandayala","Vaadalvaat","Zing Zing Zingat","Mazya Navryachi Bayko"};
	static String bengaliSerial[]={"Ishti Kutum","Bojhena Se Bojhena","Ke Apon Ke por","Trinayani","Mithai","Krishnakoi","Sreemoyee","Gotachora","Phulmoni","Jol Nupur",
		"Kusum Dola","Aparajita Apu","Gramer Rani Binapani","Netaji","Mahapeeth Tarapeeth","Rani Rashmoni","Kanyadaan","Ekhane Aakash Neel","Bodhisattwer Bodhbuddhi",
		"Bhaggolokkhi","Subarmalata","Irabotir Chupkotha","Seemarekha","Tumi Robe Nirobe","Jibon saathi","Jhanak","Alor Thikana","Kora Pakhi","Manasa","Tomay Amay Mile"};
	static String malayalamSerials[]={"Kudambavilakku","Santhwanam","Mounaragam","Seetha Kalyanam","Kasthooriman","Parasparam","Uppum Mulakum","Chandanamazha","Amala",
		"Neeyum Njanum","Bharya","Ammayariyathe","Sthreepadam","Karthika Deepam","Mrs Hitler","Patharamattu","Geetga Govindam","Thattassery Koottam","Swantham Suhruthu",
		"Vanambadi","Devi Mahathmyam","Karuthamuthu","Kavyaanjali","Manjurukum Kaalam","Sthree","Autograph","Ente Ammu Ninte Thulasi Avarude Chakki","Valkannadi",
		"Shyamambaram","Suryaputhri","MInnykettu","Hridayam"};
	static String hindiSerial[]={"Kumkum Bhagya","Kundali Bhagaya","Bhagaya Lakshmi","Meet","Radha Mohan","Teri Meri Ikk Jindri","Iss Mod Se Jaate Hain",
		"Pyaar Ka Pehla Naam Radha Mohan","Zindagi Ki Mehek","Jamai Raja","Jamai Raja 2","Qurbaan Hua","Ghar Ek Mandir","Pavitra Rishta",
		"Agle Janam Mohe Bitiya Hi Kijo","Kasamh Se","Jhansi Ki Rani","Saat Phere","Yeh Vaada Raha","Kashibai Bajirao Ballal","Abhay",
		"Rangbaaz","Rangbaaz Phirse","Kaafir","Mithya","Jeet Ki Zid","Taish","Duranga","Yeh Rishta Kya Keheltai"};
	public static void main(String args[])
	{
		getkannadaSerials();
		getteluguSerials();
		getmarathiSerial();
		getbengaliSerial();
		getmalayalamSerials();
		gethindiSerial();
	}
	static void  getkannadaSerials()
	{
		System.out.println("Kannada Serials are:");
		for(String ks:kannadaSerials)
		{
			System.out.println(ks);
		}
	}
	static void  getteluguSerials()
	{
		System.out.println("Telugu Serials are:");
		for(String ts:teluguSerials)
		{
			System.out.println(ts);
		}
	}
	static void  getmarathiSerial()
	{
		System.out.println("Marathi Serials are:");
		for(String ms:marathiSerial)
		{
			System.out.println(ms);
		}
	}
	static void  getbengaliSerial()
	{
		System.out.println("Bengali Serial are:");
		for(String bs:bengaliSerial)
		{
			System.out.println(bs);
		}
	}static void  getmalayalamSerials()
	{
		System.out.println("Malayalam Serials are:");
		for(String ms:malayalamSerials)
		{
			System.out.println(ms);
		}
	}
	static void  gethindiSerial()
	{
		System.out.println("Hindi Serial are:");
		for(String hs:hindiSerial)
		{
			System.out.println(hs);
		}
	}
	
}