class OttPlatform {
    int platformId;
    String platformName;
    String country;
    int totalContent;
    String language;
    Subscription subscription;
    public void getOttDetails() {
        System.out.println("the ottPlatform Id is " + platformId);
        System.out.println("the ottPlatform Name is " + platformName);
        System.out.println("the ottPlatform country is " + country);
        System.out.println("the ottPlatform totalContent is " + totalContent);
        System.out.println("the ottPlatform language is " + language);
		System.out.println("-------");
        subscription.getSubscriptionDetails();
    }
}