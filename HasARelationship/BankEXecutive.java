class BankEXecutive
{
	public static void main(String args[])
	{
		/*
		clinic.clinicId=1;
		clinic.clinicName="Fortis";
			*/
		Bank bank1=new Bank();
		bank1.accountHolderName="Ananya Sharma";
		bank1.age=24;
		bank1.emailId="ananya.sharma24@gmail.com";
		
		Bank bank2=new Bank();
		bank2.accountHolderName="Rahul Verma";
		bank2.age=27;
		bank2.emailId="rahul.verma28@yahoo.com";
		
		Bank bank3=new Bank();
		bank3.accountHolderName="Priya Nair";
		bank3.age=29;
		bank3.emailId="priya.nair22@gmail.com";
		
		Bank bank4=new Bank();
		bank4.accountHolderName="Arjun Reddy";
		bank4.age=10;
		bank4.emailId="arjun.reddy30@gmail.com";
		
		Bank bank5=new Bank();
		bank5.accountHolderName="Sneha Patil";
		bank5.age=24;
		bank5.emailId="sneha.patil26@gmail.com";
		
		Bank bank6=new Bank();
		bank6.accountHolderName="Kiran Kumar";
		bank6.age=24;
		bank6.emailId="kiran.kumar35@yahoo.com";
		
		Bank bank7=new Bank();
		bank7.accountHolderName="Meera Iyer";
		bank7.age=24;
		bank7.emailId="meera.iyer27@gmail.com";
		
		Bank bank8=new Bank();
		bank8.accountHolderName="Rohit Singh";
		bank8.age=24;
		bank8.emailId="rohit.singh29@gmail.com";
		
		Bank bank9=new Bank();
		bank9.accountHolderName="Pooja Das";
		bank9.age=24;
		bank9.emailId="pooja.das23@yahoo.com";
		
		Bank bank10=new Bank();
		bank10.accountHolderName="Vikram Joshi";
		bank10.age=24;
		bank10.emailId="– vikram.joshi32@gmail.com";
		
		Bank bank11=new Bank();
		bank11.accountHolderName="Neha Gupta";
		bank11.age=24;
		bank11.emailId="neha.gupta25@gmail.com";
		
		Bank bank12=new Bank();
		bank12.accountHolderName="Suresh Babu";
		bank12.age=24;
		bank12.emailId="suresh.babu40@yahoo.com";
		
		Bank bank13=new Bank();
		bank13.accountHolderName="Kavya Shetty";
		bank13.age=24;
		bank13.emailId="kavya.shetty21@gmail.com";
		
		Bank bank14=new Bank();
		bank14.accountHolderName="Deepak Yadav";
		bank14.age=24;
		bank14.emailId="deepak.yadav34@gmail.com";
		
		Bank bank15=new Bank();
		bank15.accountHolderName="Lakshmi Devi";
		bank15.age=24;
		bank15.emailId="lakshmi.devi38@yahoo.com";
		
		Bank bank16=new Bank();
		bank16.accountHolderName="Ramesh Kumar";
		bank16.age=24;
		bank16.emailId="ramesh.kumar45@gmail.com";
		
		Bank bank17=new Bank();
		bank17.accountHolderName="Divya Menon";
		bank17.age=24;
		bank17.emailId="divya.menon28@gmail.com";
		
		Bank bank18=new Bank();
		bank18.accountHolderName="Sanjay Kulkarni";
		bank18.age=24;
		bank18.emailId="sanjay.kulkarni36@yahoo.com";
		
		Bank bank19=new Bank();
		bank19.accountHolderName="Aishwarya Rao";
		bank19.age=24;
		bank19.emailId="aishwarya.rao23@gmail.com";
		
		Bank bank20=new Bank();
		bank20.accountHolderName="Manoj Mishra";
		bank20.age=24;
		bank20.emailId="manoj.mishra31@gmail.com";
		
		AccountHolder accountHolder1=new AccountHolder();
		accountHolder1.location="Jayanagar";
		accountHolder1.balance=5779;
		accountHolder1.bankName="HDFC";
		bank1.accountHolder=accountHolder1;
		bank1.getBankDetails();
		
		/*fan11.capacitor=capacitor11;
		fan11.getFanDetails();*/
		
		AccountHolder accountHolder2=new AccountHolder();
		accountHolder2.location="Rajajinagara";
		accountHolder2.balance=5779;
		accountHolder2.bankName="SBI";
		bank2.accountHolder=accountHolder1;
		bank2.getBankDetails();
		
		AccountHolder accountHolder3=new AccountHolder();
		accountHolder3.location="Dasarahalli";
		accountHolder3.balance=5779;
		accountHolder3.bankName="ICICI";
		bank3.accountHolder=accountHolder3;
		bank3.getBankDetails();
		
		AccountHolder accountHolder4=new AccountHolder();
		accountHolder4.location="8th Main";
		accountHolder4.balance=5779;
		accountHolder4.bankName="Bank of Baroda";
		bank4.accountHolder=accountHolder4;
		bank4.getBankDetails();
		
		AccountHolder accountHolder5=new AccountHolder();
		accountHolder5.location="";
		accountHolder5.balance=5779;
		accountHolder5.bankName="";
		bank5.accountHolder=accountHolder5;
		bank5.getBankDetails();
		
		AccountHolder accountHolder6=new AccountHolder();
		accountHolder6.location="Yeshwanthapur";
		accountHolder6.balance=5779;
		accountHolder6.bankName="ICICI";
		bank6.accountHolder=accountHolder6;
		bank6.getBankDetails();
		
		AccountHolder accountHolder7=new AccountHolder();
		accountHolder7.location="HSR Layout";
		accountHolder7.balance=5779;
		accountHolder7.bankName="HDFC";
		bank7.accountHolder=accountHolder7;
		bank7.getBankDetails();
		
		AccountHolder accountHolder8=new AccountHolder();
		accountHolder8.location="Malleshwaram";
		accountHolder8.balance=5779;
		accountHolder8.bankName="Canara Bank";
		bank8.accountHolder=accountHolder8;
		bank8.getBankDetails();
		
		AccountHolder accountHolder9=new AccountHolder();
		accountHolder9.location="Shivaji Nagar";
		accountHolder9.balance=5779;
		accountHolder9.bankName="SBI";
		bank9.accountHolder=accountHolder9;
		bank9.getBankDetails();
		
		AccountHolder accountHolder10=new AccountHolder();
		accountHolder10.location="Malleshwaram";
		accountHolder10.balance=5779;
		accountHolder10.bankName="Canara Bank";
		bank10.accountHolder=accountHolder10;
		bank10.getBankDetails();
		
		AccountHolder accountHolder11=new AccountHolder();
		accountHolder11.location="Triveni";
		accountHolder11.balance=5779;
		accountHolder11.bankName="Karnataka Bank";
		bank11.accountHolder=accountHolder11;
		bank11.getBankDetails();
		
		AccountHolder accountHolder12=new AccountHolder();
		accountHolder12.location="Nagavara";
		accountHolder12.balance=5779;
		accountHolder12.bankName="Axis Bank";
		bank12.accountHolder=accountHolder12;
		bank12.getBankDetails();
		
		AccountHolder accountHolder13=new AccountHolder();
		accountHolder13.location="";
		accountHolder13.balance=5779;
		accountHolder13.bankName="";
		bank13.accountHolder=accountHolder13;
		bank13.getBankDetails();
		
		AccountHolder accountHolder14=new AccountHolder();
		accountHolder14.location="Koramangala";
		accountHolder14.balance=5779;
		accountHolder14.bankName="Bank of Baroda";
		bank14.accountHolder=accountHolder14;
		bank14.getBankDetails();
		
		AccountHolder accountHolder15=new AccountHolder();
		accountHolder15.location="Indiranagar";
		accountHolder15.balance=5779;
		accountHolder15.bankName="Union Bank of India";
		bank15.accountHolder=accountHolder15;
		bank15.getBankDetails();
		
		AccountHolder accountHolder16=new AccountHolder();
		accountHolder16.location="Whitefield";
		accountHolder16.balance=5779;
		accountHolder16.bankName="Indian Bank";
		bank16.accountHolder=accountHolder16;
		bank16.getBankDetails();
		
		AccountHolder accountHolder17=new AccountHolder();
		accountHolder17.location="Sadashivanagar";
		accountHolder17.balance=5779;
		accountHolder17.bankName="Indian Overseas Bank";
		bank17.accountHolder=accountHolder17;
		bank17.getBankDetails();
		
		AccountHolder accountHolder18=new AccountHolder();
		accountHolder18.location="Bannerghatta Road";
		accountHolder18.balance=5779;
		accountHolder18.bankName="Kotak Mahindra Bank";
		bank18.accountHolder=accountHolder18;
		bank18.getBankDetails();
		
		AccountHolder accountHolder19=new AccountHolder();
		accountHolder19.location="Hebbal";
		accountHolder19.balance=5779;
		accountHolder19.bankName="IndusInd Bank";
		bank19.accountHolder=accountHolder19;
		bank19.getBankDetails();
		
		AccountHolder accountHolder20=new AccountHolder();
		accountHolder20.location="Mysore Road";
		accountHolder20.balance=5779;
		accountHolder20.bankName="Federal Bank";
		bank20.accountHolder=accountHolder20;
		bank20.getBankDetails();
	
	}
}