class IbaccoExecutor
{
	public static void main(String args[])
	{
		Ibacco ref=new Ibacco();
		boolean added=ref.addIceCream("Butterscotch");
		System.out.println(added);
		
		added=ref.addIceCream("Vanila");
		System.out.println(added);
		
		added=ref.addIceCream("Chocolate");
		System.out.println(added);
		
		added =ref.addIceCream("Mint Chocolate Chip");
		System.out.println(added);
		
		added =ref.addIceCream("Mango");
		System.out.println(added);
		
		added =ref.addIceCream("Matcha");
		System.out.println(added);
		
		added =ref.addIceCream("Cotton Candy");
		System.out.println(added);
		
		added =ref.addIceCream("Peanut Butter");
		System.out.println(added);
		
		added =ref.addIceCream("Raspberry Ripple");
		System.out.println(added);
		
		added =ref.addIceCream("Coconut");
		System.out.println(added);
		
		
		
		ref.getIceCreams();
		
	}
}
