class StateElectionExecutor
{
    public static void main(String args[])
    {
        StateElection ref = new StateElection();
        boolean added = ref.addStateElection("Bharatiya Janata Party");
        System.out.println(added);

        added = ref.addStateElection("Indian National Congress");
        System.out.println(added);

        added = ref.addStateElection("Bahujan Samaj Party");
        System.out.println(added);

        added = ref.addStateElection("Communist Party of India");
        System.out.println(added);

        added = ref.addStateElection("Communist Party of India (Marxist");
        System.out.println(added);

        added = ref.addStateElection("Janata Da");
        System.out.println(added);

        added = ref.addStateElection("Samajwadi Party");
        System.out.println(added);

        ref.getStateElection();
    }
}