class Podcast {
    int podcastId;
    String podcastName;
    String host;
    String category;
    int episodes;
    Guest guest;
    public void getPodcastDetails() {
        System.out.println("the podcast Id is " + podcastId);
        System.out.println("the podcast Name is " + podcastName);
        System.out.println("the podcast host is " + host);
        System.out.println("the podcast category is " + category);
        System.out.println("the podcast episodes is " + episodes);
		System.out.println("-------");
        guest.getGuestDetails();
    }
}