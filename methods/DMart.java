class DMart
{
	static String departments[]={"Grocery & Staples","Daily Essentials","General Merchandise"};
	public static void getdepartments()
	{
		System.out.println("DMart Departments are Initialized");
		for(String dept:departments)
		{
			System.out.println(dept);
			System.out.println("DMart Departments are Closed");
			
		}
	}
}