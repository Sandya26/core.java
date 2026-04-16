class Table
{
	Team teams[] = new Team[10];
	
	public void getTableDetails()
	{
		for(Team t : teams)
		{
			System.out.println("-----IPL Details-----");
			System.out.println("Name of the team: "+t.name);
            System.out.println("Number of matches played: "+t.playedMatches);
            System.out.println("Won Matches: "+t.won);
            System.out.println("Lost Matches: "+t.loss);
            System.out.println("Team Net Run Rate: "+t.nrr);
            System.out.println("Team points: "+t.points);
            
            System.out.print("Last 5 matches: ");
            for(String s : t.last5)
            {
                System.out.print(s+" ");
            }
            System.out.println("\n");
		}
	/*	for(Team t1 : teams)
		{
			System.out.println("-----IPL Details-----");
			System.out.println("Name of the team: "+t1.name);
            System.out.println("Number of matches played: "+t1.playedMatches);
            System.out.println("Won Matches: "+t1.won);
            System.out.println("Lost Matches: "+t1.loss);
            System.out.println("Team Net Run Rate: "+t1.nrr);
            System.out.println("Team points: "+t1.points);
            
            System.out.print("Last 5 matches: ");
            for(String s1 : t1.last5)
            {
                System.out.print(s1+" ");
            }
            System.out.println("\n");
		}
		for(Team t2 : teams)
		{
			System.out.println("-----IPL Details-----");
			System.out.println("Name of the team: "+t2.name);
            System.out.println("Number of matches played: "+t2.playedMatches);
            System.out.println("Won Matches: "+t2.won);
            System.out.println("Lost Matches: "+t2.loss);
            System.out.println("Team Net Run Rate: "+t2.nrr);
            System.out.println("Team points: "+t2.points);
            
            System.out.print("Last 5 matches: ");
            for(String s2 : t2.last5)
            {
                System.out.print(s2+" ");
            }
            System.out.println("\n");
		}
		for(Team t3 : teams)
		{
			System.out.println("-----IPL Details-----");
			System.out.println("Name of the team: "+t3.name);
            System.out.println("Number of matches played: "+t3.playedMatches);
            System.out.println("Won Matches: "+t3.won);
            System.out.println("Lost Matches: "+t3.loss);
            System.out.println("Team Net Run Rate: "+t3.nrr);
            System.out.println("Team points: "+t3.points);
            
            System.out.print("Last 5 matches: ");
            for(String s3 : t3.last5)
            {
                System.out.print(s3+" ");
            }
            System.out.println("\n");
		}
		for(Team t4 : teams)
		{
			System.out.println("-----IPL Details-----");
			System.out.println("Name of the team: "+t4.name);
            System.out.println("Number of matches played: "+t4.playedMatches);
            System.out.println("Won Matches: "+t4.won);
            System.out.println("Lost Matches: "+t4.loss);
            System.out.println("Team Net Run Rate: "+t4.nrr);
            System.out.println("Team points: "+t4.points);
            
            System.out.print("Last 5 matches: ");
            for(String s4 : t4.last5)
            {
                System.out.print(s4+" ");
            }
            System.out.println("\n");
		}
		for(Team t5 : teams)
		{
			System.out.println("-----IPL Details-----");
			System.out.println("Name of the team: "+t5.name);
            System.out.println("Number of matches played: "+t5.playedMatches);
            System.out.println("Won Matches: "+t5.won);
            System.out.println("Lost Matches: "+t5.loss);
            System.out.println("Team Net Run Rate: "+t5.nrr);
            System.out.println("Team points: "+t5.points);
            
            System.out.print("Last 5 matches: ");
            for(String s5 : t5.last5)
            {
                System.out.print(s5+" ");
            }
            System.out.println("\n");
		}
		for(Team t6 : teams)
		{
			System.out.println("-----IPL Details-----");
			System.out.println("Name of the team: "+t6.name);
            System.out.println("Number of matches played: "+t6.playedMatches);
            System.out.println("Won Matches: "+t6.won);
            System.out.println("Lost Matches: "+t6.loss);
            System.out.println("Team Net Run Rate: "+t6.nrr);
            System.out.println("Team points: "+t6.points);
            
            System.out.print("Last 5 matches: ");
            for(String s6 : t6.last5)
            {
                System.out.print(s6+" ");
            }
            System.out.println("\n");
		} */
	}
    

}