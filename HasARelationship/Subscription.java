class Subscription {
    int subscriptionId;
    String planName;
    double price;
    int screens;
    String validity;
    public void getSubscriptionDetails() {
        System.out.println("the subscription Id is " + subscriptionId);
        System.out.println("the subscription planName is " + planName);
        System.out.println("the subscription price is " + price);
        System.out.println("the subscription screens is " + screens);
        System.out.println("the subscription validity is " + validity);
    }
}