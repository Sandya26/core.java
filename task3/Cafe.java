class Cafe
{
	public static void main(String args[])
	{
		String cafeName="Cringe Cafe";
		String teaNames[]={"Masala Chaha","Normal Chaha","Lemon Chaha","Elachi Chaha","Ginger Chaha","Green Chaha",""};
		String coffeeNames[]={"Lattes","Cappuccino","Americanos","Mocha","Long Black",
		"Black Coffee","Cold Brew","Red Eye","Irish Coffee","Turkish Coffee",
		"Arabica","Robusta","Liberica","Excelsa"};
		String snacksNames[]={"Nuts","Greek yogurt","Apple slices with peanut butter",
		"Veggie stick with hummus","Protein-Packed","Chips","Indian Snack"};//String amrut=teaNames[0];
		//System.out.println(amrut);
		//for each
		for(String teaName:teaNames)
		{
			System.out.println(teaName);
			System.out.println("-------------");
			
		}
		for(String coffeeName:coffeeNames)
		{
			
			System.out.println(coffeeName);
			System.out.println("-------------");
		}
		for(String snackName:snacksNames)
		{
			
			System.out.println(snackName);
			System.out.println("-------------");
		}
	}
}