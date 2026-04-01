class Platform 
{
    int platformNumber;
    String trainName;
    String arrivalTime;
    String departureTime;
    String status;

    public void getPlatformDetails() 
	{
        System.out.println("the platform platformNumber is " + platformNumber);
        System.out.println("the platform trainName is " + trainName);
        System.out.println("the platform arrivalTime is " + arrivalTime);
        System.out.println("the platform departureTime is " + departureTime);
        System.out.println("the platform status is " + status);
    }
}