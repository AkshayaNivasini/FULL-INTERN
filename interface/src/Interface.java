
public class Interface
{

	public void prepare()
	{
		System.out.println("Prepare chapathi");
	}
}
class Chapathi implements WheatMix
{
	public void mixBatter()
	{
		System.out.println("Mix batter to make chapathi");

	}	
}
class Poori extends Chapathi
{
	public void mixBatter1()
	{
		System.out.println("Mix batter to make poori");
	}

	public static void main(String[] args) {


		Interface i=new Interface();
		i.prepare();
		Poori p=new Poori();
		p.mixBatter1();
		p.mixBatter();

	}


}
