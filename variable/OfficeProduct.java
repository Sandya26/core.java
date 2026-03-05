class OfficeProduct
{
	static long prize;
	static String manufacturer;
	static String brand;
	static String modelNumber;
	static String colour;
	static int numberOfItems;
	static String manufacturerPartNumber;
	static String countryOfOrigin;
	public static void main(String args[])
	{
		prize=400L;
		manufacturer="SHUTTLE ART, SHUTTLE ART, vaghanik1071@gmail.com, +91 9624827130";
		brand="Shuttle Art";
		modelNumber="s-dn-02";
		colour="White";
		numberOfItems=1;
		manufacturerPartNumber="S-DN-12";
		countryOfOrigin="India";
		System.out.println("Office Product prize is: "+prize);
		System.out.println("Office Product manufacturer is: "+manufacturer);
		System.out.println("Office Product brand is: "+brand);
		System.out.println("Office Product modelNumber is: "+modelNumber);
		System.out.println("Office Product colour is: "+colour);
		System.out.println("Office Product numberOfItems is: "+numberOfItems);
		System.out.println("Office Product manufacturerPartNumber is: "+manufacturerPartNumber);
		System.out.println("Office Product countryOfOrigin is: "+countryOfOrigin);
	}
}