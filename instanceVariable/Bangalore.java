class Bangalore
{
	int pincodes[]=new int[7];
	int index;
	public boolean addpincodes(int pincode)
	{
		boolean isPincodeAdded=false;
		if(index<pincodes.length)
		{
			if(pincode!=0 && pincode>0)
			{
				pincodes[index++]=pincode;
				isPincodeAdded=true;
			}
			else
			{
				System.out.println(pincodes + "is invalid");
			}
		}
		else{
			System.out.println("Index is Full");
		}
		return isPincodeAdded;
	}
		public void getPincode()
		{
			System.out.println("Get Method is Started");
			for(int pincode:pincodes)
			{
				System.out.println(pincode);
			}
		}
	}
}