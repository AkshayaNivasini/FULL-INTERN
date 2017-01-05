
class Stop extends Start // child class

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