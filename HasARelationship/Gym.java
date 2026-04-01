class Gym {
    int gymId;
    String gymName;
    String location;
    String timing;
    double membershipFee;
    Trainer trainer;
    public void getGymDetails() {
        System.out.println("the gym Id is " + gymId);
        System.out.println("the gym Name is " + gymName);
        System.out.println("the gym location is " + location);
        System.out.println("the gym timing is " + timing);
        System.out.println("the gym membershipFee is " + membershipFee);
		System.out.println("-------");
        trainer.getTrainerDetails();
    }
}