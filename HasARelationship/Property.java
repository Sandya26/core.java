class Property {
    int propertyId;
    String propertyType;
    double area;
    double price;
    String location;

    public void getPropertyDetails() {
        System.out.println("the property Id is " + propertyId);
        System.out.println("the property type is " + propertyType);
        System.out.println("the property area is " + area);
        System.out.println("the property price is " + price);
        System.out.println("the property location is " + location);
    }
}