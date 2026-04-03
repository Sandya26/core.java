class SpotifyExecutor
{
    public static void main(String args[])
    {
        Spotify ref = new Spotify();
        boolean added = ref.addSpotify("Arijit Singh");
        System.out.println(added);

        added = ref.addSpotify("Neha Kakkar");
        System.out.println(added);

        added = ref.addSpotify("Atif Aslam");
        System.out.println(added);

        added = ref.addSpotify("Shreya Ghoshal");
        System.out.println(added);

        added = ref.addSpotify("Armaan Malik");
        System.out.println(added);

        added = ref.addSpotify("Sonu Nigam");
        System.out.println(added);

        added = ref.addSpotify("KK");
        System.out.println(added);

        added = ref.addSpotify("Badshah");
        System.out.println(added);

        added = ref.addSpotify("Darshan Raval");
        System.out.println(added);

        added = ref.addSpotify("Jubin Nautiyal");
        System.out.println(added);

        ref.getSpotify();
    }
}