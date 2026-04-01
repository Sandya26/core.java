class RailwayStation 
{
    int stationId;
    String stationName;
    String city;
    int totalPlatforms;
    String zone;
    Platform platform;

    public void getStationDetails() 
	{
        System.out.println("the station Id is " + stationId);
        System.out.println("the station Name is " + stationName);
        System.out.println("the station city is " + city);
        System.out.println("the station totalPlatforms is " + totalPlatforms);
        System.out.println("the station zone is " + zone);
		System.out.println("-------");
        platform.getPlatformDetails();
    }
}