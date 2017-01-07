package poly;// Overloading // Run time or dynamic polymorphism 

public class Girls {

	public static void main(String[] args) {
		
		Girls girl=new Girls();
		girl.baby(5);
		girl.baby(18,"lady","major");
		girl.baby(40,"woman");	

	}
public void baby(int a)
{
	System.out.println("When the age is " +a+ " "+ "she is a girl");
}
public void baby(int b,String s,String e)
{
	System.out.println("When the age is " +b+ " "+ "she is a " +s+ " "+ " and she is a"+e);
}
public void baby(int c,String d)
{
	System.out.println("When the age is " +c+ " "+ "she is a "+d);
}
}
