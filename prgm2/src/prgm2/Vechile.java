package prgm2;

public class Vechile {
	 
	
	public void move()
	{
		int speed=100;
		System.out.println("The car is moving at a speed of" +" "+speed);
		
	}
	
	
	public void brake()
	{
		String colour="RED";
		System.out.println("The colour of the truck is"+" " +colour);
	}
	


public static void main(String args[])
{
	Vechile car=new Vechile();
	car.move();
    Vechile truck=new Vechile();
    truck.brake();
}
}
