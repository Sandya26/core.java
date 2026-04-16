class Table2021
{
	Team2021 teams[];
	
	public void getTable2021Details()
	{
		for(Team2021 t : teams)
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
		for(Team2021 t1 : teams)
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
	}
}