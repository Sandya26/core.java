class Door {
    int doorId;
    String material;
    String color;
    double height;
    String doorType;
    Lock lock;
    public void getDoorDetails() {
        System.out.println("the door Id is " + doorId);
        System.out.println("the door material is " + material);
        System.out.println("the door color is " + color);
        System.out.println("the door height is " + height);
        System.out.println("the door type is " + doorType);
		System.out.println("-------");
        lock.getLockDetails();
    }
}