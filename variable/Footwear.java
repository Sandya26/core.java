class Footwear
{
	static long prize;
	static	String productDimensions;
	static	String dateFirstAvailable;
	static	String asin;
	static	String itemModelNumber;
	static	String countryOfOrigin;
	static	String department;
	static	String manufacturer;
	static	String itemWeight;
	static	String itemDimensionsLxWxH;
	static	String netQuantity;
	static	String genericName;
	public static void main(String args[])
	{
		prize=800L;
		productDimensions="17 x 8.5 x 10 cm; 500 g";
		dateFirstAvailable="13 June 2023";
		asin="B0C7W5K3BP";
		itemModelNumber="E13A1Y1108A";
		countryOfOrigin="India";
		department="unisex-child";
		manufacturer="Aretto, Sanosyzo Private Limited - Pune, Maharashtra, 411072";
		itemWeight="500 g";
		itemDimensionsLxWxH=" 17 x 8.5 x 10 Centimeters";
		netQuantity ="1.0 Count";
		genericName="Sneaker";
		System.out.println("Footwear Prize is is: "+prize);
		System.out.println("Product Dimensions is: "+productDimensions);
		System.out.println("Date First Available is: "+dateFirstAvailable);
		System.out.println("ASIN is: "+asin);
		System.out.println("Item model number is: "+itemModelNumber);
		System.out.println("Country of Origin is: "+countryOfOrigin);
		System.out.println("Department is: "+department);
		System.out.println("Manufacturer is: "+manufacturer);
		System.out.println("Item Weight is: "+itemWeight);
		System.out.println("Item Dimensions LxWxH is: "+itemDimensionsLxWxH);
		System.out.println("Net Quantity is: "+netQuantity);
		System.out.println("Generic Name is: "+genericName);
	}
}
