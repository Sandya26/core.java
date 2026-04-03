class StateElection
{
    String stateElections[] = new String[7];
    int index;

    public boolean addStateElection(String stateElection)
    {
        boolean isStateElectionAdded = false;

        if(stateElection != null && !stateElection.isEmpty())
        {
            stateElections[index++] = stateElection;
            isStateElectionAdded = true;
        }
        else
        {
            System.out.println(stateElection + " is invalid");
        }

        return isStateElectionAdded;
    }

    public void getStateElection()
    {
        System.out.println("Get Method is Added");

        for(String stateElection : stateElections)
        {
            System.out.println(stateElection);
        }
    }
}