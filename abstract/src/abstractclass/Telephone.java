package abstractclass;


abstract class Telephone
{
	abstract void call();
	public void normal()
	{
		System.out.println("This was a normal call");
	}  
}
class Mobile extends Telephone
{
	void call()
	{
		System.out.println("callme"); 
	}
	public static void main(String[] args)
	{
		Mobile girl = new Mobile();
		girl.call();
		girl.normal();
	}
}