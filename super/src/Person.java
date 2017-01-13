
public class Person
{

	public void lastname()
	{
		String lastname="A M";
		System.out.println(lastname);
	}
}
class Name extends Person
{

	public void firstname()
	{


		String firstname="Akshaya Nivasini";
		System.out.println(firstname);

	}

	void display()
	{
		super.lastname();
		firstname();

	}

	public static void main(String[] args)
	{

		Name n=new Name();
		n.display();

	}

}
