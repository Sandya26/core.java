class Mobile 
{
    int mobileId;
    String brand;
    String model;
    int ram;
    String color;
    SIM sim;

    public void getMobileDetails() 
	{
        System.out.println("the mobile Id is " + mobileId);
        System.out.println("the mobile brand is " + brand);
        System.out.println("the mobile model is " + model);
        System.out.println("the mobile ram is " + ram);
        System.out.println("the mobile color is " + color);
		System.out.println("-------");
        sim.getSIMDetails();
    }
}