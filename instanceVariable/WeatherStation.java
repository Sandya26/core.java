class WeatherStation
{
    String temparatureReadings[] = new String[6];
    int index;
    public boolean addWeatherStation(String temparatureReading)
    {
        boolean isWeatherStationAdded = false;

        if(temparatureReadings != null && !temparatureReading.isEmpty())
        {
            if(index < temparatureReadings.length)
            {
                temparatureReadings[index++] = temparatureReading;
                isWeatherStationAdded = true;
            }
            else
            {
                System.out.println("Weather station list is full");
            }
        }
        else
        {
            System.out.println(temparatureReading + " is invalid");
        }

        return isWeatherStationAdded;
    }
    public void getWeatherStation()
    {
        System.out.println("Weather Station Details:");

        for(String temparatureReading : temparatureReadings)
        {
            System.out.println(temparatureReading);
        }
    }
}