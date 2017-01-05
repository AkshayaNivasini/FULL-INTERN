
class Start implements OvenFunctions // implementing the interface
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