class Freelancer {
    int freelancerId;
    String freelancerName;
    String skill;
    double hourlyRate;
    String platform;
    Client client;
    public void getFreelancerDetails() {
        System.out.println("the freelancer Id is " + freelancerId);
        System.out.println("the freelancer Name is " + freelancerName);
        System.out.println("the freelancer skill is " + skill);
        System.out.println("the freelancer hourlyRate is " + hourlyRate);
        System.out.println("the freelancer platform is " + platform);
		System.out.println("-------");
        client.getClientDetails();
    }
}
