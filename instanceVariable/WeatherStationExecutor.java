class WeatherStationExecutor
{
    public static void main(String args[])
    {
        WeatherStation ref = new WeatherStation();
        boolean added = ref.addWeatherStation("28°C");
        System.out.println(added);

        added = ref.addWeatherStation("30°C");
        System.out.println(added);

        added = ref.addWeatherStation("27°C");
        System.out.println(added);

        added = ref.addWeatherStation("29°C");
        System.out.println(added);

        added = ref.addWeatherStation("31°C");
        System.out.println(added);

        added = ref.addWeatherStation("26°C");
        System.out.println(added);

        added = ref.addWeatherStation("25°C");
        System.out.println(added);

        added = ref.addWeatherStation("32°C");
        System.out.println(added);

        added = ref.addWeatherStation("33°C");
        System.out.println(added);

        added = ref.addWeatherStation("34°C");
        System.out.println(added);

        added = ref.addWeatherStation("35°C");
        System.out.println(added);

        added = ref.addWeatherStation("36°C");
        System.out.println(added);

        added = ref.addWeatherStation("37°C");
        System.out.println(added);

        added = ref.addWeatherStation("38°C");
        System.out.println(added);

        added = ref.addWeatherStation("39°C");
        System.out.println(added);

        added = ref.addWeatherStation("40°C");
        System.out.println(added);

        added = ref.addWeatherStation("41°C");
        System.out.println(added);

        ref.getWeatherStation();
    }
}