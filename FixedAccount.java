package BankingPackage;

public class FixedAccount extends Account {
	int accountNumber;
	
	
	FixedAccount(String acType)
	{
		this.accountNumber = generateAccountNumber();
		this.accountType = acType;
	}
	/*FixedAccount(int accountNumber){
		this.accountNumber=generateAccountNumber();
	}*/
	/*void display()
	{
		System.out.println("***Fixed Account***");
		//System.out.println("accountNumber" +accountNumber);
	}*/
	public static void main (String[] args)
	{
		FixedAccount f1 = new FixedAccount("Rajeevi Fixed ");
		FixedAccount f2 = new FixedAccount("Vasavi Fixed ");
		//f1.display();
		System.out.println("Fixed account Number is:"+ f1.getAccountNumber() + f1.getAccountType());
		System.out.println("Fixed account Number is:"+ f2.getAccountNumber() + f2.getAccountType());

		
	}
}
