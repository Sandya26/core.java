class Ipl2024Runner
{
	public static void main(String[] ie)
	{
		String pbks2[]={"won","loss","loss","won","loss"};
		String rcb2[]={"won","won","won","won","won"};
		String gt2[]={"loss","loss","won","not played","not played"};
		String mi2[]={"loss","loss","won","loss","loss"};
		String dc2[]={"won","loss","won","loss","won"};
		String srh2[]={"won","loss","won","not played","won"};
		String lsg2[]={"won","loss","loss","loss","won"};
		String kkr2[]={"won","won","won","not played","not played"};
		String rr2[]={"loss","loss","loss","loss","not played"};
		String csk2[]={"loss","won","loss","won","loss"};
			
		Team2024 team11=new Team2024();
		team11.name="PBKS";
		team11.playedMatches=14;
		team11.won=5;
		team11.loss=9;
		team11.nrr=0.353;
		team11.points=10;
		team11.last5=pbks2;
		
		Team2024 team12=new Team2024();
		team12.name="RCB";
		team12.playedMatches=14;
		team12.won=7;
		team12.loss=7;
		team12.nrr=0.459;
		team12.points=14;
		team12.last5=rcb2;
		
		Team2024 team13=new Team2024();
		team13.name="GT";
		team13.playedMatches=14;
		team13.won=5;
		team13.loss=7;
		team13.nrr=0.1063;
		team13.points=12;
		team13.last5=gt2;
		
		Team2024 team14=new Team2024();
		team14.name="MI";
		team14.playedMatches=14;
		team14.won=4;
		team14.loss=10;
		team14.nrr=0.318;
		team14.points=8;
		team14.last5=mi2;
		
		Team2024 team15=new Team2024();
		team15.name="DC";
		team15.playedMatches=14;
		team15.won=7;
		team15.loss=7;
		team15.nrr=0.377;
		team15.points=14;
		team15.last5=dc2;
		
		Team2024 team16=new Team2024();
		team16.name="SRH";
		team16.playedMatches=14;
		team16.won=8;
		team16.loss=5;
		team16.nrr=0.414;
		team16.points=17;
		team16.last5=srh2;
		
		Team2024 team17=new Team2024();
		team17.name="LSG";
		team17.playedMatches=14;
		team17.won=7;
		team17.loss=7;
		team17.nrr=0.667;
		team17.points=14;
		team17.last5=lsg2;
		
		Team2024 team18=new Team2024();
		team18.name="KKR";
		team18.playedMatches=14;
		team18.won=9;
		team18.loss=3;
		team18.nrr=1.428;
		team18.points=20;
		team18.last5=kkr2;
		
		Team2024 team19=new Team2024();
		team19.name="RR";
		team19.playedMatches=14;
		team19.won=8;
		team19.loss=5;
		team19.nrr=0.273;
		team19.points=17;
		team19.last5=rr2;
		
		Team2024 team20=new Team2024();
		team20.name="CSK";
		team20.playedMatches=14;
		team20.won=4;
		team20.loss=10;
		team20.nrr=0.647;
		team20.points=8;
		team20.last5=csk2;
		
		Team2024 teams2[]=new Team2024[10];
		teams2[0]=team11;
		teams2[1]=team12;
		teams2[2]=team13;
		teams2[3]=team14;
		teams2[4]=team15;
		teams2[5]=team16;
		teams2[6]=team17;
		teams2[7]=team18;
		teams2[8]=team19;
		teams2[9]=team20;
		 
		Table2024 table1 =new Table2024();
		table1.teams = teams2;
		
		Season2024 season1=new Season2024();
		season1.table = table1;
			
		Ipl2024 ipl1=new Ipl2024();
		ipl1.season = season1;
		
		ipl1.getIpl2024Details();
	}
}