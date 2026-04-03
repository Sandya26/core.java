class TripExecutor
{
    public static void main(String args[])
    {
        Trip ref = new Trip();
        boolean added = ref.addTripDetails("Mysore");
        System.out.println(added);

        added = ref.addTripDetails("Coorg");
        System.out.println(added);

        added = ref.addTripDetails("Ooty");
        System.out.println(added);

        added = ref.addTripDetails("Goa");
        System.out.println(added);

        added = ref.addTripDetails("Manali");
        System.out.println(added);

        added = ref.addTripDetails("Shimla");
        System.out.println(added);

        added = ref.addTripDetails("Kerala");
        System.out.println(added);

        added = ref.addTripDetails("Jaipur");
        System.out.println(added);

        added = ref.addTripDetails("Delhi");
        System.out.println(added);

        added = ref.addTripDetails("Agra");
        System.out.println(added);

        added = ref.addTripDetails("Darjeeling");
        System.out.println(added);

        added = ref.addTripDetails("Ladakh");
        System.out.println(added);

        added = ref.addTripDetails("Andaman");
        System.out.println(added);

        ref.getTripDetails();
    }
}