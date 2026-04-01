class FanExecutor
{
	public static void main(String args[])
	{
		Fan fan1=new Fan();
		/*
		clinic.clinicId=1;
		clinic.clinicName="Fortis";
			*/
		fan1.brand="Colorbot";
		fan1.colour="Red";
		fan1.electricFanDesign="Ceiling Fan";
		fan1.powerSource="Corded Electric";
		fan1.style="Modern";
		fan1.prize=268;
		
		Fan fan2=new Fan();
		fan2.brand="Usha";
		fan2.colour="White";
		fan2.electricFanDesign="Ceiling Fan";
		fan2.powerSource="AC powered";
		fan2.style="Modern";
		fan2.prize=268;
		
		Fan fan3=new Fan();
		fan3.brand="Havells";
		fan3.colour="Brown";
		fan3.electricFanDesign="Ceiling Fan";
		fan3.powerSource="Table Electric";
		fan3.style="Modern";
		fan3.prize=2578;
		
		Fan fan4=new Fan();
		fan4.brand="Crompton";
		fan4.colour="Ivory";
		fan4.electricFanDesign="Table Fan";
		fan4.powerSource="Corded Electric";
		fan4.style="Modern";
		fan4.prize=2636;
		
		Fan fan5=new Fan();
		fan5.brand="Orient Electric";
		fan5.colour="Black";
		fan5.electricFanDesign="Wall-mounted fan";
		fan5.powerSource="AC powered";
		fan5.style="Modern";
		fan5.prize=2627;
		
		Fan fan6=new Fan();
		fan6.brand="Bajaj";
		fan6.colour="Blue";
		fan6.electricFanDesign="Table Fan";
		fan6.powerSource="AC powered";
		fan6.style="Modern";
		fan6.prize=2682;
		
		Fan fan7=new Fan();
		fan7.brand="Atomberg";
		fan7.colour="White";
		fan7.electricFanDesign="Ceiling Fan";
		fan7.powerSource="AC powered";
		fan7.style="Modern";
		fan7.prize=2657;
		
		Fan fan8=new Fan();
		fan8.brand="Luminous";
		fan8.colour="Grey";
		fan8.electricFanDesign="Ceiling Fan";
		fan8.powerSource="AC powered";
		fan8.style="Modern";
		fan8.prize=268;
		
		Fan fan9=new Fan();
		fan9.brand="V-Guard";
		fan9.colour="Cream";
		fan9.electricFanDesign="Ceiling Fan";
		fan9.powerSource="AC powered";
		fan9.style="Modern";
		fan9.prize=268;
		
		Fan fan10=new Fan();
		fan10.brand="Khaitan";
		fan10.colour="White";
		fan10.electricFanDesign="Exhaust Fan";
		fan10.powerSource="AC powered";
		fan10.style="Modern";
		fan10.prize=268;
		
		Fan fan11=new Fan();
		fan11.brand="Panasonic";
		fan11.colour="Silver";
		fan11.electricFanDesign="Pedestal Fan";
		fan11.powerSource="Corded Electric";
		fan11.style="Modern";
		fan11.prize=268;
		
		Fan fan12=new Fan();
		fan12.brand="Dyson";
		fan12.colour="White & Silver";
		fan12.electricFanDesign="Bladeless tower Fan";
		fan12.powerSource="Corded Electric";
		fan12.style="Modern";
		fan12.prize=268;
		
		Fan fan13=new Fan();
		fan13.brand="White";
		fan13.colour="Ceiling Fan";
		fan13.electricFanDesign="Smart pedesta Fan";
		fan13.powerSource="Corded Electric";
		fan13.style="Modern";
		fan13.prize=268;
		
		Fan fan14=new Fan();
		fan14.brand="Honeywell";
		fan14.colour="Black";
		fan14.electricFanDesign="Tower Fan";
		fan14.powerSource="AC Electric";
		fan14.style="Modern";
		fan14.prize=268;
		
		Fan fan15=new Fan();
		fan15.brand="Morphy Richards";
		fan15.colour="Black";
		fan15.electricFanDesign="Table Fan";
		fan15.powerSource="AC Electric";
		fan15.style="Modern";
		fan15.prize=268;
		
		Fan fan16=new Fan();
		fan16.brand="USHA Mist Air";
		fan16.colour="White";
		fan16.electricFanDesign="Pedestal Fan";
		fan16.powerSource="AC Electric";
		fan16.style="Modern";
		fan5.prize=268;
		
		Fan fan17=new Fan();
		fan17.brand="Syska";
		fan17.colour="White";
		fan17.electricFanDesign="Table Fan";
		fan17.powerSource="AC";
		fan17.style="Modern";
		fan17.prize=268;
		
		Fan fan18=new Fan();
		fan18.brand="Amazon Basics";
		fan18.colour="Black";
		fan18.electricFanDesign="Pedestal Fan";
		fan18.powerSource="AC";
		fan18.style="Modern";
		fan18.prize=268;
		
		Fan fan19=new Fan();
		fan19.brand="Geek Aire";
		fan19.colour="Yellow";
		fan19.electricFanDesign="Portable Fan";
		fan19.powerSource="AC";
		fan19.style="Modern";
		fan19.prize=268;
		
		Fan fan20=new Fan();
		fan20.brand="OPOLAR";
		fan20.colour="Pink";
		fan20.electricFanDesign="Handheld Fan";
		fan20.powerSource="Rechargeable battery powered";
		fan20.style="Modern";
		fan20.prize=268;
		
		Capacitor capacitor1=new Capacitor();
		capacitor1.capacitance="2.5 Picpfarad";
		capacitor1.brand="Havells";
		capacitor1.material="Polypropylene";
		capacitor1.shape="Cylindrical";
		capacitor1.operatingVoltage="440 Volts";
		fan1.capacitor=capacitor1;
		fan1.getFanDetails();
		
		Capacitor capacitor2=new Capacitor();
		capacitor2.capacitance="3.5 Picpfarad";
		capacitor2.brand="Usha";
		capacitor2.material="Polypropylene";
		capacitor2.shape="Cylindrical";
		capacitor2.operatingVoltage="440 Volts";
		fan2.capacitor=capacitor2;
		fan2.getFanDetails();
		
		Capacitor capacitor3=new Capacitor();
		capacitor3.capacitance="4 Picpfarad";
		capacitor3.brand="Crompton";
		capacitor3.material="Polypropylene";
		capacitor3.shape="Cylindrical";
		capacitor3.operatingVoltage="440 Volts";
		fan3.capacitor=capacitor3;
		fan3.getFanDetails();
		
		Capacitor capacitor4=new Capacitor();
		capacitor4.capacitance="2 Picpfarad";
		capacitor4.brand="Bajaj";
		capacitor4.material="Polyester";
		capacitor4.shape="Cylindrical";
		capacitor4.operatingVoltage="200 Volts";
		fan4.capacitor=capacitor4;
		fan4.getFanDetails();
		
		Capacitor capacitor5=new Capacitor();
		capacitor5.capacitance="5 Picpfarad";
		capacitor5.brand="Orient Electric";
		capacitor5.material="Polypropylene";
		capacitor5.shape="Rectangular";
		capacitor5.operatingVoltage="440 Volts";
		fan5.capacitor=capacitor5;
		fan5.getFanDetails();
		
		Capacitor capacitor6=new Capacitor();
		capacitor6.capacitance="120 Picpfarad";
		capacitor6.brand="V-Guard";
		capacitor6.material="Polypropylene";
		capacitor6.shape="Cylindrical";
		capacitor6.operatingVoltage="460 Volts";
		fan6.capacitor=capacitor6;
		fan6.getFanDetails();
		
		Capacitor capacitor7=new Capacitor();
		capacitor7.capacitance="3.5 Picpfarad";
		capacitor7.brand="Luminous";
		capacitor7.material="Polyester";
		capacitor7.shape="Round";
		capacitor7.operatingVoltage="100 Volts";
		fan7.capacitor=capacitor7;
		fan7.getFanDetails();
		
		Capacitor capacitor8=new Capacitor();
		capacitor8.capacitance="1.9 Picpfarad";
		capacitor8.brand="Panasonic";
		capacitor8.material="Polypropylene";
		capacitor8.shape="Round";
		capacitor8.operatingVoltage="100 Volts";
		fan8.capacitor=capacitor8;
		fan8.getFanDetails();
		
		Capacitor capacitor9=new Capacitor();
		capacitor9.capacitance="4.9 Picpfarad";
		capacitor9.brand="Khaitan";
		capacitor9.material="Polypropylene";
		capacitor9.shape="Round";
		capacitor9.operatingVoltage="100 Volts";
		fan9.capacitor=capacitor9;
		fan9.getFanDetails();
		
		Capacitor capacitor10=new Capacitor();
		capacitor10.capacitance="120 Picpfarad";
		capacitor10.brand="Khaitan";
		capacitor10.material="Polypropylene";
		capacitor10.shape="Cylindrical";
		capacitor10.operatingVoltage="100 Volts";
		fan10.capacitor=capacitor10;
		fan10.getFanDetails();
		
		Capacitor capacitor11=new Capacitor();
		capacitor11.capacitance="120 Picpfarad";
		capacitor11.brand="Syska";
		capacitor11.material="Polypropylene";
		capacitor11.shape="Cylindrical";
		capacitor11.operatingVoltage="100 Volts";
		fan11.capacitor=capacitor11;
		fan11.getFanDetails();
		
		Capacitor capacitor12=new Capacitor();
		capacitor12.capacitance="120 Picpfarad";
		capacitor12.brand="Anchor";
		capacitor12.material="Polypropylene";
		capacitor12.shape="Round";
		capacitor12.operatingVoltage="100 Volts";
		fan12.capacitor=capacitor12;
		fan12.getFanDetails();
		
		Capacitor capacitor13=new Capacitor();
		capacitor13.capacitance="4.9 Picpfarad";
		capacitor13.brand="Finolex";
		capacitor13.material="Polyester";
		capacitor13.shape="Cylindrical";
		capacitor13.operatingVoltage="360 Volts";
		fan13.capacitor=capacitor13;
		fan13.getFanDetails();
		
		Capacitor capacitor14=new Capacitor();
		capacitor14.capacitance="120 Picpfarad";
		capacitor14.brand="Polycab";
		capacitor14.material="Polypropylene";
		capacitor14.shape="Cylindrical";
		capacitor14.operatingVoltage="260 Volts";
		fan14.capacitor=capacitor14;
		fan14.getFanDetails();
		
		Capacitor capacitor15=new Capacitor();
		capacitor15.capacitance="120 Picpfarad";
		capacitor15.brand="Schneider Electric";
		capacitor15.material="Polypropylene";
		capacitor15.shape="Cylindrical";
		capacitor15.operatingVoltage="680 Volts";
		fan15.capacitor=capacitor15;
		fan15.getFanDetails();
		
		Capacitor capacitor16=new Capacitor();
		capacitor16.capacitance="120 Picpfarad";
		capacitor16.brand="ABB";
		capacitor16.material="Polyester";
		capacitor16.shape="Cylindrical";
		capacitor16.operatingVoltage="350 Volts";
		fan16.capacitor=capacitor16;
		fan16.getFanDetails();
		
		Capacitor capacitor17=new Capacitor();
		capacitor17.capacitance="120 Picpfarad";
		capacitor17.brand="EPCOS";
		capacitor17.material="Polypropylene";
		capacitor17.shape="Rectangular";
		capacitor17.operatingVoltage="460 Volts";
		fan17.capacitor=capacitor17;
		fan17.getFanDetails();
		
		Capacitor capacitor18=new Capacitor();
		capacitor18.capacitance="120 Picpfarad";
		capacitor18.brand="Wipro";
		capacitor18.material="Polypropylene";
		capacitor18.shape="Rectangular";
		capacitor18.operatingVoltage="280 Volts";
		fan18.capacitor=capacitor18;
		fan18.getFanDetails();
		
		Capacitor capacitor19=new Capacitor();
		capacitor19.capacitance="120 Picpfarad";
		capacitor19.brand="Siemens";
		capacitor19.material="Polyester";
		capacitor19.shape="Round";
		capacitor19.operatingVoltage="570 Volts";
		fan19.capacitor=capacitor19;
		fan19.getFanDetails();
		
		Capacitor capacitor20=new Capacitor();
		capacitor20.capacitance="120 Picpfarad";
		capacitor20.brand="Delta";
		capacitor20.material="Polypropylene";
		capacitor20.shape="Rectangular";
		capacitor20.operatingVoltage="580 Volts";
		fan20.capacitor=capacitor20;
		fan20.getFanDetails();
	}
}