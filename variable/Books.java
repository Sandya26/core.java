class Books
{
	static long prize;
	static	String publisher;
	static	String publicationDate;
	static	String language;
	static	String printLength;
	static	String isbn;
	static	String itemWeight;
	static	String dimensions;
	static	String countryOfOrigin;
	static	String netQuantity;
	static	String importer;
	static	String packer;
	static	String genericName;
	public static void main(String args[])
	{
		prize=900L;
		publisher ="Pan Macmillan India";
		publicationDate=" 24 May 2019";
		language="English";
		printLength="384 pages";
		isbn="9386215969";
		itemWeight="0.34 g";
		dimensions ="2.2 x 12.9 x 19.81 cm";
		countryOfOrigin="India";
		netQuantity="1 Count";
		importer ="Pan Macmillan Publishing, 707, 7th Floor, Kailash Building 26, K.G. Marg, New Delhi, Delhi 110001";
		packer="Pan Macmillan Publishing, 707, 7th Floor, Kailash Building 26, K.G. Marg, New Delhi, Delhi 110001";
		genericName ="Book";
		System.out.println("Book prize is: "+prize);
		System.out.println("Publisher is: "+publisher);
		System.out.println("Publication date is: "+publicationDate);
		System.out.println("Language is: "+language);
		System.out.println("Print length is: "+printLength);
		System.out.println("ISBN-10 is: "+isbn);
		System.out.println("Item Weight is: "+itemWeight);
		System.out.println("Dimensions is: "+dimensions);
		System.out.println("Country of Origin is: "+countryOfOrigin);
		System.out.println("Net Quantity is: "+netQuantity);
		System.out.println("Importer is: "+importer);
		System.out.println("Packer is: "+packer);
		System.out.println("Generic Name is: "+genericName);
	}
}