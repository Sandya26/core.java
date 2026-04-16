class Ipl2023Runner
{
	public static void main(String[] ie)
	{
		String pbks3[]={"loss","loss","won","loss","loss"};
		String rcb3[]={"loss","loss","won","won","loss"};
		String gt3[]={"won","won","loss","won","won"};
		String mi3[]={"loss","won","won","loss","won"};
		String dc3[]={"won","loss","loss","won","loss"};
		String srh3[]={"won","loss","loss","loss","loss"};
		String lsg3[]={"not played","loss","won","won","won"};
		String kkr3[]={"won","won","loss","won","loss"};
		String rr3[]={"loss","loss","won","loss","won"};
		String csk3[]={"not played","won","won","loss","won"};
			
		Team2023 team21=new Team2023();
		team21.name="PBKS";
		team21.playedMatches=14;
		team21.won=6;
		team21.loss=8;
		team21.nrr=0.304;
		team21.points=12;
		team21.last5=pbks3;
		
		Team2023 team22=new Team2023();
		team22.name="RCB";
		team22.playedMatches=14;
		team22.won=7;
		team22.loss=7;
		team22.nrr=0.135;
		team22.points=14;
		team22.last5=rcb3;
		
		Team2023 team23=new Team2023();
		team23.name="GT";
		team23.playedMatches=14;
		team23.won=10;
		team23.loss=4;
		team23.nrr=0.809;
		team23.points=20;
		team23.last5=gt3;
		
		Team2023 team24=new Team2023();
		team24.name="MI";
		team24.playedMatches=14;
		team24.won=8;
		team24.loss=6;
		team24.nrr=0.044;
		team24.points=16;
		team24.last5=mi3;
		
		Team2023 team25=new Team2023();
		team25.name="DC";
		team25.playedMatches=14;
		team25.won=5;
		team25.loss=9;
		team25.nrr=0.808;
		team25.points=10;
		team25.last5=dc3;
		
		Team2023 team26=new Team2023();
		team26.name="SRH";
		team26.playedMatches=14;
		team26.won=4;
		team26.loss=10;
		team26.nrr=0.590;
		team26.points=8;
		team26.last5=srh3;
		
		Team2023 team27=new Team2023();
		team27.name="LSG";
		team27.playedMatches=14;
		team27.won=8;
		team27.loss=5;
		team27.nrr=0.284;
		team27.points=17;
		team27.last5=lsg3;
		
		Team2023 team28=new Team2023();
		team28.name="KKR";
		team28.playedMatches=14;
		team28.won=6;
		team28.loss=8;
		team28.nrr=0.239;
		team28.points=12;
		team28.last5=kkr3;
		
		Team2023 team29=new Team2023();
		team29.name="RR";
		team29.playedMatches=14;
		team29.won=7;
		team29.loss=7;
		team29.nrr=0.148;
		team29.points=14;
		team29.last5=rr3;
		
		Team2023 team30=new Team2023();
		team30.name="CSK";
		team30.playedMatches=14;
		team30.won=8;
		team30.loss=5;
		team30.nrr=0.652;
		team30.points=17;
		team30.last5=csk3;
		
		Team2023 teams3[]=new Team2023[10];
		teams3[0]=team21;
		teams3[1]=team22;
		teams3[2]=team23;
		teams3[3]=team24;
		teams3[4]=team25;
		teams3[5]=team26;
		teams3[6]=team27;
		teams3[7]=team28;
		teams3[8]=team29;
		teams3[9]=team30;
		 
		Table table3 =new Table();
		table3.teams = teams3;
		
		Season season3=new Season();
		season3.table = table3;
			
		Ipl ipl3=new Ipl();
		ipl3.season = season3;
		
		ipl3.getIpl2023Details();
	}
}