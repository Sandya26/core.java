class Briefcase
{
	static long prize;
	static	boolean isDiscontinuedByManufacturer;
	static	String productDimensions;
	static	String dateFirstAvailable;
	static	String asin;
	static	String itemModelNumber;
	static	String countryOfOrigin;
	static	String department;
	static	String manufacturer;
	static	String packer;
	static	String importer;
	static	String itemWeight;
	static	String itemDimensionsLxWxH;
	static	String netQuantity;
	static String includedComponents;
	static String genericName;
	public static void main(String args[])
	{
		prize=14880L;
		isDiscontinuedByManufacturer=false;
		productDimensions=" 43 x 10.5 x 32 cm; 1 kg";
		dateFirstAvailable=" 3 June 2020";
		asin="B089MCCTZH";
		itemModelNumber="BRF706BR";
		countryOfOrigin="India";
		department="Unisex";
		manufacturer="HINDUSTAN FOAM 9831172714, Hindustan Foam";
		packer="HINDUSTAN FOAM, 16M GOLAM JILANI KHAN ROAD, KOLKATA 700039,9831172714";
		importer="HINDUSTAN FOAM, 16M GOLAM JILANI KHAN ROAD, KOLKATA 700039,9831172714";
		itemWeight="1 kg";
		itemDimensionsLxWxH=" 43 x 10.5 x 32 Centimeters";
		netQuantity="1.00 Count";
		includedComponents="Handbag";
		genericName="Briefcase Bag";
		System.out.println("Briefcase Prize is: "+prize);
		System.out.println("Is Discontinued By Manufacturer is: "+isDiscontinuedByManufacturer);
		System.out.println("Product Dimensions is: "+productDimensions);
		System.out.println("Date First Available is: "+dateFirstAvailable);
		System.out.println("Manufacturer is: "+manufacturer);
		System.out.println("ASIN is: "+asin);
		System.out.println("Item model number is: "+itemModelNumber);
		System.out.println("Country of Origin is: "+countryOfOrigin);
		System.out.println("Department is: "+department);
		System.out.println("Manufacturer is: "+manufacturer);
		System.out.println("Packer is: "+packer);
		System.out.println("Importer is: "+importer);
		System.out.println("Item Weight is: "+itemWeight);
		System.out.println("Item Dimensions LxWxH is: "+itemDimensionsLxWxH);
		System.out.println("Net Quantity is: "+netQuantity);
		System.out.println("Included Components is: "+includedComponents);
		System.out.println("Generic Name is: "+genericName);
	}
}