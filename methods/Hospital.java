class Hospital
{
	static String doctorsName[]={"Dr Praveen Mathew","Dr Nikitha Kairanna","Dr H N Shyla"};
	public static void getdoctorsName()
	{
	
			System.out.println("Doctors Name are Initialized");
			for(String department: doctorsName)
			{
				System.out.println(department);
			}
			System.out.println("Doctors Name are Closed");
			
	}
	/*static String sportNames[]={"Swimming","Football"};
	public static void getSportNames()
	{
	
			System.out.println("sport names is initialized");
			for(String sportName: sportNames)
			{
				System.out.println(sportName);
			}
			System.out.println("Sport Olympics is ended");
			
	}*/
}