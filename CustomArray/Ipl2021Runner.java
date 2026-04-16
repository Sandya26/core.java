class Ipl2021Runner
{
	public static void main(String[] ie)
	{
		String pbks5[]={"won","loss","won","loss","won"};
		String rcb5[]={"won","won","won","loss","won"};
		String mi5[]={"loss","won","loss","won","won"};
		String dc5[]={"won","loss","won","won","loss"};
		String srh5[]={"won","loss","loss","won","loss"};
		String kkr5[]={"loss","won","loss","won","won"};
		String rr5[]={"loss","loss","won","loss","loss"};
		String csk5[]={"won","won","loss","loss","won"};
			
		Team team41=new Team();
		team41.name="PBKS";
		team41.playedMatches=14;
		team41.won=6;
		team41.loss=8;
		team41.nrr=0.001;
		team41.points=12;
		team41.last5=pbks5;
		
		Team team42=new Team();
		team42.name="RCB";
		team42.playedMatches=14;
		team42.won=9;
		team42.loss=5;
		team42.nrr=0.140;
		team42.points=18;
		team42.last5=rcb5;
		
		Team2021 team43=new Team2021();
		team43.name="MI";
		team43.playedMatches=14;
		team43.won=7;
		team43.loss=7;
		team43.nrr=0.116;
		team43.points=14;
		team43.last5=mi5;
		
		Team2021 team44=new Team2021();
		team44.name="DC";
		team44.playedMatches=14;
		team44.won=10;
		team44.loss=4;
		team44.nrr=0.481;
		team44.points=20;
		team44.last5=dc5;
		
		Team2021 team45=new Team2021();
		team45.name="SRH";
		team45.playedMatches=14;
		team45.won=3;
		team45.loss=11;
		team45.nrr=0.545;
		team45.points=6;
		team45.last5=srh5;
		
		Team2021 team46=new Team2021();
		team46.name="KKR";
		team46.playedMatches=14;
		team46.won=7;
		team46.loss=7;
		team46.nrr=0.587;
		team46.points=14;
		team46.last5=kkr5;
		
		Team2021 team47=new Team2021();
		team47.name="RR";
		team47.playedMatches=14;
		team47.won=5;
		team47.loss=9;
		team47.nrr=0.993;
		team47.points=10;
		team47.last5=rr5;
		
		Team2021 team48=new Team2021();
		team48.name="CSK";
		team48.playedMatches=14;
		team48.won=9;
		team48.loss=5;
		team48.nrr=0.455;
		team48.points=18;
		team48.last5=csk5;
		
		Team2021 teams5[]=new Team2021[8];
		teams5[0]=team41;
		teams5[1]=team42;
		teams5[2]=team43;
		teams5[3]=team44;
		teams5[4]=team45;
		teams5[5]=team46;
		teams5[6]=team47;
		teams5[7]=team48;
		 
		Table2021 table5 =new Table2021();
		table.teams = teams;
		
		Season2021 season5=new Season2021();
		season.table = table;
			
		Ipl2021 ipl5=new Ipl2021();
		ipl.season = season;
		 
		ipl.getIpl2021Details();
	}
}