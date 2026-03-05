class NewiPad
{
	static long prize;
	static String productDimensions;
	static String specialFeatures;
	static String formFactor;
	static String colour;
	static String manufacturer;
	static String countryOfOrigin;
	static String itemWeight;
	public static void main(String args[])
	{
		prize=1699L;
		productDimensions="27*20*2cm;200g";
		specialFeatures="Anti-Yellowing & Anti-Fingerprint, Auto Wake/Sleep Function, Slim Fit & Lightweight Design, Translucent Matte Hard PC Back, Tri-fold Stand with Dual Angles";
		formFactor="Case";
		colour="Pink";
		manufacturer="4UBonLife";
		countryOfOrigin="China";
		itemWeight="200g";
		System.out.println("Prize of the iPad is:" +prize);
		System.out.println("iPad Product Dimensions is:" +productDimensions);
		System.out.println("iPad Special Features is:" +specialFeatures);
		System.out.println("iPad Form Factor is:" +formFactor);
		System.out.println("iPad Colour is:" +colour);
		System.out.println("iPad Manufacturer is:" +manufacturer);
		System.out.println("iPad Country Of Origin is:" +countryOfOrigin);
		System.out.println("iPad Item Weight is:" +itemWeight);
	}
}