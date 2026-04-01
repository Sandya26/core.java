class Bangalore {
    int cityId;
    String cityName;
    String state;
    long population;
    String mayor;
    MallofAsia mall;
    public void getBangaloreDetails() {
        System.out.println("the city Id is " + cityId);
        System.out.println("the city Name is " + cityName);
        System.out.println("the city state is " + state);
        System.out.println("the city population is " + population);
        System.out.println("the city mayor is " + mayor);
		System.out.println("-------");
        mall.getMallDetails();
    }
}
