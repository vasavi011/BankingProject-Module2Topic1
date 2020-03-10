package BankingPackage;

public class Branch {
int branchId;
String locationId;

/*Branch()
{
	
}*/
Branch(int branchId, String locationId)
{
	System.out.println(" arg user defined constructer");
	this.branchId=branchId;
	this.locationId=locationId;	
}
void display()
{
	System.out.println("Branch Id :" +branchId);
	System.out.println("Location Id:" +locationId);
}
public static void main (String[] args)
{
	Branch b1 = new Branch(111, "RingRoad");
	b1.display();
	Branch b2 = new Branch(222,"Machavaram");
	b2.display();
}
}
