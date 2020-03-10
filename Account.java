package BankingPackage;

public class Account 
{
public static int accountNumberId= 10000;
private int accountNumber;
String accountType;
int accountBalance;
String userName;
int ifscCode;
Account()
{	//System.out.println("no-arg constructor"); 
	
}
Account( String actype)
{	
	this.accountNumber = generateAccountNumber();
	this.accountType=actype;
}
public static int generateAccountNumber()//private to public
{
	++accountNumberId;
	return accountNumberId;
}
public int getAccountNumber()
{
	return accountNumber;
}
public String getAccountType()
{
	return accountType;
}
Account(int ifscCode)
{
	System.out.println("1-arg constructor");
	System.out.println("ifsc code :"  +ifscCode);
}
Account (int accountNumber, String accountType, int accountBalance,String userName )
{
	System.out.println("4 -arg constructor");
}
public static void main(String[] args)
{
Account a1 = new Account();
Account a2 = new Account(11);
Account a3 = new Account(123456, "Savings", 1000,"vasavi");
}
}


	
