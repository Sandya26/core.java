class Hospital
{
	public static void bookAppointment(String patientName,String Symptom)
	{
		System.out.println("Book Appointment Method is Started");
		Nurse.basicCheck(patientName,Symptom,true,false);
		System.out.println("Book Appointment Method is Ended");
	}
}