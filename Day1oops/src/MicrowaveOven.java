//main class
public class MicrowaveOven {
	public static void main(String[] args) { // object creation and function calling
		Start s=new Start();//creating object for parent class
		s.openDoor();//calling the parent class functions
		s.placeBowl();
		s.closeDoor();
		s.settemp();
		Stop s1=new Stop();//creating object for child class
		s1.closedoor();//calling the child class functions
		s1.checktemp();
		s1.openDoor();
		s1.closeDoor();
		 
	}
}

