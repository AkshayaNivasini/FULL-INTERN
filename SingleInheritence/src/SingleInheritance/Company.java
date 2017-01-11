package SingleInheritance;

//Single inheritance
public class Company 
{

	public static void main(String[] args)
	{

		Company employee=new Company();
		employee.working();
		employee.meeting();
		employee.eating();
		Students intern=new Students();
		intern.learning();
		intern.watching();
	}

	public void working()
	{
		int numofemployess=250;
		System.out.println("The employee is working"+" " +numofemployess);
	}
	public void meeting()
	{
		String name="CWA";
		System.out.println("name of the team attending meeting"+" "+name);
	}
	public void eating()
	{
		String time="12.32pm";
		System.out.println("time for lunch"+" "+time);
	}

}
class Students extends Company
{
	public void learning()
	{
		int number=10;
		System.out.println("number of interns learning java"+" "+number);
	}
	public void watching()
	{
		String name="CWA interns";
		System.out.println("Which team is watching full internship videos?"+" "+name);


	}

}



