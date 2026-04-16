class Ipl2025Runner
{
	public static void main(String[] ie)
	{
		String pbks1[]={"won","won","won","loss","won"};
		String rcb1[]={"won","won","not played","loss","won"};
		String gt1[]={"won","won","won","loss","loss"};
		String mi1[]={"won","won","won","loss","loss"};
		String dc1[]={"loss","not played","loss","loss","won"};
		String srh1[]={"loss","not played","won","won","won"};
		String lsg1[]={"loss","loss","loss","won","loss"};
		String kkr1[]={"won","won","loss","not played","loss"};
		String rr1[]={"won","loss","loss","loss","won"};
		String csk1[]={"loss","loss","won","loss","won"};
			
		Team2025 team1=new Team2025();
		team1.name="PBKS";
		team1.playedMatches=14;
		team1.won=9;
		team1.loss=4;
		team1.nrr=0.372;
		team1.points=19;
		team1.last5=pbks1;
		
		Team2025 team2=new Team2025();
		team2.name="RCB";
		team2.playedMatches=14;
		team2.won=9;
		team2.loss=4;
		team2.nrr=0.301;
		team2.points=19;
		team2.last5=rcb1;
		
		Team2025 team3=new Team2025();
		team3.name="GT";
		team3.playedMatches=14;
		team3.won=9;
		team3.loss=5;
		team3.nrr=0.254;
		team3.points=18;
		team3.last5=gt1;
		
		Team2025 team4=new Team2025();
		team4.name="MI";
		team4.playedMatches=14;
		team4.won=8;
		team4.loss=6;
		team4.nrr=1.142;
		team4.points=16;
		team4.last5=mi1;
		
		Team2025 team5=new Team2025();
		team5.name="DC";
		team5.playedMatches=14;
		team5.won=7;
		team5.loss=6;
		team5.nrr=0.011;
		team5.points=15;
		team5.last5=dc1;
		
		Team2025 team6=new Team2025();
		team6.name="SRH";
		team6.playedMatches=14;
		team6.won=6;
		team6.loss=7;
		team6.nrr=0.241;
		team6.points=13;
		team6.last5=srh1;
		
		Team2025 team7=new Team2025();
		team7.name="LSG";
		team7.playedMatches=14;
		team7.won=6;
		team7.loss=8;
		team7.nrr=0.305;
		team7.points=12;
		team7.last5=lsg1;
		
		Team2025 team8=new Team2025();
		team8.name="KKR";
		team8.playedMatches=4;
		team8.won=1;
		team8.loss=3;
		team8.nrr=0.772;
		team8.points=2;
		team8.last5=kkr1;
		
		Team2025 team9=new Team2025();
		team9.name="RR";
		team9.playedMatches=14;
		team9.won=4;
		team9.loss=10;
		team9.nrr=0.549;
		team9.points=8;
		team9.last5=rr1;
		
		Team2025 team10=new Team2025();
		team10.name="CSK";
		team10.playedMatches=14;
		team10.won=4;
		team10.loss=10;
		team10.nrr=0.647;
		team10.points=8;
		team10.last5=csk1;
		
		Team2025 teams1[]=new Team2025[10];
		teams1[0]=team1;
		teams1[1]=team2;
		teams1[2]=team3;
		teams1[3]=team4;
		teams1[4]=team5;
		teams1[5]=team6;
		teams1[6]=team7;
		teams1[7]=team8;
		teams1[8]=team9;
		teams1[9]=team10;
		 
		Table2025 table1 =new Table2025();
		table1.teams = teams1;
		
		Season2025 season1=new Season2025();
		season1.table = table1;
			
		Ipl2025 ipl1=new Ipl2025();
		ipl1.season = season1;
		
		ipl1.getIpl2025Details();
	}
}