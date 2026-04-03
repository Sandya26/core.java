class CakesExecutor
{
	public static void main(String args[])
	{
		Cakes ref=new Cakes();
		boolean added=ref.addCakes("Chocolate cake");
		System.out.println(added);
		
		added=ref.addCakes("Vanilla Cake");
		System.out.println(added);
		
		added=ref.addCakes("Black Forest");
		System.out.println(added);
		
		added=ref.addCakes("Pineapple cake");
		System.out.println(added);
		
		added=ref.addCakes("Red Velvet");
		System.out.println(added);
		
		ref.getCakes();
	}
}