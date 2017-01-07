package poly1;//Overriding //Compile time or static polymorphism 

public class HumanBeing {
	
	
	public void mood(String mood)
	{
		System.out.println("Girl is " +mood);
	}
}
class Boy extends HumanBeing
{
	public void mood(String mood)
	{
		System.out.println("Boy is " +mood);
	}
	public static void main(String args[])
	{
		HumanBeing girl=new HumanBeing();
	    girl.mood("Happy");
	    HumanBeing boy=new Boy();
	    boy.mood("Angry");
	    
	}
}
