class AdithyaBirlaGroup {
    int groupId;
    String groupName;
    String sector;
    String headquarters;
    double revenue;
    RCB rcb;
    public void getGroupDetails() {
        System.out.println("the group Id is " + groupId);
        System.out.println("the group Name is " + groupName);
        System.out.println("the group sector is " + sector);
        System.out.println("the group headquarters is " + headquarters);
        System.out.println("the group revenue is " + revenue);
		System.out.println("-------");
        rcb.getRCBDetails();
    }
}

