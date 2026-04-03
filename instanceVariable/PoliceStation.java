class PoliceStation
{
    String policeStations[] = new String[16];
    int index;
    public boolean addPoliceStation(String policeStation)
    {
        boolean isPoliceStationAdded = false;
        if(policeStation != null && !policeStation.isEmpty())
        {
            policeStations[index++] = policeStation;
            isPoliceStationAdded = true;
        }
        else
        {
            System.out.println(policeStation + " is invalid");
        }

        return isPoliceStationAdded;
    }
    public void getPoliceStation()
    {
        System.out.println("Get Method is Added");

        for(String policeStation : policeStations)
        {
            System.out.println(policeStation);
        }
    }
}