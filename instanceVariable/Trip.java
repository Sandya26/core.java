class Trip
{
    String places[] = new String[6];
    int index;
    public boolean addTripDetails(String place)
    {
        boolean isTripAdded = false;

        if(place != null && !place.isEmpty())
        {
            if(index < places.length)
            {
                places[index++] = place;
                isTripAdded = true;
            }
            else
            {
                System.out.println("Trip list is full");
            }
        }
        else
        {
            System.out.println(place + " is invalid");
        }

        return isTripAdded;
    }

    public void getTripDetails()
    {
        System.out.println("Trip Details:");

        for(String place : places)
        {
            System.out.println(place);
        }
    }
}