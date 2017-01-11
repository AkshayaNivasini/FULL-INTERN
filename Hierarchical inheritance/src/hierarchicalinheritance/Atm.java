package hierarchicalinheritance;

public class Atm 
{
	public void withdrawl()
	{
		System.out.println("Draw money from Atm");
	}

}
class Banking extends Atm
{
	public void deposit()
	{
		System.out.println("Deposit money");
	}
}
class MiniStatements extends Banking
{
	public void receipt()
	{
		System.out.println("Get receipt");
	}

	public static void main(String args[])
	{
		MiniStatements a=new MiniStatements();
		a.withdrawl();
		a.deposit();
		a.receipt();
	}
}

