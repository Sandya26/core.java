class Spotify
{
    String songs[] = new String[10];
    int index;

    public boolean addSpotify(String song)
    {
        boolean isSpotifyAdded = false;

        if(song != null && !song.isEmpty())
        {
            songs[index++] = song;
            isSpotifyAdded = true;
        }
        else
        {
            System.out.println(song + " is invalid");
        }

        return isSpotifyAdded;
    }

    public void getSpotify()
    {
        System.out.println("Get Method is Added");

        for(String song : songs)
        {
            System.out.println(song);
        }
    }
}