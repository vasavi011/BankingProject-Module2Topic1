package BankingPackage;

public class Services {
	int accountNumber;
	int cbilScore;
	int period;
	float rateOfInterest;
	
	Services(int accountNumber, int cbilScore, int period, float rateOfInterest)
	{
		this.accountNumber = accountNumber;
		this.cbilScore = cbilScore;
		this.period = period;
		this.rateOfInterest = rateOfInterest;
	}
	void assign(int accountNumber, int cbilScore, int period, float rateOfInterest)
	{
		this.accountNumber = accountNumber;
		this.cbilScore = cbilScore;
		this.period = period;
		this.rateOfInterest = rateOfInterest;
	}
	void disp()
	{
		System.out.println("****Services****");
		System.out.println("accountNumber:"+accountNumber);
		System.out.println("cilbilScore" +cbilScore);
		System.out.println("period" +period);
		System.out.println("rate Of Interest" +rateOfInterest);

	}
	public static void main(String[] args)
	{
		Services s1 = new Services(123456,9,5,2.5f);
		s1.assign(1111, 8 , 2, 23.2f);
		s1.disp();
		Services s2 = new Services(256899,5,5,5.2f);
		s2.disp();
		//here where we place disp then there output will be displayed
		//construcor adn method both are same.
	}
}
