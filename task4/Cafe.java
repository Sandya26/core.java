class Cafe
{
	static String teaNames[]={"Masala Chaha","Normal Chaha","Lemon Chaha","Elachi Chaha","Ginger Chaha","Green Chaha",""};
	static String coffeeNames[]={"Lattes","Cappuccino","Americanos","Mocha","Long Black",
		"Black Coffee","Cold Brew","Red Eye","Irish Coffee","Turkish Coffee",
		"Arabica","Robusta","Liberica","Excelsa"};
	static String snacksNames[]={"Nuts","Greek yogurt","Apple slices with peanut butter",
		"Veggie stick with hummus","Protein-Packed","Chips","Indian Snack"};
	public static void main(String args[])
	{
		getteaNames();
		getcoffeeNames();
		getsnacksNames();
	}
	static void getteaNames()
	{
		System.out.println("TeaNames are: ");
		for(String tn:teaNames)
		{
			System.out.println(tn);
		}
	}
	static void getcoffeeNames()
	{
		System.out.println("CoffeeNames are: ");
		for(String cn:coffeeNames)
		{
			System.out.println(cn);
		}
	}
	static void getsnacksNames()
	{
		System.out.println("SnacksNames are:");
		for(String sn:snacksNames)
		{
			System.out.println(sn);
		}
	}
}