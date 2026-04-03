class Library
{
	String libraries[]=new String[6];
	int index;
	public boolean addLibrary(String library)
	{
		boolean isLibraryAdded=false;
		if(library!=null && !library.isEmpty())
		{
			libraries[index++]=library;
			isLibraryAdded=true;
		}
		else 
		{
			System.out.println(libraries + "is invalid");
		}
		return isLibraryAdded;
	}
	public void getLibrary()
	{
		System.out.println("Get Method is Added");
		for(String library : libraries)
		{
			System.out.println(library);
		}
	}
}