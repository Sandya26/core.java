class Reception
{
	public static void book(String patientName,String Symptom,String Email,long Mobile)
	{
		System.out.println("Book Method is Started");
		Hospital.bookAppointment(patientName,Symptom);
		System.out.println("Book Method is Ended");
	}
}