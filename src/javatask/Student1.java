package javatask;

public class Student1 
{
	int Studentid;
	
	String name;
	
	double examfee;
	
	public String displayDetails()
	{
		return name;
		
	}
	public double Payfee()
	{
		return examfee;
	}

Student1()
{
	this.Studentid=101;
	this.name="naveen";
    this.examfee=1500.0;
}
	
}
class Dayscholar extends Student1
{
	double transportfee;
	
	Dayscholar(double transportfee)
	{
		
		this.transportfee = transportfee;
	}
	
}

class Hostler extends Student1
{
	double hostelfee;

	Hostler(double hostelfee)
	{
		
		this.hostelfee = hostelfee;
	}

public String displayDetails()
{
	System.out.println(name);
	
	System.out.println(Studentid);
	
	System.out.println(examfee);
	
	return name;
	
}
}

 class Statement2 {

	public static void main(String[] args) 
	{
		
		Hostler s1=new Hostler(5000.0);
		
		Dayscholar d=new Dayscholar(1000.0);
		
		s1.displayDetails();
		
		d.displayDetails();

		
	}

}
