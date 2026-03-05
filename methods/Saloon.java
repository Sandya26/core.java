class Saloon
{
	static String departments[]={"Hair Styling","Skin Care","Nail Technology","Makeup","Waxing Treatments"};
	public static void getdepartments()
	{
		System.out.println("Saloon Departments are Started");
		for(String de:departments)
		{
			System.out.println(de);
			System.out.println("Saloon Departments are Ended");
		}
		
	}
	/*static String departments[]={"Clinical","Surgical","Diagnostic","Administrative"};
	public static void getdepartments()
	{
	
			System.out.println("Departments are initialized");
			for(String department: departments)
			{
				System.out.println(department);
			}
			System.out.println("Departments are ended");
			
	}*/
}