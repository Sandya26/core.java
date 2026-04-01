class Factory {
    int factoryId;
    String factoryName;
    String industry;
    String location;
    int workers;
    Machine machine;
    public void getFactoryDetails() {
        System.out.println("the factory Id is " + factoryId);
        System.out.println("the factory Name is " + factoryName);
        System.out.println("the factory industry is " + industry);
        System.out.println("the factory location is " + location);
        System.out.println("the factory workers is " + workers);
		System.out.println("-------");
        machine.getMachineDetails();
    }
}