//main class
public class MicrowaveOven {
	public static void main(String[] args) { // object creation and function calling
		start s=new start();//creating object for parent class
		s.openDoor();//calling the parent class functions
		s.placeBowl();
		s.closeDoor();
		s.settemp();
		stop s1=new stop();//creating object for child class
		s1.closedoor();//calling the child class functions
		s1.checktemp();
		s1.openDoor();
		s1.closeDoor();
		 
	}
}
class start implements OvenFunctions // implementing the interface
// Parent class

{
	public void openDoor()// interface method
	{
		System.out.println("Open the door");
	}
	public void placeBowl()
	{
		System.out.println("Place the bowl inside MicrowaveOven with bread ");
	}
	public void closeDoor()
	{
		System.out.println("After placing close the door");
	}
   public void settemp()
   {
	   System.out.println("Set temperature as 15 degree");
   }
}
class stop extends start // child class

{
	public void closedoor()// overriding parent method
	{
		System.out.println("close the door after set the temperature");
	}
	public void checktemp()
	{
		System.out.println("check the temperature");
	}
    public void openDoor()
    {
    	System.out.println("open the door and check whether the bread has toasted");
    }
    public void closeDoor()
    {
    	System.out.println("close the door after taking the bowl out");
    }
}