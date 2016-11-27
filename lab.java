//ANANNYA UBEROI (2015014)
//SURIL MEHTA (2015104)

class Vehicle
{
	private String val;
	String modelName, ownerName;
	int numberOfWheels;
	Policy p;
	int count;
	Vehicle(){}
	
	Vehicle(String model, String owner, int wheels)
	{
		setModelName(model);
		setOwnerName(owner);
		setNumberOfWheels(wheels);
	}
	
	Vehicle(String model, String owner, int wheels, int d, int m, int y, char t, int policy_number)
	{
		setModelName(model);
		setOwnerName(owner);
		setNumberOfWheels(wheels);
		p=new Policy(d,m,y,t,policy_number);
		count=xyz();
	}
	
	public int xyz()
	{
		if ((p.checkIfValid()==true)&&(p.getType()=='t'))
			{
			return 1;
			}
		else if ((p.checkIfValid()==false)&&(p.getType()=='t'))
			{
			return 2;
			}
		else if ((p.checkIfValid()==true)&&(p.getType()=='p'))
			{
			return 3;
			}
		else if ((p.checkIfValid()==false)&&(p.getType()=='p'))
			{
			return 4;
			}
		else
			return 0;
		
	}
	
	public int getDate(Vehicle v)
	{
		return v.p.expirationDD;
	}
	
	public int getMonth(Vehicle v)
	{
		return v.p.expirationMM;
	}
	public int getYear(Vehicle v)
	{
		return v.p.expirationYYYY;
	}
	
	public void setModelName(String m)
	{
	        this.modelName=m;
	}
	 
	 public void setOwnerName(String o)
	 {
	        this.ownerName=o;
	 }
	 
	 public void setNumberOfWheels(int w)
	 {
	        this.numberOfWheels=w;
	 }
}

class EnginePowered extends Vehicle
{
	EnginePowered(String model, String owner, int wheels, int d, int m, int y, char t, int policy_number)
	{
		super(model, owner, wheels, d, m, y, t, policy_number);
	}
	
	Policy p;
}

class Cycle extends Vehicle
{
	Cycle(String model, String owner, int wheels)
	{
		super(model, owner, wheels);
	}
}

class TwoWheeler extends EnginePowered
{
	TwoWheeler(String model, String owner, int wheels, int d, int m, int y, char t, int policy_number)
	{
		super(model, owner, wheels, d, m, y, t, policy_number);
	}
}

class FourWheeler extends EnginePowered
{
	FourWheeler(String model, String owner, int wheels, int d, int m, int y, char t, int policy_number)
	{
		super(model, owner, wheels, d, m, y, t, policy_number);
	}
	
	
}


class ThirdPartyPolicy extends Policy
{
	ThirdPartyPolicy(int d, int m, int y, int pn) {
		super(d, m, y, 'T', pn);
	}	
}

class PackagePolicy extends Policy
{
	PackagePolicy(int d, int m, int y, int pn) {
		super(d, m, y, 'P', pn);
	}
}

class Policy
{
	int expirationDD;
	int expirationMM;
	int expirationYYYY;
	int policyNumber;
	char type;
	
	Policy (int d, int m, int y, char t, int pn)
	{
		setExpirationDate(d,m,y,t);
		setPolicyNumber(pn);
	}
	
	public char getType()
	{
		return this.type;
	}
	
public void setExpirationDate(int dd, int mm, int yyyy, char t)
{
	 {
	        this.expirationDD=dd;
	        this.expirationMM=mm;
	        this.expirationYYYY=yyyy;
	        this.type=t;
	 }
}

public void setPolicyNumber(int policy_number)
{
	this.policyNumber=policy_number;
}

public boolean checkIfValid()
{
	if (this.expirationYYYY<2016)
		return false;
	else if (this.expirationMM<8)
		return false;
	else if (this.expirationDD<28)
		return false;
	else
		return true;
}
}


class Pulsar extends TwoWheeler
{

	Pulsar(String model, String owner, int wheels, int d, int m, int y, char t, int pn)
	{
		super(model, owner, wheels, d, m, y, t, pn);
	}
	

}

class Honda extends TwoWheeler
{

	Honda(String model, String owner, int wheels, int d, int m, int y, char t, int pn)
	{
		super(model, owner, wheels, d, m, y, t, pn);
	}
	
	
}

class Audi extends FourWheeler
{

	Audi(String model, String owner, int wheels, int d, int m, int y, char t, int pn)
	{
		super(model, owner, wheels, d, m, y, t, pn);
	}
	
	
}

