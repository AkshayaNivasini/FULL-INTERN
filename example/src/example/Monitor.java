package example;
abstract class Access
{    
abstract void admin(String s); 
void user(String a)
{
	
}
} 

class Monitor extends Access
{    
	public void admin(String s)
	{
		System.out.println("For accessing " +s+"  " +"we need permission");
	}
	public void user(String a)
	{
		System.out.println("For accessing " +a+ " " +"we do not need permission");
	}

public static void main(String args[])
{
	Monitor m=new Monitor();
	m.admin("Admin");
	m.user("User");
}
}

 