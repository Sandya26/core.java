class Gym
{
	static String departments[]={"Front Memebership","Personal Training","Group Fitness","Facility Maintenance"};
	public static void getdepartmemts()
	{
		System.out.println("Gym Departments are Initialised");
		for(String dept:departments)
		{
			System.out.println(dept);
			System.out.println("Gym Departments are Closed");
		}
	}
}