class LibraryExecutor
{
	public static void main(String args[])
	{
		Libraries ref=new Libraries();
		boolean added=ref.addLibrary("Pride and Prejudice");
		System.out.println(added);
		
		added=ref.addLibrary("The Secret Garden");
		System.out.println(added);
		
		added=ref.addLibrary("The Kite Runner");
		System.out.println(added);
		
		added=ref.addLibrary("The Alchemist");
		System.out.println(added);
		
		added=ref.addLibrary("The Silent Patient");
		System.out.println(added);
		
		added=ref.addLibrary("The Midnight Library");
		System.out.println(added);
		
		added=ref.addLibrary("Vegetables");
		System.out.println(added);
		
		added=ref.addLibrary("The Diary of a Young Girl");
		System.out.println(added);
		
		added=ref.addLibrary("To Good To Be True");
		System.out.println(added);
		
		added=ref.addLibrary("The Girl on the Train");
		System.out.println(added);
		
		added=ref.addLibrary("Days At The Morisaki Bookshop");
		System.out.println(added);
		
		added=ref.addLibrary("More Days At The Morisaki Bookshop");
		System.out.println(added);
		
		added=ref.addLibrary("The Palace of Illusion");
		System.out.println(added);
		
		ref.getLibrary();
	}
}