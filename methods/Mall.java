class Mall
{
	static String departments[]={"Retail Department","Dining Option","Entertainment Venues","Services"};
	public static void getdepartments()
	{
		System.out.println("Mall Departments are Initialized");
		for(String dept:departments)
		{
			System.out.println(dept);
			System.out.println("Mall Departments are Ended");
		}
	}
}