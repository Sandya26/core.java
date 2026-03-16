class PhonePay
{
	static double searchInsurancePremium(String insuranceName)
	{
		System.out.println("insurance primium invoked");
		if(insuranceName=="HDFE")
		{
		return 8008.77;
		}
		else if(insuranceName=="Star")
		{
		return 368.78;
		}
		else if(insuranceName=="lic")
		{
		return 3896.22;
		}
		else if(insuranceName=="icici")
		{
		return 4075.56;
		}
		else
		{
		return 4375.56;
		}
		
	}
	
}