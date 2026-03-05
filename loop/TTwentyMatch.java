class TTwentyMatch
{
	public static void main(String args[])
	{
		String ind="IND";
		String usa="USA";
		String pak="PAK";
		String ned="NED";
		String nam="NAM";
		String GroupA[]={ind,usa,pak,ned,nam};
		String sl="SL";
		String zim="ZIM";
		String aus="AUS";
		String ire="IRE";
		String oma="OMA";
		String GroupB[]={sl,zim,aus,ire,oma};
		String wi="WI";
		String eng="ENG";
		String sco="SCO";
		String ita="ITA";
		String nep="NEP";
		String GroupC[]={wi,eng,sco,ita,nep};
		String sa="SA";
		String nz="NZ";
		String afg="AFG";
		String uae="UAE";
		String can="CAN";
		String GroupD[]={sa,nz,afg,uae,can};
		for(String groupa:GroupA)
		{
			System.out.println(groupa);
		}
		System.out.println("------------------");
		for(String groupb:GroupB)
		{
			System.out.println(groupb);
		}
		System.out.println("------------------");
		for(String groupc:GroupC)
		{
			System.out.println(groupc);
		}
		System.out.println("------------------");
		for(String groupd:GroupD)
		{
			System.out.println(groupd);
		}
		System.out.println("------------------");
	}
}