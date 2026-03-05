class ContemporaryFictionAudio
{
	static long prize;
	static	String listeningLength;
	static	String author;
	static	String narrator;
	static	String audibleInReleaseDate;
	static	String publisher;
	static	String programType;
	static	String version;
	static	String language;
	static	String asin;
	public static void main(String args[])
	{
		prize=500L;
		listeningLength="6 hours and 38 minutes";
		author="Prajakta Koli";
		narrator="Prajakta Koli";
		audibleInReleaseDate="23 March 2025";
		publisher="Audible Studios";
		programType="Audiobook";
		version="Unabridged";
		language="English";
		asin="B0DQNLVD8M";
		System.out.println("Contemporary Fiction Audio prize is: "+prize);
		System.out.println("Listening Length is: "+listeningLength);
		System.out.println("Author is: "+author);
		System.out.println("Narrator is: "+narrator);
		System.out.println("Audible.in Release Date is: "+audibleInReleaseDate);
		System.out.println("Publisher is: "+publisher);
		System.out.println("Program Type is: "+programType);
		System.out.println("Version is: "+version);
		System.out.println("Language is: "+language);
		System.out.println("ASIN is: "+asin);
	}
}