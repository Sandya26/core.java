class Episode {
    int episodeId;
    String episodeTitle;
    int duration;
    String airDate;
    double episodeRating;
    public void getEpisodeDetails() {
        System.out.println("the episode Id is " + episodeId);
        System.out.println("the episode Title is " + episodeTitle);
        System.out.println("the episode duration is " + duration);
        System.out.println("the episode airDate is " + airDate);
        System.out.println("the episode rating is " + episodeRating);
    }
}