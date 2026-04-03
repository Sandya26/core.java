class DigitalZoneExecutive
{
	public static void main(String args[])
	{
		DigitalZones ref=new DigitalZones();
		boolean added=ref.addDigitalZone("Dell");
		System.out.println(added);
		
		added=ref.addDigitalZone("Lenovo");
		System.out.println(added);
		
		added=ref.addDigitalZone("HP");
		System.out.println(added);
		
		added=ref.addDigitalZone("Apple");
		System.out.println(added);
		
		added=ref.addDigitalZone("ASUS");
		System.out.println(added);
		
		added=ref.addDigitalZone("Aser");
		System.out.println(added);
		
		ref.getDigitalZone();
	}
}