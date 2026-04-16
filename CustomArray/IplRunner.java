class IplRunner
{
	public static void main(String[] ie)
	{
		String rr[]={"won","won","won","won","no"};
		String pbks[]={"won","won","draw","won","not played"};
		String rcb[]={"won","won","loss","won","not played"};
		String srh[]={"loss","won","loss","loss","won"};
		String dc[]={"won","won","loss","loss","not played"};
		String gt[]={"loss","loss","won","won","not played"};
		String lsg[]={"loss","won","won","loss","not played"};
		String mi[]={"won","loss","loss","loss","not played"};
		String csk[]={"loss","loss","loss","won","not played"};
		String kkr[]={"loss","loss","won","loss","not played"};
			
		Team teamOne=new Team();
		teamOne.name="RR";
		teamOne.playedMatches=5;
		teamOne.won=4;
		teamOne.loss=1;
		teamOne.nrr=0.889;
		teamOne.points=8;
		teamOne.last5=rr;
		
		Team teamTwo=new Team();
		teamTwo.name="PBKS";
		teamTwo.playedMatches=4;
		teamTwo.won=3;
		teamTwo.loss=0;
		teamTwo.nrr=0.720;
		teamTwo.points=7;
		teamTwo.last5=pbks;
		
		Team teamThree=new Team();
		teamThree.name="RCB";
		teamThree.playedMatches=4;
		teamThree.won=3;
		teamThree.loss=1;
		teamThree.nrr=1.148;
		teamThree.points=6;
		teamThree.last5=rcb;
		
		Team teamFour=new Team();
		teamFour.name="SRH";
		teamFour.playedMatches=5;
		teamFour.won=2;
		teamFour.loss=3;
		teamFour.nrr=0.576;
		teamFour.points=4;
		teamFour.last5=srh;
		
		Team teamFive=new Team();
		teamFive.name="DC";
		teamFive.playedMatches=4;
		teamFive.won=2;
		teamFive.loss=2;
		teamFive.nrr=0.322;
		teamFive.points=4;
		teamFive.last5=dc;
		
		Team teamSix=new Team();
		teamSix.name="GT";
		teamSix.playedMatches=4;
		teamSix.won=2;
		teamSix.loss=2;
		teamSix.nrr=0.029;
		teamSix.points=4;
		teamSix.last5=gt;
		
		Team teamSeven=new Team();
		teamSeven.name="LSG";
		teamSeven.playedMatches=4;
		teamSeven.won=2;
		teamSeven.loss=2;
		teamSeven.nrr=0.427;
		teamSeven.points=4;
		teamSeven.last5=lsg;
		
		Team teamEight=new Team();
		teamEight.name="MI";
		teamEight.playedMatches=4;
		teamEight.won=1;
		teamEight.loss=3;
		teamEight.nrr=0.772;
		teamEight.points=2;
		teamEight.last5=mi;
		
		Team teamNine=new Team();
		teamNine.name="CSK";
		teamNine.playedMatches=4;
		teamNine.won=1;
		teamNine.loss=3;
		teamNine.nrr=1.532;
		teamNine.points=2;
		teamNine.last5=csk;
		
		Team teamTen=new Team();
		teamTen.name="KKR";
		teamTen.playedMatches=4;
		teamTen.won=0;
		teamTen.loss=3;
		teamTen.nrr=1.315;
		teamTen.points=1;
		teamTen.last5=kkr;
		
		Team teams[]=new Team[10];
		teams[0]=teamOne;
		teams[1]=teamTwo;
		teams[2]=teamThree;
		teams[3]=teamFour;
		teams[4]=teamFive;
		teams[5]=teamSix;
		teams[6]=teamSeven;
		teams[7]=teamEight;
		teams[8]=teamNine;
		teams[9]=teamTen;
		 
		Table table =new Table();
		table.teams = teams;
		
		Season season=new Season();
		season.table = table;
		
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
			
		Team team1=new Team();
		team1.name="PBKS";
		team1.playedMatches=14;
		team1.won=9;
		team1.loss=4;
		team1.nrr=0.372;
		team1.points=19;
		team1.last5=pbks1;
		
		Team team2=new Team();
		team2.name="RCB";
		team2.playedMatches=14;
		team2.won=9;
		team2.loss=4;
		team2.nrr=0.301;
		team2.points=19;
		team2.last5=rcb1;
		
		Team team3=new Team();
		team3.name="GT";
		team3.playedMatches=14;
		team3.won=9;
		team3.loss=5;
		team3.nrr=0.254;
		team3.points=18;
		team3.last5=gt1;
		
		Team team4=new Team();
		team4.name="MI";
		team4.playedMatches=14;
		team4.won=8;
		team4.loss=6;
		team4.nrr=1.142;
		team4.points=16;
		team4.last5=mi1;
		
		Team team5=new Team();
		team5.name="DC";
		team5.playedMatches=14;
		team5.won=7;
		team5.loss=6;
		team5.nrr=0.011;
		team5.points=15;
		team5.last5=dc1;
		
		Team team6=new Team();
		team6.name="SRH";
		team6.playedMatches=14;
		team6.won=6;
		team6.loss=7;
		team6.nrr=0.241;
		team6.points=13;
		team6.last5=srh1;
		
		Team team7=new Team();
		team7.name="LSG";
		team7.playedMatches=14;
		team7.won=6;
		team7.loss=8;
		team7.nrr=0.305;
		team7.points=12;
		team7.last5=lsg1;
		
		Team team8=new Team();
		team8.name="KKR";
		team8.playedMatches=4;
		team8.won=1;
		team8.loss=3;
		team8.nrr=0.772;
		team8.points=2;
		team8.last5=kkr1;
		
		Team team9=new Team();
		team9.name="RR";
		team9.playedMatches=14;
		team9.won=4;
		team9.loss=10;
		team9.nrr=0.549;
		team9.points=8;
		team9.last5=rr1;
		
		Team team10=new Team();
		team10.name="CSK";
		team10.playedMatches=14;
		team10.won=4;
		team10.loss=10;
		team10.nrr=0.647;
		team10.points=8;
		team10.last5=csk1;
		
		Team teams1[]=new Team[10];
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
		 
		Table table1 =new Table();
		table1.teams = teams1;
		
		Season season1=new Season();
		season1.table = table1;
		
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
			
		Team team11=new Team();
		team11.name="PBKS";
		team11.playedMatches=14;
		team11.won=5;
		team11.loss=9;
		team11.nrr=0.353;
		team11.points=10;
		team11.last5=pbks2;
		
		Team team12=new Team();
		team12.name="RCB";
		team12.playedMatches=14;
		team12.won=7;
		team12.loss=7;
		team12.nrr=0.459;
		team12.points=14;
		team12.last5=rcb2;
		
		Team team13=new Team();
		team13.name="GT";
		team13.playedMatches=14;
		team13.won=5;
		team13.loss=7;
		team13.nrr=0.1063;
		team13.points=12;
		team13.last5=gt2;
		
		Team team14=new Team();
		team14.name="MI";
		team14.playedMatches=14;
		team14.won=4;
		team14.loss=10;
		team14.nrr=0.318;
		team14.points=8;
		team14.last5=mi2;
		
		Team team15=new Team();
		team15.name="DC";
		team15.playedMatches=14;
		team15.won=7;
		team15.loss=7;
		team15.nrr=0.377;
		team15.points=14;
		team15.last5=dc2;
		
		Team team16=new Team();
		team16.name="SRH";
		team16.playedMatches=14;
		team16.won=8;
		team16.loss=5;
		team16.nrr=0.414;
		team16.points=17;
		team16.last5=srh2;
		
		Team team17=new Team();
		team17.name="LSG";
		team17.playedMatches=14;
		team17.won=7;
		team17.loss=7;
		team17.nrr=0.667;
		team17.points=14;
		team17.last5=lsg2;
		
		Team team18=new Team();
		team18.name="KKR";
		team18.playedMatches=14;
		team18.won=9;
		team18.loss=3;
		team18.nrr=1.428;
		team18.points=20;
		team18.last5=kkr2;
		
		Team team19=new Team();
		team19.name="RR";
		team19.playedMatches=14;
		team19.won=8;
		team19.loss=5;
		team19.nrr=0.273;
		team19.points=17;
		team19.last5=rr2;
		
		Team team20=new Team();
		team20.name="CSK";
		team20.playedMatches=14;
		team20.won=4;
		team20.loss=10;
		team20.nrr=0.647;
		team20.points=8;
		team20.last5=csk2;
		
		Team teams2[]=new Team[10];
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
		 
		Table table2 =new Table();
		table2.teams = teams2;
		
		Season season2=new Season();
		season2.table = table2;
		
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
			
		Team team21=new Team();
		team21.name="PBKS";
		team21.playedMatches=14;
		team21.won=6;
		team21.loss=8;
		team21.nrr=0.304;
		team21.points=12;
		team21.last5=pbks3;
		
		Team team22=new Team();
		team22.name="RCB";
		team22.playedMatches=14;
		team22.won=7;
		team22.loss=7;
		team22.nrr=0.135;
		team22.points=14;
		team22.last5=rcb3;
		
		Team team23=new Team();
		team23.name="GT";
		team23.playedMatches=14;
		team23.won=10;
		team23.loss=4;
		team23.nrr=0.809;
		team23.points=20;
		team23.last5=gt3;
		
		Team team24=new Team();
		team24.name="MI";
		team24.playedMatches=14;
		team24.won=8;
		team24.loss=6;
		team24.nrr=0.044;
		team24.points=16;
		team24.last5=mi3;
		
		Team team25=new Team();
		team25.name="DC";
		team25.playedMatches=14;
		team25.won=5;
		team25.loss=9;
		team25.nrr=0.808;
		team25.points=10;
		team25.last5=dc3;
		
		Team team26=new Team();
		team26.name="SRH";
		team26.playedMatches=14;
		team26.won=4;
		team26.loss=10;
		team26.nrr=0.590;
		team26.points=8;
		team26.last5=srh3;
		
		Team team27=new Team();
		team27.name="LSG";
		team27.playedMatches=14;
		team27.won=8;
		team27.loss=5;
		team27.nrr=0.284;
		team27.points=17;
		team27.last5=lsg3;
		
		Team team28=new Team();
		team28.name="KKR";
		team28.playedMatches=14;
		team28.won=6;
		team28.loss=8;
		team28.nrr=0.239;
		team28.points=12;
		team28.last5=kkr3;
		
		Team team29=new Team();
		team29.name="RR";
		team29.playedMatches=14;
		team29.won=7;
		team29.loss=7;
		team29.nrr=0.148;
		team29.points=14;
		team29.last5=rr3;
		
		Team team30=new Team();
		team30.name="CSK";
		team30.playedMatches=14;
		team30.won=8;
		team30.loss=5;
		team30.nrr=0.652;
		team30.points=17;
		team30.last5=csk3;
		
		Team teams3[]=new Team[10];
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
			
		Team team31=new Team();
		team31.name="PBKS";
		team31.playedMatches=14;
		team31.won=7;
		team31.loss=7;
		team31.nrr=0.126;
		team31.points=14;
		team31.last5=pbks4;
		
		Team team32=new Team();
		team32.name="RCB";
		team32.playedMatches=14;
		team32.won=8;
		team32.loss=6;
		team32.nrr=0.253;
		team32.points=16;
		team32.last5=rcb4;
		
		Team team33=new Team();
		team33.name="GT";
		team33.playedMatches=14;
		team33.won=10;
		team33.loss=4;
		team33.nrr=0.316;
		team33.points=20;
		team33.last5=gt4;
		
		Team team34=new Team();
		team34.name="MI";
		team34.playedMatches=14;
		team34.won=4;
		team34.loss=10;
		team34.nrr=0.506;
		team34.points=8;
		team34.last5=mi4;
		
		Team team35=new Team();
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
		
		Team team37=new Team();
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
		
		Team team39=new Team();
		team39.name="RR";
		team39.playedMatches=14;
		team39.won=9;
		team39.loss=5;
		team39.nrr=0.298;
		team39.points=18;
		team39.last5=rr4;
		
		Team team40=new Team();
		team40.name="CSK";
		team40.playedMatches=14;
		team40.won=4;
		team40.loss=10;
		team40.nrr=0.203;
		team40.points=8;
		team40.last5=csk4;
		
		Team teams4[]=new Team[10];
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
		 
		Table table4 =new Table();
		table4.teams = teams4;
		
		Season season4=new Season();
		season4.table = table4;
		
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
		
		Team team43=new Team();
		team43.name="MI";
		team43.playedMatches=14;
		team43.won=7;
		team43.loss=7;
		team43.nrr=0.116;
		team43.points=14;
		team43.last5=mi5;
		
		Team team44=new Team();
		team44.name="DC";
		team44.playedMatches=14;
		team44.won=10;
		team44.loss=4;
		team44.nrr=0.481;
		team44.points=20;
		team44.last5=dc5;
		
		Team team45=new Team();
		team45.name="SRH";
		team45.playedMatches=14;
		team45.won=3;
		team45.loss=11;
		team45.nrr=0.545;
		team45.points=6;
		team45.last5=srh5;
		
		Team team46=new Team();
		team46.name="KKR";
		team46.playedMatches=14;
		team46.won=7;
		team46.loss=7;
		team46.nrr=0.587;
		team46.points=14;
		team46.last5=kkr5;
		
		Team team47=new Team();
		team47.name="RR";
		team47.playedMatches=14;
		team47.won=5;
		team47.loss=9;
		team47.nrr=0.993;
		team47.points=10;
		team47.last5=rr5;
		
		Team team48=new Team();
		team48.name="CSK";
		team48.playedMatches=14;
		team48.won=9;
		team48.loss=5;
		team48.nrr=0.455;
		team48.points=18;
		team48.last5=csk5;
		
		Team teams5[]=new Team[8];
		teams5[0]=team41;
		teams5[1]=team42;
		teams5[2]=team43;
		teams5[3]=team44;
		teams5[4]=team45;
		teams5[5]=team46;
		teams5[6]=team47;
		teams5[7]=team48;
		 
		Table table5 =new Table();
		table5.teams = teams5;
		
		Season season5=new Season();
		season5.table = table5;
		
		Season seasons[] = new Season[5];
		seasons[0] = season1;
		seasons[1] = season2;
		seasons[2] = season3;
		seasons[3] = season4;
		seasons[4] = season5;
		
		Ipl ipl=new Ipl();
		ipl.season = seasons;
		 
		ipl.getIplDetails();
	}
}