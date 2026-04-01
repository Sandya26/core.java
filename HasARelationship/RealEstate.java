class RealEstate 
{
    int realEstateId;
    String agencyName;
    String ownerName;
    String city;
    String contact;
    Property property;

    public void getRealEstateDetails() 
	{
        System.out.println("the realEstate Id is " + realEstateId);
        System.out.println("the realEstate agencyName is " + agencyName);
        System.out.println("the realEstate ownerName is " + ownerName);
        System.out.println("the realEstate city is " + city);
        System.out.println("the realEstate contact is " + contact);
		System.out.println("-------");
        property.getPropertyDetails();
    }
}