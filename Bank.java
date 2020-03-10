package BankingPackage;

public class Bank {
int bankId;
String bankName;
int bankifscCode;

Bank()
{
	bankId = 123456;
	bankName = "Andhra Bank";
	bankifscCode = 456789;
	//probles same valus for every object that why we have parameterized constructors
}
void display()
{
	System.out.println("***Bank Details***");
	System.out.println("bank ID :" +bankId);
	System.out.println("bankName:"+bankName);
	System.out.println("bankifscCode : "+bankifscCode);

}
public static void main (String[] args)
{
	Bank b1 = new Bank();
	b1.display();
	Bank b2 = new Bank();
	b2.display();
}
}