class Mercedes extends FourWheeler
{

	Mercedes(String model, String owner, int wheels, int d, int m, int y, char t, int pn)
	{
		super(model, owner, wheels, d, m, y, t, pn);
	}
	
	
}

class Hero extends Cycle
{

	Hero(String model, String owner, int wheels)
	{
		super(model, owner, wheels);
	}
	
	
}

class BMX extends Cycle
{
	BMX(String model, String owner, int wheels)
	{
		super(model, owner, wheels);
	}
}

class MyException extends Exception
{
	MyException(String message)
	{
		super(message);
	}
}


public class lab
{
	
	public static void collideSettle(Vehicle self, Vehicle oncoming)
	 {
			double damage_self=(int)(Math.random()*(40))+0;
			System.out.println("Damages self: "+damage_self);
			double damage_oncoming=(int)(Math.random()*(40))+0;
			System.out.println("Damages oncoming: "+damage_oncoming+"\n");
			System.out.println("Settlement details:");	
			//System.out.println("Count is "+self.count);
			//System.out.println("Owner is "+self.modelName);
			try
			{
			if (self.count==1)
			{
				damage_oncoming=0.2*(damage_oncoming);
				System.out.println("Oncoming vehicle damage status: "+damage_oncoming);
				System.out.println("Self damage status: "+damage_self);
			}
			else if (self.count==3)
			{
				damage_oncoming=0.2*(damage_oncoming);
				damage_self=0.5*(damage_self);
				System.out.println("Oncoming vehicle damage status: "+damage_oncoming);
				System.out.println("Self damage status: "+damage_self);
			}
			else if (self.count==2)
			{
				throw new MyException("Sorry\nExpired (Invalid) third party policy.");				
			}
			else if (self.count==4)
			{
				throw new MyException("Sorry\nExpired (Invalid) package policy.");
			}
			else
			{
				throw new MyException("Sorry\nCycle has no policy.");
			}
			}
			catch(MyException e)
			{
				System.out.println(e.getMessage());
			}
			finally {}
			
	 }
	
public static void main(String[] args)
{
	Vehicle[] v=new Vehicle[6];
	for (int i=0;i<6;i++)
		v[i]=new Vehicle();
	
	
	 v[0]=new Audi("Audi Model Z","Vineet",4,5,8,2016,'p',12114);
	 v[1]=new Mercedes("Mercedes Cabriolet","Rachel",4,30,9,2017,'p',56777);
	 v[2]=new Honda("Honda Z","Sammy",2,1,2,2010,'t',78790);
	 v[3]=new Pulsar("Pulsar AS200","Rajesh",2,14,2,2020,'p',13872);
	 v[4]=new BMX("BMX Pandora 12","Renu",2);
	 v[5]=new Hero("Hero Elite 2","Steve",2);

	 System.out.println("Tabular details of vehicles created:\n");
	 System.out.format("%-20s%-15s%-18s%-20s%-15s%-15s\n","Model Number","Owner Name","Number of Wheels","Policy Type","Expiration Date","Policy Number");
	 
	 for (int x=0;x<4;x++)
		 	{
		 	System.out.format("%-20s%-15s%-18d",v[x].modelName,v[x].ownerName,v[x].numberOfWheels);
		 	if (v[x].p.type=='p')
		 			System.out.format("%-20s%5d%s%-2d%s%-8d%-15d\n","Package Policy",v[x].p.expirationDD,"/",v[x].p.expirationMM,"/",v[x].p.expirationYYYY,v[x].p.policyNumber);
		 	else if (v[x].p.type=='t')
	 				System.out.format("%-20s%5d%s%-2d%s%-8d%-15d\n","Third Party Policy",v[x].p.expirationDD,"/",v[x].p.expirationMM,"/",v[x].p.expirationYYYY,v[x].p.policyNumber);
		 	}
	 for (int x=4;x<6;x++)
			System.out.format("%-20s%-15s%-18s%-20s%-15s%-15s\n",v[x].modelName,v[x].ownerName,v[x].numberOfWheels,"NA","NA","NA");
	 
	 
	 for (int i=0;i<6;i++)
	 {
	 for (int j=0;j<6;j++)
		{
		if (i!=j)
			{
			System.out.println("I am "+v[i].modelName+", "+v[i].ownerName+", collided with "+v[j].modelName+", "+v[j].ownerName);
			collideSettle(v[i],v[j]);
			}
		System.out.println("---------------------------------------------------");
		}
	 }
}
}