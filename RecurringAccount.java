package BankingPackage;

public class RecurringAccount extends Account {
	int accountNumber;
	
	public static void main (String[] args)
	{
		RecurringAccount r1 = new RecurringAccount();
		System.out.println(r1 instanceof RecurringAccount);
		System.out.println(r1 instanceof Account);

		if(r1 instanceof RecurringAccount)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	}
}
