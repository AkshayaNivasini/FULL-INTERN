
public class Car {

	static String cartype="Diesel";
	static String carcompany="Maruthi";

	Car(String version,int modelnumber)
	{

		System.out.println("The version"+" "+version+" "+"of company" +" "+carcompany);
	}

}
class Vehcile extends Car
{
	Vehcile(String version,int modelnumber)
	{
		super(version, modelnumber);
	}
	public void releaseyear()
	{
		System.out.println("The car is released in 2016");

	}
	public static void main(String args[])
	{
		Vehcile v=new Vehcile("1.7x",20);
		v.releaseyear();
		System.out.println("The car type is"+" "+cartype);
		System.out.println("The car company is"+" "+carcompany);


	}
}