class Nurse
{
	public static void basicCheck(String patientName,String Symptom,boolean isBP,boolean isSugar)
	{
		System.out.println("Basic Check Method is Started");
		Doctor.treat(patientName,Symptom);
		System.out.println("Basic Check Method is Ended");
	}
}