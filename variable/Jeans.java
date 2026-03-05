class Jeans
{
	static long prize;
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
	static	String genericName;
	public static void main(String args[])
	{
		prize=800L;
		productDimensions=" 30.5 x 25.5 x 2.5 cm; 650 g";
		dateFirstAvailable="16 October 2023";
		asin="B0CL4JNDGT";
		itemModelNumber="UKJEN0293";
		countryOfOrigin="India";
		department="Boys";
		manufacturer="Arvind Fashions Limited, Duparc Trinity, MG Road, Bengaluru - 560001, Arvind Fashions Limited, Duparc Trinity, MG Road, Bengaluru - 560001";
		packer="Arvind Fashions Limited, Duparc Trinity, MG Road, Bengaluru - 560001";
		importer="Arvind Fashions Limited, Duparc Trinity, MG Road, Bengaluru - 560001";
		itemWeight="650 g";
		itemDimensionsLxWxH=" 17 x 8.5 x 10 Centimeters";
		genericName="Sneaker";
		System.out.println("Jeans Prize is: "+prize);
		System.out.println("Product Dimensions is: "+productDimensions);
		System.out.println("Date First Available is: "+dateFirstAvailable);
		System.out.println("ASIN is: "+asin);
		System.out.println("Item model number is: "+itemModelNumber);
		System.out.println("Country of Origin is: "+countryOfOrigin);
		System.out.println("Department is: "+department);
		System.out.println("Manufacturer is: "+manufacturer);
		System.out.println("Item Weight is: "+itemWeight);
		System.out.println("Item Dimensions LxWxH is: "+itemDimensionsLxWxH);
		System.out.println("Generic Name is: "+genericName);
	}
}