class Ipl2022Runner
{
	public static void main(String[] ie)
	{
		String pbks4[]={"won","loss","won","loss","won"};
		String rcb4[]={"loss","won","won","loss","won"};
		String gt4[]={"loss","loss","won","won","loss"};
		String mi4[]={"won","loss","won","loss","won"};
		String dc4[]={"won","loss","won","won","loss"};
		String srh4[]={"loss","loss","loss","won","loss"};
		String lsg4[]={"won","won","loss","loss","won"};
		String kkr4[]={"won","loss","won","won","loss"};
		String rr4[]={"loss","won","loss","won","won"};
		String csk4[]={"not played","won","won","loss","won"};
			
		Team2022 team31=new Team2022();
		team31.name="PBKS";
		team31.playedMatches=14;
		team31.won=7;
		team31.loss=7;
		team31.nrr=0.126;
		team31.points=14;
		team31.last5=pbks4;
		
		Team2022 team32=new Team2022();
		team32.name="RCB";
		team32.playedMatches=14;
		team32.won=8;
		team32.loss=6;
		team32.nrr=0.253;
		team32.points=16;
		team32.last5=rcb4;
		
		Team2022 team33=new Team2022();
		team33.name="GT";
		team33.playedMatches=14;
		team33.won=10;
		team33.loss=4;
		team33.nrr=0.316;
		team33.points=20;
		team33.last5=gt4;
		
		Team2022 team34=new Team2022();
		team34.name="MI";
		team34.playedMatches=14;
		team34.won=4;
		team34.loss=10;
		team34.nrr=0.506;
		team34.points=8;
		team34.last5=mi4;
		
		Team2022 team35=new Team2022();
		team35.name="DC";
		team35.playedMatches=14;
		team35.won=7;
		team35.loss=7;
		team35.nrr=0.204;
		team35.points=14;
		team35.last5=dc4;
		
		Team team36=new Team();
		team36.name="SRH";
		team36.playedMatches=14;
		team36.won=6;
		team36.loss=8;
		team36.nrr=0.379;
		team36.points=12;
		team36.last5=srh4;
		
		Team2022 team37=new Team2022();
		team37.name="LSG";
		team37.playedMatches=14;
		team37.won=9;
		team37.loss=5;
		team37.nrr=0.251;
		team37.points=18;
		team37.last5=lsg4;
		
		Team team38=new Team();
		team38.name="KKR";
		team38.playedMatches=14;
		team38.won=6;
		team38.loss=8;
		team38.nrr=0.146;
		team38.points=12;
		team38.last5=kkr4;
		
		Team2022 team39=new Team2022();
		team39.name="RR";
		team39.playedMatches=14;
		team39.won=9;
		team39.loss=5;
		team39.nrr=0.298;
		team39.points=18;
		team39.last5=rr4;
		
		Team2022 team40=new Team2022();
		team40.name="CSK";
		team40.playedMatches=14;
		team40.won=4;
		team40.loss=10;
		team40.nrr=0.203;
		team40.points=8;
		team40.last5=csk4;
		
		Team2022 teams4[]=new Team2022[10];
		teams4[0]=team31;
		teams4[1]=team32;
		teams4[2]=team33;
		teams4[3]=team34;
		teams4[4]=team35;
		teams4[5]=team36;
		teams4[6]=team37;
		teams4[7]=team38;
		teams4[8]=team39;
		teams4[9]=team40;
		 
		Table2022 table4 =new Table2022();
		table4.teams = teams4;
		
		Season2022 season4=new Season2022();
		season4.table = table4;
			
		Ipl2022 ipl4=new Ipl2022();
		ipl4.season = season;
		
		ipl4.getIpl2022Details();
	}
}