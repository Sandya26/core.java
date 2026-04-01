class Tv {
    int tvId;
    String brand;
    int screenSize;
    String displayType;
    String resolution;
    Remote remote;
    public void getTvDetails() {
        System.out.println("the tv Id is " + tvId);
        System.out.println("the tv brand is " + brand);
        System.out.println("the tv screenSize is " + screenSize);
        System.out.println("the tv displayType is " + displayType);
        System.out.println("the tv resolution is " + resolution);
		System.out.println("-------");
        remote.getRemoteDetails();
    }
}